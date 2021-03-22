package lojinha;

import java.math.BigDecimal;

import lojinha.situacao.Situacao;

public class PedidoProxy implements PedidoInterface{
	private Pedido pedido;
	private BigDecimal valor;

	public PedidoProxy(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	public void abrirChamado() {
		pedido.abrirChamado();
	}

	public PedidoHandler getHandler() {
		return pedido.getHandler();
	}

	public BigDecimal getValor() {
		if (valor == null) valor = pedido.getValor();
		return valor;
	}

	public int getTotalItens() {
		return pedido.getTotalItens();
	}

	public void pagar() {
		pedido.pagar();
	}

	public void entregar() {
		pedido.entregar();
	}

	public void cancelar() {
		pedido.cancelar();
	}

	public void reabrir() {
		pedido.reabrir();
	}

	public void setSituacao(Situacao situacao) {
		pedido.setSituacao(situacao);
	}

	public Situacao getSituacao() {
		
		return pedido.getSituacao();
	}
	
	
}
