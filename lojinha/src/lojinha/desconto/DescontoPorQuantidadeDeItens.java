package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.Pedido;

public class DescontoPorQuantidadeDeItens extends Desconto {

	public DescontoPorQuantidadeDeItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal aplicar(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getTotalItens() >= 10;
		
	}

}
