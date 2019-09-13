package com.br.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/msg")
	public ResponseEntity<String> getMensagem() {
		return ResponseEntity.ok(service.mensagem()) ;
	}
	
	@GetMapping("/somar/{numeroA}/{numeroB}")
	public ResponseEntity<Integer> getSomar(@PathVariable("numeroA") int numeroA,
										   @PathVariable("numeroB") int numeroB) {
		return ResponseEntity.ok(service.procSomar(numeroA,numeroB)) ;
	}
	
}
