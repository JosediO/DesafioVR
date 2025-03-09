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
@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    
    private String id;
    private String nome;
    private Double limite;
    private LocalDate fatura;
    
}
