package lojinha.situacao;

import lojinha.PedidoInterface;

public class Aberto extends Situacao{

	@Override
	public void pagar(PedidoInterface pedido) {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());
	}

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		ChamadoFacade chamadoFacade = new ChamadoFacade();
		chamadoFacade.abrir(pedido);
		System.out.println("chamado para financeiro");
		
	}
	
	
}
