/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Josedi
 * Created: 10 de mar. de 2025
 */

CREATE TABLE vendas (
    codigo_venda INTEGER PRIMARY KEY AUTOINCREMENT,
    codigo_cliente INTEGER,
    data_venda DATE NOT NULL,
    FOREIGN KEY (codigo_cliente) REFERENCES clientes(codigo)
);


