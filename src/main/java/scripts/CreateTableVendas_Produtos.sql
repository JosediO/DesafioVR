/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Josedi
 * Created: 10 de mar. de 2025
 */

CREATE TABLE venda_produtos (
    codigo_venda INTEGER REFERENCES vendas(codigo_venda),
    codigo_produto INTEGER REFERENCES produtos(pcod),
    quantidade INTEGER NOT NULL,
    totalProdutos NUMERIC(15,2) NOT NULL,
    PRIMARY KEY (codigo_venda, codigo_produto)
);


