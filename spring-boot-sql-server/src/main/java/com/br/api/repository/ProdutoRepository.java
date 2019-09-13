package com.br.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.api.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer>{

	@Query(value = "EXECUTE testeMsg", nativeQuery = true)
	public String testeMsg();
	
	@Query(value = "EXECUTE procSomar @numeroA = :pNumeroA, @numeroB = :pNumeroB", nativeQuery = true)
	public Integer procSomar(@Param("pNumeroA") int pNumeroA,
			  			     @Param("pNumeroB") int pNumeroB);
}
