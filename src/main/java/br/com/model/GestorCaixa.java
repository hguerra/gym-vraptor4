package br.com.model;

import java.time.LocalDate;
import java.util.List;

import br.com.dao.UsuarioDao;
import br.com.infra.GenericHibernateDao;
import br.com.model.bean.Historico;
import br.com.model.bean.Transacao;
import br.com.model.bean.Usuario;
import br.com.validator.Validator;

public class GestorCaixa implements Gestor {
	private Caixa caixa;
	private Historico historico;
	private GenericHibernateDao<Historico> historicoDao;
	private Validator<Double> caixaValidator = (v) -> v <= caixa.getSaldo();
	private boolean cobrancaRealizada = false;
	private Validator<LocalDate> cobrancaValidator = c -> {
		if (c.getDayOfMonth() == 5 && cobrancaRealizada == false)
			return true;
		return false;
	};

	public GestorCaixa(long id) {
		historicoDao = new GenericHibernateDao<Historico>();
		iniciaHistorico(id);
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

	/**
	 * default metodos
	 */

	private void iniciaHistorico(long id) {
		Historico ultima = historicoDao.search(id, Historico.class);
		if (ultima != null) {
			this.historico = ultima;
		} else {
			this.historico = new Historico();
			historico.setSaldo(10000.0);
		}
	}

	private void registraTransacao(Double saldo, Transacao transacao) {
		historico.addTransacao(new Transacao(transacao.getValor(), transacao
				.getOperacao()));
		historico.setSaldo(saldo);
		realizarCobranca();
		historicoDao.update(historico);
	}

	private void realizarCobranca() {
		if (cobrancaValidator.validar(LocalDate.now())) {
			UsuarioDao dao = new UsuarioDao();
			List<Usuario> devedores = dao.buscaTodosAlunoQueDevemDinheiro();
			if (devedores != null && !devedores.isEmpty()) {
				enviarEmail(devedores);
			}
			cobrancaRealizada = true;
		} else {
			cobrancaRealizada = false;
		}
	}

	private void enviarEmail(List<Usuario> alunos) {
		alunos.forEach(aluno -> {
			Aviso aviso = new Aviso();
			aviso.setEmailDestinatario(aluno.getEmail());
			aviso.setTitulo("Academia");
			aviso.setMensagem("Favor acetar taxa Academia");
			new Thread(new Cobrador(aviso)).start();
		});
	}

	public Double getSaldo(){
		return historico.getSaldo();
	}
}
