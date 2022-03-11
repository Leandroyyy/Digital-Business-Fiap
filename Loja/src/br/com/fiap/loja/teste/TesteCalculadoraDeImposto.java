package br.com.fiap.loja.teste;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;
import br.com.fiap.loja.imposto.CalculadoraDeImposto;
import br.com.fiap.loja.imposto.Icms;
import br.com.fiap.loja.imposto.Ipi;
import br.com.fiap.loja.imposto.Iss;

public class TesteCalculadoraDeImposto {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal(100));
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		
		calculadoraDeImposto.setImposto(new Iss(new Icms(new Ipi(null))));
		
		
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
	}

}
