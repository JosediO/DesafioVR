/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Produto;
import exceptions.CodigoInvalidoException;
import exceptions.NomeInvalidoException;
import exceptions.ProdutoInexistenteException;
import exceptions.ValorException;
import gateway.ProdutoGateway;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Josedi
 */
public class ProdutoService {
    
    private ProdutoGateway produtoGateway = new ProdutoGateway();
    
    public void cadastrarProduto(Produto produto) throws SQLException{
        if(produto.getPDescription().isEmpty()){
            throw new NomeInvalidoException("Insira uma descrição.");
        }
        if(!produto.getPDescription().matches("^[a-zA-ZÀ-ÿ\\s]+$")){
            throw new NomeInvalidoException("Insira caracteres validos. (A a Z)");
        }
        if(produto.getPPreco().compareTo(BigDecimal.ZERO) <= 0){
            throw new ValorException("O valor não pode ser negativo!");
        }
        produtoGateway.cadastrarProduto(produto);
    }
    
    public Produto getProdutoByCodigo(Integer prodCod) throws SQLException{
        if(prodCod == null || prodCod <= 0){
            throw new CodigoInvalidoException("Código do Produto invalido. Tente novamente");
        }
        return produtoGateway.consultaProduto(prodCod);
    }
    
    public List<Produto> mostrarTodosProdutos () throws SQLException{
        return produtoGateway.mostraTodosProdutos();
    }
    
    public Produto editarProduto(Produto produto) throws SQLException{
        if(produto.getPCod() == null){
            throw new CodigoInvalidoException("Código do produto não pode ser vazio.");
        }
        if(produto.getPDescription().isEmpty() || produto.getPDescription() == null){
            throw new NomeInvalidoException("Insira um nome valido");
        }
        if(produto.getPPreco().compareTo(BigDecimal.ZERO) <= 0){
            throw new ValorException("Insira um preço valido.");
        }
        return produtoGateway.editarProduto(produto);
    }
    
    public void deletarProduto(Integer prodCod) throws SQLException{
        Boolean productExist = produtoGateway.productExist(prodCod);
        if(!productExist){
            throw new ProdutoInexistenteException("Produto não existe, insira um código valido.");
        }
        produtoGateway.deletarProduto(prodCod);
    }
    
}
