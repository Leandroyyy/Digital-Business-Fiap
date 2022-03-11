package br.com.fiap.loja.teste;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;
import br.com.fiap.loja.PedidoProxy;
import br.com.fiap.loja.situacao.EmailListener;
import br.com.fiap.loja.situacao.LogListener;

public class TestaProxy {
	
	public static void main(String[] args) {
		Pedido pedido = new PedidoProxy( new Pedido(new BigDecimal(100)) );
		pedido.getHandler().inscrever(new EmailListener());
		pedido.getHandler().inscrever(new LogListener());
		
		System.out.println(pedido.getValor());
		
		pedido.pagar();
		
		pedido.entregar();
		
		//cache
	}

}
