package br.com.fiap.loja.desconto;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.fiap.loja.Pedido;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Pedido pedido) {
		
		Desconto cadeiaDeDesconto = 
				new DescontoPorValor(
				new DescontoPorQuantidade(
				new SemDesconto()
		)); 
		
		
		return cadeiaDeDesconto.calcular(pedido).setScale(2, RoundingMode.HALF_UP);
	}

}
