package lojinha;

import java.math.BigDecimal;

public class TestaObserver {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal("100"));
		pedido.getHandler().inscrever(new EmailListener());
		pedido.getHandler().inscrever(new LogListener());
		
		pedido.pagar();
	}

}
