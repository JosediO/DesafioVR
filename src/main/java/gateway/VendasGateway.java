/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gateway;

import config.ConfigJDBC;
import entity.ItemVenda;
import entity.Venda;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josedi
 */
public class VendasGateway {

    private ConfigJDBC configJDBC = new ConfigJDBC();

    public List<Venda> mostrarTodasVendas() throws SQLException {
        List<Venda> vendas = new ArrayList<>();
        String sql = "SELECT * FROM Vendas";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Integer codigoVenda = rs.getInt("codigoVenda");
                Integer codigoCliente = rs.getInt("codigoCliente");
                LocalDate dataVenda = rs.getDate("data_venda").toLocalDate();
                BigDecimal total = rs.getBigDecimal("total");

                vendas.add(new Venda(codigoVenda, codigoCliente,dataVenda, total));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vendas;
    }

    public void cadastrarVenda(Venda venda) throws SQLException {
        String sql = "INSERT INTO Vendas (codigo_cliente, data_venda,total) VALUES (?,?,?)";
         

        try (Connection connection = configJDBC.createConnection(); PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
 
             stmt.setInt(1, venda.getCodigoCliente());
             stmt.setDate(2, java.sql.Date.valueOf(LocalDate.now()));
             stmt.setBigDecimal(3,venda.getTotal());
             stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int codigoGerado = generatedKeys.getInt(1);
                    venda.setCodigoVenda(codigoGerado);
                    System.out.println(codigoGerado);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public void cadastrarVendaProdutos(ItemVenda itemVenda) throws SQLException{
        String sql = "INSERT INTO Venda_Produto (codigo_venda, codigo_produto, quantidade, total_produtos) VALUES (?,?,?,?)";
        
        Connection connection = configJDBC.createConnection(); PreparedStatement stmt = connection.prepareStatement(sql); 
           
            stmt.setInt(1, itemVenda.getCodVenda());
            stmt.setInt(2, itemVenda.getCodProduto());
            stmt.setInt(3, itemVenda.getQuantidade());
            stmt.setBigDecimal(4, itemVenda.getTotalProdutos());
           
            stmt.executeUpdate();
    }
    
    public void removeProdutos(Integer codigo_venda) throws SQLException{
        String sql = "DELETE FROM Venda_produto WHERE codigo_venda = ?";
        
        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo_venda);
    }

    }
}
