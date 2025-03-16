/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gateway;

import config.ConfigJDBC;
import entity.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Josedi
 */
public class ClienteGateway {

    private ConfigJDBC configJDBC = new ConfigJDBC();

    public Boolean clientExist(Integer codigo) throws SQLException {
        if (codigo == null || codigo <= 0) {
            return false;
        }
        String sql = "SELECT 1 FROM Clientes WHERE codigo = ?";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    public Cliente consultaCliente(Integer input) {
        Cliente cliente = null;
        String sql = "SELECT codigo, nome, limite, fatura FROM clientes WHERE codigo = ?";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, input);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente = new Cliente(
                        rs.getString("codigo"),
                        rs.getString("nome"),
                        rs.getDouble("limite"),
                        rs.getInt("fatura"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cliente;
    }

    public List<Cliente> mostrarTodosClientes() throws SQLException {

        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Clientes";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                String id = rs.getString("codigo");
                String nome = rs.getString("nome");
                Double limite = rs.getDouble("limite");
                Integer fatura = rs.getInt("fatura");

                clientes.add(new Cliente(id, nome, limite, fatura));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void cadastrarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO Clientes (nome,limite,fatura)VALUES (?,?,?)";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setDouble(2, cliente.getLimite());
            stmt.setInt(3, cliente.getFatura());

            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int codigoGerado = generatedKeys.getInt(1);
                    cliente.setCodigo(String.valueOf(codigoGerado));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente editarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE Clientes SET nome = COALESCE(?,nome), limite = COALESCE(?,limite), fatura = COALESCE(?,fatura) WHERE codigo = ?";

        Connection conn = configJDBC.createConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setObject(1, cliente.getNome().isEmpty() ? null : cliente.getNome());
        stmt.setObject(2, cliente.getLimite() == 0 ? null : cliente.getLimite());
        stmt.setObject(3, cliente.getFatura() == 0 ? null : cliente.getFatura());
        stmt.setInt(4, Integer.parseInt(cliente.getCodigo()));

        stmt.executeUpdate();
        return cliente;
    }

    public void deletarCliente(Integer input) {

        String sql = "DELETE FROM Clientes WHERE codigo = ?";

        try (Connection conn = configJDBC.createConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, input);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Cliente com id " + input + " foi deletado com sucesso.");
            } else {
                System.out.println("Nenhum cliente encontrado com o id " + input);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar cliente: " + e.getMessage());
        }
    }
}
