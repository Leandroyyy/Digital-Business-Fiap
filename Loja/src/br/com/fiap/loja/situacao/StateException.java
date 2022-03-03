package br.com.fiap.loja.situacao;

public class StateException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public StateException(String mensagem) {
		super(mensagem);
	}

}
