/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gateway;

import config.ConfigJDBC;
import entity.Produto;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josedi
 */
public class ProdutoGateway {

    private ConfigJDBC configJDBC = new ConfigJDBC();

    public Boolean productExist(Integer prodCod) throws SQLException {
        if (prodCod == null || prodCod <= 0) {
            return false;
        }
        String sql = "SELECT 1 FROM Produtos WHERE pcod = ?";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, prodCod);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    public Produto consultaProduto(Integer codProd) throws SQLException {
        Produto produto = null;
        String sql = "SELECT pcod, pdescription, ppreco FROM Produtos WHERE pcod = ?";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

             productExist(codProd);
            stmt.setInt(1, codProd);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                produto = new Produto(
                        rs.getInt("pcod"),
                        rs.getString("pdescription"),
                        rs.getBigDecimal("ppreco"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return produto;
    }

    public List<Produto> mostraTodosProdutos() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM Produtos";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Integer pcod = rs.getInt("pcod");
                String pdescription = rs.getString("pdescription");
                BigDecimal ppreco = rs.getBigDecimal("ppreco");

                produtos.add(new Produto(pcod, pdescription, ppreco));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public void cadastrarProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO Produtos (pdescription, ppreco) VALUES (?,?)";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getPDescription());
            stmt.setBigDecimal(2, produto.getPPreco());

            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int codigoGerado = generatedKeys.getInt(1);
                    produto.setPCod(codigoGerado);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Produto editarProduto(Produto produto) throws SQLException {
        String sql = "UPDATE Produtos SET pdescription = COALESCE(?,pdescription), ppreco = COALESCE(?,ppreco) WHERE pcod = ?";

        Connection conn = configJDBC.createConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setObject(1, produto.getPDescription().isEmpty() ? null : produto.getPDescription());
        stmt.setObject(2, produto.getPPreco().compareTo(BigDecimal.ZERO) == 0 ? null : produto.getPPreco());
        stmt.setInt(3, produto.getPCod());

        stmt.executeUpdate();
        
        return produto;
    }

    public void deletarProduto(Integer prodCod) {
        String sql = "DELETE FROM Produtos WHERE pcod = ?";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, prodCod);

            productExist(prodCod);
            int rowsAffected = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar cliente: " + e.getMessage());
        }
    }

}
