package lojinha.situacao;

import lojinha.PedidoInterface;

public abstract class Situacao {

	public void pagar(PedidoInterface pedido) {
		throw new StateExpection("Pedido não pode ser pago");
	}
	
	public void entregar(PedidoInterface pedido) {
		throw new StateExpection("Pedido não pode entregar");
	}
	
	public void cancelar(PedidoInterface pedido) {
		throw new StateExpection("Pedido não pode ser cancelado");
	}
	
	public void reabrir(PedidoInterface pedido) {
		throw new StateExpection("Pedido não pode ser reaberto");
	}

	public abstract void abrirChamado(PedidoInterface pedido);
	

}
