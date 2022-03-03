package br.com.fiap.loja;

import java.math.BigDecimal;

public class TestaSituacao {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal(100));
		pedido.abrirChamado();
		
		pedido.pagar();
		pedido.abrirChamado();
		
		pedido.entregar();
		pedido.abrirChamado();
		
		pedido.reabir();
	
			
	}
	
}
