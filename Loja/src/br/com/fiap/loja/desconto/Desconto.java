package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public final BigDecimal calcular(Pedido pedido) {
		
		return deveAplicar(pedido)? aplicarDesconto(pedido): proximo.calcular(pedido);
		
	}

	protected abstract BigDecimal aplicarDesconto(Pedido pedido);
	protected abstract boolean deveAplicar(Pedido pedido);


}
