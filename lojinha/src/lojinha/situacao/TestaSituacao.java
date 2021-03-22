package lojinha.situacao;

import java.math.BigDecimal;

import lojinha.Pedido;
import lojinha.PedidoInterface;
import lojinha.PedidoProxy;

public class TestaSituacao {
	public static void main(String[] args) {
		PedidoInterface pedido = 
				new PedidoProxy(new Pedido(new BigDecimal("100")));
		System.out.println(pedido.getValor());
		pedido.abrirChamado();
		System.out.println(pedido.getSituacao());
		
		pedido.pagar();

		System.out.println(pedido.getSituacao());
		
		pedido.abrirChamado();
		
		System.out.println(pedido.getSituacao());
		System.out.println(pedido.getValor());


	}
}
