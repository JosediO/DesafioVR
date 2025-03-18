/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Josedi
 */
public class Venda {

    private Integer codigoVenda;
    private Integer codigoCliente;
    private LocalDate dataVenda;
    private BigDecimal total;

    public Venda(Integer codigoVenda, Integer codigoCliente, LocalDate dataVenda, BigDecimal total) {
        this.codigoVenda = codigoVenda;
        this.codigoCliente = codigoCliente;
        this.dataVenda = dataVenda;
        this.total = total;
    }

    public Venda(Integer codigoCliente, LocalDate dataVenda, BigDecimal total) {
        this.codigoCliente = codigoCliente;
        this.dataVenda = dataVenda;
        this.total = total;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(Integer codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
