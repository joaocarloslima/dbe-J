package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.Pedido;

public class TesteDesconto {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal("400"), 9);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		System.out.println(desconto);
	}
}
