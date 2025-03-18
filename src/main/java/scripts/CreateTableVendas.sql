/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Josedi
 * Created: 10 de mar. de 2025
 */

CREATE TABLE vendas (
    codigo_venda SERIAL PRIMARY KEY,
    codigo_cliente INTEGER REFERENCES clientes(codigo),
    data_venda DATE NOT NULL,
    total NUMERIC(15,2) NOT NULL
);


