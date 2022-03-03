package br.com.fiap.loja;

import java.math.BigDecimal;

import br.com.fiap.loja.situacao.Aberto;
import br.com.fiap.loja.situacao.Situacao;

public class Pedido {
	
	private BigDecimal valor;
	private int totalDeItens;
	private Situacao situacao;
	
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.totalDeItens = 1;
		this.situacao = new Aberto();
	}
	
	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		this.totalDeItens = totalDeItens;
		this.situacao = new Aberto();
	}
	
	public void abrirChamado() {
		situacao.abrirChamado();
	}
	
	public void pagar() {
		situacao.pagar(this);
	}

	public void entregar() {
		situacao.entregar(this);
	}

	public void cancelar() {
		situacao.cancelar(this);
	}

	public void reabir() {
		situacao.reabir(this);
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public int getTotalDeItens() {
		return totalDeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
}
