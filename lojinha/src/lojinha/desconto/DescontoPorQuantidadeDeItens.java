package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.Pedido;

public class DescontoPorQuantidadeDeItens extends Desconto {

	public DescontoPorQuantidadeDeItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getTotalItens() >= 10 ) {
			return pedido.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return proximo.calcular(pedido);

	}

}
