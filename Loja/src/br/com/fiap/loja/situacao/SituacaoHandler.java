package br.com.fiap.loja.situacao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.loja.Pedido;

public class SituacaoHandler {
	
	private List<SituacaoListener> inscritos = new ArrayList<SituacaoListener>();

	public void inscrever(SituacaoListener inscrito) {
		inscritos.add(inscrito);
	}
	
	public void desinscrever(SituacaoListener inscrito) {
		inscritos.remove(inscrito);
	}
	
	public void notificar(Pedido pedido) {
		inscritos.forEach(inscrito -> inscrito.update(pedido));
	}
	

}
