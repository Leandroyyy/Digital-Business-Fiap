package br.com.fiap.loja.situacao;

import br.com.fiap.loja.Pedido;

public class EmailListener implements SituacaoListener {

	@Override
	public void update(Pedido pedido) {
		System.out.println("Mandando e-mail para o pedido " + pedido 
				+ " na situacao " + pedido.getSituacao() +
				"com valor de " + pedido.getValor());		
	}

}
