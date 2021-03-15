package lojinha.situacao;

public class StateExpection extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public StateExpection(String mensagem) {
		super(mensagem);
	}

}
