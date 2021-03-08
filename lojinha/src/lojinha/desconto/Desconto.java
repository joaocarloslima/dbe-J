package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.Pedido;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public abstract BigDecimal calcular(Pedido pedido);

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	

}
