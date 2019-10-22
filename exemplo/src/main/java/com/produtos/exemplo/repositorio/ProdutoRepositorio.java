package com.produtos.exemplo.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.produtos.exemplo.modelo.ProdutoModelo;


public interface ProdutoRepositorio extends Repository<ProdutoModelo, Integer> { //a tabela dps o dado que eu quero manipular o ID(no caso o codigo do produto que é tipo integer)
	
	
	//Ações para o CRUD
	
	
	public void save(ProdutoModelo prodMod); //é um médoto padrao de cadastro da casse Repository
	
	public List<ProdutoModelo> findAll(); //vai exibir todos o dados de produtos (lista)  //findAll é para selecionar tudo
	
	public ProdutoModelo findByCodigo(Integer codigo);  // findyBy+palavra procura algo especifico que vc quer selecionar pela palavra que vc passou
	
	public void delete(ProdutoModelo prodMod);// deletar

}
