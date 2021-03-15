package lojinha.situacao;

import lojinha.Pedido;

public class Pago extends Situacao{

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("chamado para logistica");

		
	}
	
	

}
