package br.com.model.engine;

import br.com.infra.HibernateDao;
import br.com.model.bean.Historico;
import br.com.model.bean.Transacao;
import br.com.validation.Util;
import br.com.validation.Validator;

public class DefaultFluxoCaixa implements FluxoCaixa {
	private Caixa caixa;
	private Historico historico;
	private HibernateDao<Historico> historicoDao;
	// Validator
	private Validator<Double> caixaValidator = (v) -> v <= caixa.getSaldo();

	public DefaultFluxoCaixa(long id) {
		historicoDao = new HibernateDao<Historico>();
		loadHistorico(id);
		this.caixa = new Caixa();
		caixa.setSaldo(historico.getSaldo());
	}

	public void pagar(Double valor) {
		if (caixaValidator.validar(valor)) {
			caixa.setSaldo(caixa.getSaldo() - valor);
			registraTransacao(caixa.getSaldo(), new Transacao(valor,
					Operacao.PAGAR));
		}
	}

	public void receber(Double valor) {
		caixa.setSaldo(caixa.getSaldo() + valor);
		registraTransacao(caixa.getSaldo(), new Transacao(valor,
				Operacao.RECEBER));
	}

	public Double getSaldo() {
		return historico.getSaldo();
	}
	
	public void registraTransacao(Double saldo, Transacao transacao) {
		historico.addTransacao(new Transacao(transacao.getValor(), transacao
				.getOperacao()));
		historico.setSaldo(saldo);
		historicoDao.update(historico);
	}

	private void loadHistorico(long id) {
		Historico ultima = historicoDao.search(id, Historico.class);
		if (Util.notNull.validar(ultima)) {
			this.historico = ultima;
		} else {
			this.historico = new Historico();
			historico.setSaldo(10000.0);
		}
	}
}
