package lojinha;

import java.math.BigDecimal;

public class Pedido {
		
	private BigDecimal valor;
	private int totalItens;

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.totalItens = 1;
	}
	
	public Pedido(BigDecimal valor, int totalItens) {
		this.valor = valor;
		this.totalItens = totalItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getTotalItens() {
		return totalItens;
	}
	
	
	
	
	
}
