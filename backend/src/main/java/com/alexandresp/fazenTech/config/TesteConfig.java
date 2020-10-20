package com.alexandresp.fazenTech.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alexandresp.fazenTech.entities.Produto;
import com.alexandresp.fazenTech.entities.enums.TipoProduto;
import com.alexandresp.fazenTech.repositories.ProdutoRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Produto p1 = new Produto(1L, "Milho", 3.59, 100, TipoProduto.VEGETAL);
		Produto p2 = new Produto(2L, "Leite", 1.99, 100, TipoProduto.ANIMAL);
		Produto p3 = new Produto(3L, "Batata", 0.98, 50, TipoProduto.VEGETAL);
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3)); 
	}
	


}
