package lojinha.situacao;

import lojinha.PedidoInterface;

public class Entregue extends Situacao {

	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());
	}

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		System.out.println("chamado para pos venda");
		
	}
	
	

}
