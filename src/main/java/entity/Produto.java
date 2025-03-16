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
public class Produto {
 
    private Integer pCod;
    private String pDescription;
    private BigDecimal pPreco;
    
    public Produto(Integer pCod,String pDescription, BigDecimal pPreco){
        this.pCod = pCod;
        this.pDescription = pDescription;
        this.pPreco = pPreco;
    }

    public Produto() {
    }

    public Integer getPCod(){
        return pCod;
    }
    
    public void setPCod(Integer pCod){
        this.pCod = pCod;
    }
    
    public String getPDescription(){
        return pDescription;
    }
    
    public void setPDescription(String pDescription){
        this.pDescription = pDescription;
    }
    
    public BigDecimal getPPreco(){
        return pPreco;
    }
    
    public void setPPreco(BigDecimal pPreco){
        this.pPreco = pPreco;
    }
}
