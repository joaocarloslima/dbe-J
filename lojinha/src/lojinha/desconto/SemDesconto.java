package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.Pedido;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return BigDecimal.ZERO;
	}
	
	

}
