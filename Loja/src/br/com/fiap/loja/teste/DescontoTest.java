package br.com.fiap.loja.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.fiap.loja.Pedido;
import br.com.fiap.loja.desconto.CalculadoraDeDesconto;

class DescontoTest {

	@Test
	void deveRetornarUmDescontoParaPedidosComValorAlto() {
		Pedido pedido = new Pedido(new BigDecimal(600),210);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("60.00"), desconto);
	}
	
	@Test
	void deveRetornarUmDescontoParaPedidosGrandes() {
		Pedido pedido = new Pedido(new BigDecimal(100),210);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("5.00"), desconto);
	}
	
	@Test
	void deveRetornarDescontoZeroCasoNaoApliqueAsOutrasRegras() {
		Pedido pedido = new Pedido(new BigDecimal(10),1);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("0.00"), desconto);
	}

}
