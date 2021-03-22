package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.PedidoInterface;

public class DescontoPorQuantidadeDeItens extends Desconto {

	public DescontoPorQuantidadeDeItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal aplicar(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	protected boolean deveAplicar(PedidoInterface pedido) {
		return pedido.getTotalItens() >= 10;
		
	}

}
