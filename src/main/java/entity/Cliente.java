/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Josedi
 */

public class Cliente {
    
    private String id;
    private String nome;
    private Double limite;
    private LocalDate fatura;
    
    public Cliente(String id, String nome, Double limite, LocalDate fatura){
        this.id = id;
        this.nome = nome;
       this.limite = limite;
        this.fatura = fatura;
   }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Double getLimite(){
        return limite;
    }
    
    public void setLimite(Double limite){
        this.limite = limite;
    }
    
    public LocalDate getFatura(){
        return fatura;
    }
    
    public void setFatura(LocalDate fatura){
        this.fatura = fatura;
    }
}
