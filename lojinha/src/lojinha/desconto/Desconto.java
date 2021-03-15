package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.Pedido;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public BigDecimal calcular(Pedido pedido) {
		if(deveAplicar(pedido)) {
			return aplicar(pedido);
		}
		
		return proximo.calcular(pedido);
	}

	protected abstract BigDecimal aplicar(Pedido pedido);

	protected abstract boolean deveAplicar(Pedido pedido);

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	

}
