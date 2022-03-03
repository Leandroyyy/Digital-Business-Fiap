package br.com.fiap.loja.situacao;

import br.com.fiap.loja.Pedido;

public class Cancelado extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Abrir chamado para COMERCIAL");

	}

	@Override
	public void reabir(Pedido pedido) {
		pedido.setSituacao(new Aberto());
	}
	
	

}
