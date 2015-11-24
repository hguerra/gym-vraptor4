package br.com.controller;

import java.util.List;

import br.com.caelum.vraptor.Controller;
import br.com.model.bean.Atividade;
import br.com.model.bean.Conta;
import br.com.model.bean.Lembrete;
import br.com.model.bean.Status;
import br.com.model.bean.Treino;
@Controller
public class AlunosController {
	
	public List<Treino> visualizarTreino() {
		return null;
	}

	public void criarLembrete(Lembrete lembrete) {

	}

	public void removerLembrete(long id) {

	}

	public void cadastrarAtividade(Atividade atividade) {

	}

	public void removerAtividade(long id) {

	}
	
	//nessa jsp colocar o efetuar pagamento
	public List<Status> visulizarStatus() {
		return null;
	}

	public void efetuarPagamento(Conta conta) {
		
	}

}
