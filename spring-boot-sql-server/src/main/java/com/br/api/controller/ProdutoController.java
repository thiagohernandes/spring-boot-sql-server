package com.br.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.api.model.Produto;
import com.br.api.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos") 
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping()
	public ResponseEntity<List<Produto>> getTodosProdutos() {
		return ResponseEntity.ok(service.getTodosProdutos()) ;
	}
	
}
