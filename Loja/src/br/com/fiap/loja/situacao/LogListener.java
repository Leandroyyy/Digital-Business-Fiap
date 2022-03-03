package br.com.fiap.loja.situacao;

import br.com.fiap.loja.Pedido;

public class LogListener implements SituacaoListener {

	@Override
	public void update(Pedido pedido) {
		System.out.println("LOG: " + pedido + " mudou a situação");
	}

}
