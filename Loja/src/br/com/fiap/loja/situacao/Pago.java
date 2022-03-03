package br.com.fiap.loja.situacao;

import br.com.fiap.loja.Pedido;

public class Pago extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("Abrir chamado para LOGISTICA");	
	}

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}

	

}
