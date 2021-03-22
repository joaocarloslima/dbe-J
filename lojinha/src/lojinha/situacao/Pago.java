package lojinha.situacao;

import lojinha.PedidoInterface;

public class Pago extends Situacao{

	@Override
	public void entregar(PedidoInterface pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());
	}

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		System.out.println("chamado para logistica");

		
	}
	
	

}
