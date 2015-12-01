package br.com.model.engine;

import br.com.model.bean.Transacao;


public interface FluxoCaixa {
	void pagar(Double valor);
	void receber(Double valor);
	void registraTransacao (Double saldo, Transacao transacao);
	
	
}
