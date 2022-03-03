package br.com.fiap.loja;

import java.math.BigDecimal;

import br.com.fiap.loja.situacao.EmailListener;
import br.com.fiap.loja.situacao.LogListener;

public class TestaSituacao {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal(100));
		pedido.getHandler().inscrever(new EmailListener());
		pedido.getHandler().inscrever(new LogListener());
		
		pedido.abrirChamado();
		
		pedido.pagar();
		pedido.cancelar();
		pedido.reabir();
		pedido.pagar();

		pedido.abrirChamado();
		
		pedido.entregar();
		pedido.abrirChamado();
		
		//pedido.reabir();
	
			
	}
	
}
