package com.alexandresp.fazenTech.resources;

import java.util.Locale;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandresp.fazenTech.entities.Produto;
import com.alexandresp.fazenTech.entities.enums.TipoProduto;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource { 
	
	@GetMapping
	public ResponseEntity<Produto> findAll() {
		Locale.setDefault(Locale.US);
		Produto produto = new Produto(1L, "milho", 14.98, 11, TipoProduto.VEGETAL);

		return ResponseEntity.ok().body(produto);
	}
}
