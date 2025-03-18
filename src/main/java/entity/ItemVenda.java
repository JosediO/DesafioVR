/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.math.BigDecimal;

/**
 *
 * @author Josedi
 */
public class ItemVenda {

    private Integer codVenda;
    private Integer codProduto;
    private Integer quantidade;
    private BigDecimal totalProdutos;

    public ItemVenda(Integer codVenda, Integer codProduto, Integer quantidade, BigDecimal totalProdutos) {
        this.codVenda = codVenda;
        this.codProduto = codProduto;
        this.quantidade = quantidade;
        this.totalProdutos = totalProdutos;
    }
    
    public ItemVenda( Integer codProduto, Integer quantidade, BigDecimal totalProdutos) {
        this.codProduto = codProduto;
        this.quantidade = quantidade;
        this.totalProdutos = totalProdutos;
    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos(BigDecimal totalProdutos) {
        this.totalProdutos = totalProdutos;
    }

}
