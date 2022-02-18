package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Pedido pedido) {
		
		if (pedido.getValor().compareTo(new BigDecimal(500)) > 0) {
			return pedido.getValor().multiply(new BigDecimal(0.1));
		}
		
		if (pedido.getTotalDeItens() > 10) {
			return pedido.getValor().multiply(new BigDecimal(0.05));
		}
		
		return BigDecimal.ZERO;
		
		
	}

}
