package lojinha.situacao;

import java.math.BigDecimal;

import lojinha.Pedido;

public class TestaSituacao {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal("100"));
		
		pedido.abrirChamado();

		
		System.out.println(pedido.getSituacao());
		
		pedido.pagar();

		System.out.println(pedido.getSituacao());
		
		pedido.abrirChamado();
		
		System.out.println(pedido.getSituacao());

	}
}
