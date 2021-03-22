package lojinha.situacao;

import lojinha.PedidoInterface;

public class Cancelado extends Situacao {

	@Override
	public void reabrir(PedidoInterface pedido) {
		pedido.setSituacao(new Aberto());
	}

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		System.out.println("chamado para comercial");
		
	}
	
	

}
