package com.alexandresp.fazenTech.entities.enums;

public enum TipoProduto {
	
	ANIMAL(1),
	VEGETAL(2),
	ARTEZANAL(3),
	MINERAL(4); 
	
	private int code;
	
	private TipoProduto(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TipoProduto valueOf(int code) {
		
		for (TipoProduto value : TipoProduto.values()) {
			if (value.getCode() == code) {
				return value; 
			}
		}
		throw new IllegalArgumentException("code do TipoProduto esta invalido "); 
	}
}
