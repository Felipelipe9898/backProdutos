package com.produtos.exemplo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="produtos") //nome da tabela
@Entity //serve para dar o comando e criar a tabela
public class ProdutoModelo {
	
	//Atributos
	@Id //especifica que é uma chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	@Column(name = "codigo") //defino o nome da coluna que vai aparecer no banco de dados
	private Integer codigo;
	
	@Column(name = "produto")
	private String produto;
	
	@Column (name = "marca")
	private String marca;
	
	@Column(name = "valor")
	private Double valor;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
