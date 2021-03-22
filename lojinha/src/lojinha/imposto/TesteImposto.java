package lojinha.imposto;

import java.math.BigDecimal;

import lojinha.Pedido;
import lojinha.PedidoInterface;
import lojinha.PedidoProxy;

public class TesteImposto {
	public static void main(String[] args) {
		
		Imposto imposto = new Icms(new Iss(new Ipi(null)));
		
		CalculadoraDeImposto calculadoraDeImposto = 
				new CalculadoraDeImposto(imposto);
		PedidoInterface pedido = new PedidoProxy(new Pedido(new BigDecimal("100")));
		
		BigDecimal valorDoImposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(valorDoImposto);
		
		
		
	}
}
