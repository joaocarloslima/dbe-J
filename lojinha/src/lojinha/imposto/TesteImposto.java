package lojinha.imposto;

import java.math.BigDecimal;

import lojinha.Pedido;

public class TesteImposto {
	public static void main(String[] args) {
		CalculadoraDeImposto calculadoraDeImposto = 
				new CalculadoraDeImposto(new Iss());
		Pedido pedido = new Pedido(new BigDecimal("200"));
		
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(imposto);
		
		calculadoraDeImposto.setImposto(new Icms());
		imposto = calculadoraDeImposto.calcular(pedido);
		System.err.println(imposto);
		
	}
}
