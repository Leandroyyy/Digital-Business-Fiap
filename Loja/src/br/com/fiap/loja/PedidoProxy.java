package br.com.fiap.loja;

import java.math.BigDecimal;

public class PedidoProxy extends Pedido {
	
	private BigDecimal valor;
	private Pedido pedido;

	public PedidoProxy(Pedido pedido) {
		super(pedido.getValor());
		this.pedido = pedido;
	}
	
	@Override
	public BigDecimal getValor() {
		if (valor == null) {
			valor = pedido.getValor();
		}
		return valor;
	}

}
