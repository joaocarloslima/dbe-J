package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.PedidoInterface;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(PedidoInterface pedido) {
		Desconto cadeiaDeDesconto = 
				new DescontoPorValor(
				new DescontoPorQuantidadeDeItens(
				new SemDesconto()
		));
		
		return cadeiaDeDesconto.calcular(pedido);
	}

}
