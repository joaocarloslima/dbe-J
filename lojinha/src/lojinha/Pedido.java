package lojinha;

import java.math.BigDecimal;

import lojinha.situacao.Aberto;
import lojinha.situacao.Situacao;

public class Pedido {
		
	private BigDecimal valor;
	private int totalItens;
	private Situacao situacao;
	private PedidoHandler handler;
	
	public void abrirChamado() {
		this.situacao.abrirChamado(this);
	}
	
	

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

	public BigDecimal getValor() {
		return valor;
	}

	public int getTotalItens() {
		return totalItens;
	}
	
	public void pagar() {
		this.situacao.pagar(this);
	}
	
	public void entregar() {
		this.situacao.entregar(this);
	}
	
	public void cancelar() {
		this.situacao.cancelar(this);
	}
	
	public void reabrir() {
		this.situacao.reabrir(this);
	}

	public void setSituacao(Situacao situacao) {
		handler.notificar(this);
		this.situacao = situacao;
	}

	public Situacao getSituacao() {
		return situacao;
	}
	
	
	
	
}
