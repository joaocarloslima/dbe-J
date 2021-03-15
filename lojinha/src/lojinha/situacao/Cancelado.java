package lojinha.situacao;

import lojinha.Pedido;

public class Cancelado extends Situacao {

	@Override
	public void reabrir(Pedido pedido) {
		pedido.setSituacao(new Aberto());
	}

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("chamado para comercial");
		
	}
	
	

}
