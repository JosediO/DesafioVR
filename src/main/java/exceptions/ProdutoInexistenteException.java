/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author Josedi
 */
public class ProdutoInexistenteException extends RuntimeException{
    
    public ProdutoInexistenteException(String message) {
        super(message);
    }
}
