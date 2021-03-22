package lojinha.desconto;

import java.math.BigDecimal;

import lojinha.Pedido;
import lojinha.PedidoInterface;

public class TesteDesconto {
	public static void main(String[] args) {
		PedidoInterface pedido = new Pedido(new BigDecimal("400"), 20);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		System.out.println(desconto);
	}
}
