package br.com.fiap.loja;

import java.math.BigDecimal;

public class Pedido {
	
	private BigDecimal valor;
	private int totalDeItens;
	private String situacao;
	
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.totalDeItens = 1;
		this.situacao = "ABERTO";
	}
	
	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		this.totalDeItens = totalDeItens;
	}
	
	public void abrirChamado() {
		if (situacao == "ABERTO") {
			System.out.println("Abrir chamado para FINANCEIRO");
		}else if(situacao == "PAGO"){
			System.out.println("Abrir chamado para LOGISTICA");
		}else if(situacao == "ENTREGUE"){
			System.out.println("Abrir chamado para POS-VENDA");
		}else if(situacao == "CANCELADO"){
			System.out.println("Abrir chamado para COMERCIAL");
		}
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getTotalDeItens() {
		return totalDeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
}
