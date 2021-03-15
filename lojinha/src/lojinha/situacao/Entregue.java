package lojinha.situacao;

import lojinha.Pedido;

public class Entregue extends Situacao {

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("chamado para pos venda");
		
	}
	
	

}
