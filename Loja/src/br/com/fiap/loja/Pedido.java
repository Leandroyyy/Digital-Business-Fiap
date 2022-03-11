package br.com.fiap.loja;

import java.math.BigDecimal;

import br.com.fiap.loja.situacao.Aberto;
import br.com.fiap.loja.situacao.Situacao;
import br.com.fiap.loja.situacao.SituacaoHandler;

public class Pedido {
	
	private BigDecimal valor;
	private int totalDeItens;
	private Situacao situacao;
	private SituacaoHandler handler;
	
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.totalDeItens = 1;
		this.situacao = new Aberto();
		this.handler = new SituacaoHandler();
		
		PedidoFacade.criarProduto();
		

	}
	
	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		this.totalDeItens = totalDeItens;
		this.situacao = new Aberto();
		this.handler = new SituacaoHandler();
		
		PedidoFacade.criarProduto();
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
		getHandler().notificar(this);
		this.situacao = situacao;
	}

	public int getTotalDeItens() {
		return totalDeItens;
	}

	public BigDecimal getValor() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return valor;
	}

	public Situacao getSituacao() {
		return this.situacao;
	}

	public SituacaoHandler getHandler() {
		return handler;
	}
	
}
