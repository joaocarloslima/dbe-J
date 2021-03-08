package lojinha.imposto;

import java.math.BigDecimal;

import lojinha.Pedido;

public class CalculadoraDeImposto {
	
	private Imposto imposto;
	
	public BigDecimal calcular(Pedido pedido) {
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
