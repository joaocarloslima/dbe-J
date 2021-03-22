package lojinha.situacao;

import lojinha.PedidoInterface;

public class ChamadoFacade {
	
	public void abrir(PedidoInterface pedido) {
		System.out.println("Verificar histórico pedido");
		System.out.println("Verificar autencicacao");
		System.out.println("Registrar chamado");
		System.out.println("Notificar o departamento");
		System.out.println("Consultar o endereco");
	}

}
