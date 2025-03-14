/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Cliente;
import exceptions.CodigoInvalidoException;
import exceptions.DataFaturaException;
import exceptions.LimiteException;
import exceptions.NomeInvalidoException;
import gateway.ClienteGateway;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Josedi
 */
public class ClienteService {
    
    private ClienteGateway clienteGateway = new ClienteGateway();

    public void cadastrarCliente(Cliente cliente) throws SQLException {
        if (cliente.getNome().isEmpty() || !cliente.getNome().matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
            throw new NomeInvalidoException("Insira um nome valido.");
        }
        if(cliente.getLimite()<=0 ){
            throw new LimiteException("O Limite não pode ser negativo!");
        }
        if(cliente.getFatura() < 1 || cliente.getFatura() > 31){
            throw new DataFaturaException("Insira uma data valida para cobrança.(1 a 31)");
        }
        clienteGateway.cadastrarCliente(cliente);
    }

    public Cliente getClienteByCodigo(Integer codigo) {
        if (codigo == null || codigo <= 0 || !codigo.equals(Integer.class)) {
            throw new CodigoInvalidoException("Código invalido. Tente novamente!");
        }
        return clienteGateway.consultaCliente(codigo);
    }

    public List<Cliente> mostrarTodosClientes() throws SQLException {
        return clienteGateway.mostrarTodosClientes();
    }

    public Cliente editarCliente(Cliente cliente) throws SQLException {
        if (cliente.getCodigo() == null || cliente.getCodigo().isEmpty()) {
            throw new CodigoInvalidoException("Código do cliente não pode ser vazio.");
        }
        if (cliente.getNome().isEmpty() || !cliente.getNome().matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
            throw new NomeInvalidoException("Insira um nome valido.");
        }
        if(cliente.getLimite()<=0 ){
            throw new LimiteException("O Limite não pode ser negativo!");
        }
        if(cliente.getFatura() < 1 || cliente.getFatura() > 31){
            throw new DataFaturaException("Insira uma data valida para cobrança.(1 a 31)");
        }
        return clienteGateway.editarCliente(cliente);
    }

    public void deletarCliente(Integer codigo) throws SQLException { 
        if (codigo == null || codigo <= 0 ){
            throw new CodigoInvalidoException("Código do cliente não pode ser vazio.");
        }
        clienteGateway.deletarCliente(codigo);
    }
    
}

