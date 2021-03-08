package lojinha.imposto;

import java.math.BigDecimal;

import lojinha.Pedido;

public interface Imposto {
	
	public BigDecimal calcular(Pedido pedido);
	
}
