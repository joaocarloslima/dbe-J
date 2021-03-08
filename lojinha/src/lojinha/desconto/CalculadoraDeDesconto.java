package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.Pedido;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Pedido pedido) {
		Desconto cadeiaDeDesconto = 
				new DescontoPorValor(
				new DescontoPorQuantidadeDeItens(
				new SemDesconto()
		));
		
		return cadeiaDeDesconto.calcular(pedido);
	}

}
