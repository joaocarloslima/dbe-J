package lojinha.imposto;

import java.math.BigDecimal;

import lojinha.PedidoInterface;

public class CalculadoraDeImposto {
	
	private Imposto imposto;
	
	public BigDecimal calcular(PedidoInterface pedido) {
		return imposto.calcular(pedido);
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public CalculadoraDeImposto(Imposto imposto) {
		super();
		this.imposto = imposto;
	}
	
	

}
