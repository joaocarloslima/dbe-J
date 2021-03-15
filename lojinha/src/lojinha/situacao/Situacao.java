package lojinha.situacao;

import lojinha.Pedido;

public abstract class Situacao {

	public void pagar(Pedido pedido) {
		throw new StateExpection("Pedido não pode ser pago");
	}
	
	public void entregar(Pedido pedido) {
		throw new StateExpection("Pedido não pode entregar");
	}
	
	public void cancelar(Pedido pedido) {
		throw new StateExpection("Pedido não pode ser cancelado");
	}
	
	public void reabrir(Pedido pedido) {
		throw new StateExpection("Pedido não pode ser reaberto");
	}

	public abstract void abrirChamado(Pedido pedido);
	

}
