package br.com.controller;

import java.util.List;

import easy.defaultInfo.ControllersInfo;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.model.bean.Status;
import br.com.model.bean.Transacao;
import br.com.model.bean.Treino;
@Controller
public class AlunosController {
	@Get("/visualizarTreino")
	public List<Treino> visualizarTreino() {
		return null;
	}
	
	@Get("/visualizarStatus")
	public List<Status> visualizarStatus() {
		return null;
	}
	@Post("/pagamento")
	public void efetuarPagamento(Transacao transacao) {
		ControllersInfo.printAccess("efetuarPagamento", transacao);
	}

}
