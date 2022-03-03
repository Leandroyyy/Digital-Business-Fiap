package br.com.fiap.loja.situacao;

import br.com.fiap.loja.Pedido;

public class Aberto extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Abrir chamado para FINANCEIRO");	
	}

	@Override
	public void pagar(Pedido pedido) {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}
	
	
}
