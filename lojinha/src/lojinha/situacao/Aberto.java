package lojinha.situacao;

import lojinha.Pedido;

public class Aberto extends Situacao{

	@Override
	public void pagar(Pedido pedido) {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("chamado para financeiro");
		
	}
	
	
}
