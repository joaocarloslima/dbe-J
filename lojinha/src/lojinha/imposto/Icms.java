package lojinha.imposto;

import java.math.BigDecimal;

import lojinha.PedidoInterface;

public class Icms extends Imposto{

	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcular(PedidoInterface pedido) {
		BigDecimal valorDoImposto = pedido.getValor().multiply(new BigDecimal("0.15"));
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO; 
		if(outroImposto != null) {
			valorDoOutroImposto = outroImposto.calcular(pedido);
		}
		return valorDoImposto.add(valorDoOutroImposto);
	}
	

}
