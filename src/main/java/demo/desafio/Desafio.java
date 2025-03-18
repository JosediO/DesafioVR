/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package demo.desafio;

import config.ConfigJDBC;
import java.sql.Connection;
import swing.Principal;

/**
 *
 * @author Josedi
 */
public class Desafio {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
        
       ConfigJDBC connection = new ConfigJDBC();
        connection.createConnection();
    }
}
