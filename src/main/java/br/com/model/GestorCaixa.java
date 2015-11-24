package br.com.model;

import br.com.model.bean.Caixa;
import br.com.model.bean.Historico;
import br.com.model.bean.Transacao;
import br.com.validator.Validator;


public class GestorCaixa implements Gestor{
	private Caixa caixa;
	private Historico historico;
	private Validator<Double> caixaValidator = (v) -> v <= caixa.getSaldo();
	

	public GestorCaixa(Caixa caixa) {
		this.caixa = caixa;
		this.historico = new Historico(caixa.getSaldo());
	}

	public void pagar(Double valor) {
		if (caixaValidator.validar(valor)) {
			caixa.setSaldo(caixa.getSaldo() - valor);
			historico.addTransacao(new Transacao(valor, Operacao.PAGAR));
		}
	}

	public void receber(Double valor) {
		caixa.setSaldo(caixa.getSaldo() + valor);
		historico.addTransacao(new Transacao(valor, Operacao.RECEBER));
	}



	public enum Operacao {
		PAGAR, RECEBER;
	}
}
