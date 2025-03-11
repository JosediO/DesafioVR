/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Josedi
 * Created: 10 de mar. de 2025
 */

CREATE TABLE produtos (
    codigo INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    descricao VARCHAR(50) NOT NULL,
    preco NUMERIC(10,2) NOT NULL
);

