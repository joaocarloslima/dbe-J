package lojinha;

import java.math.BigDecimal;

import lojinha.situacao.Aberto;
import lojinha.situacao.Situacao;

public class Pedido implements PedidoInterface  {
		
	private BigDecimal valor;
	private int totalItens;
	private Situacao situacao;
	private PedidoHandler handler;
	
	@Override
	public void abrirChamado() {
		this.situacao.abrirChamado(this);
	}

	@Override
	public PedidoHandler getHandler() {
		return handler;
	}



	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.totalItens = 1;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}
	
	public Pedido(BigDecimal valor, int totalItens) {
		this.valor = valor;
		this.totalItens = totalItens;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	@Override
	public BigDecimal getValor() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return valor;
	}

	@Override
	public int getTotalItens() {
		return totalItens;
	}
	
	@Override
	public void pagar() {
		this.situacao.pagar(this);
	}
	
	@Override
	public void entregar() {
		this.situacao.entregar(this);
	}
	
	@Override
	public void cancelar() {
		this.situacao.cancelar(this);
	}
	
	@Override
	public void reabrir() {
		this.situacao.reabrir(this);
	}

	@Override
	public void setSituacao(Situacao situacao) {
		handler.notificar(this);
		this.situacao = situacao;
	}

	@Override
	public Situacao getSituacao() {
		return situacao;
	}
	
	
	
	
}
