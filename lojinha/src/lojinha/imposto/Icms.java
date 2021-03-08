package lojinha.imposto;

import java.math.BigDecimal;

import lojinha.Pedido;

public class Icms implements Imposto{

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.15"));
	}
	

}
