/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Josedi
 * Created: 10 de mar. de 2025
 */

CREATE TABLE venda_produtos (
    codigo_venda INTEGER NOT NULL,
    codigo_produto INTEGER NOT NULL,
    quantidade INTEGER NOT NULL,
    PRIMARY KEY (codigo_venda, codigo_produto),
    FOREIGN KEY (codigo_venda) REFERENCES vendas(codigo_venda),
    FOREIGN KEY (codigo_produto) REFERENCES produtos(id)
);


