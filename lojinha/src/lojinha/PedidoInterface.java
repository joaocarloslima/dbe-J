package lojinha;

import java.math.BigDecimal;

import lojinha.situacao.Situacao;

public interface PedidoInterface {

	void abrirChamado();

	PedidoHandler getHandler();

	BigDecimal getValor();

	int getTotalItens();

	void pagar();

	void entregar();

	void cancelar();

	void reabrir();

	void setSituacao(Situacao situacao);

	Situacao getSituacao();

}