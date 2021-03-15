package lojinha;

public class EmailListener implements Listener {

	@Override
	public void update(Pedido pedido) {
		System.out.println("Enviando email do pedido " + pedido);
	}
	
	

}
