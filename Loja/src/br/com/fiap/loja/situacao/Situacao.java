package br.com.fiap.loja.situacao;

import br.com.fiap.loja.Pedido;

public abstract class Situacao {

	public abstract void abrirChamado();
	
	public void pagar(Pedido pedido) {
		throw new StateException("Não pode trocar para o estado PAGO");
	}

	public void entregar(Pedido pedido) {
		throw new StateException("Não pode trocar para o estado ENTREGUE");
	}

	public void cancelar(Pedido pedido) {
		throw new StateException("Não pode trocar para o estado CANCELADO");
	}

	public void reabir(Pedido pedido) {
		throw new StateException("Não pode trocar para o estado ABERTO");
	}

}
