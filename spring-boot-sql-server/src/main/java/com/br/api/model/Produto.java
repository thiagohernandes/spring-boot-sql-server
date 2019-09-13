package com.br.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_produtos")
@JsonInclude(Include.ALWAYS)
@Data
@NoArgsConstructor
public class Produto {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "descricao", nullable = false)
	private String descricao;
	@Column(name = "valor", nullable = false)
	private double valor;
	@Column(name = "qtd", nullable = false)
	private int qtd;
	
}
