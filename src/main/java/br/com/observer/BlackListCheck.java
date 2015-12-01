package br.com.observer;

import java.util.List;

import javax.inject.Inject;

import br.com.dao.DefaultUsuarioDao;
import br.com.model.bean.Usuario;
import br.com.model.engine.Aviso;
import br.com.model.mail.Postman;
import br.com.validation.Util;

public class BlackListCheck implements Runnable {
	@Inject
	private DefaultUsuarioDao dao;

	@Override
	public void run() {
		realizarCobranca();
	}

	public void realizarCobranca() {
		List<Usuario> devedores = dao.buscaTodosAlunoQueDevemDinheiro();
		if (Util.list.validar(devedores)) {
			devedores.forEach(aluno -> {
				Aviso aviso = new Aviso();
				aviso.setEmailDestinatario(aluno.getEmail());
				aviso.setTitulo("Academia");
				aviso.setMensagem("Favor acertar taxa Academia");
				new Thread(new Postman(aviso)).start();
			});

		}
	}
}
