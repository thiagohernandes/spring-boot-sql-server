package com.br.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.api.model.Produto;
import com.br.api.repository.ProdutoRepository;

@Service
@Transactional
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> getTodosProdutos() {
		return repository.findAll();
	}
	
}
