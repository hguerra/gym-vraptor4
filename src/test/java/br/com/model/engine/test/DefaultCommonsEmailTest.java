package br.com.model.engine.test;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import easy.defaultInfo.DefaultEmailInfo;
import br.com.dao.DefaultUsuarioDao;
import br.com.model.bean.Usuario;
import br.com.model.engine.Aviso;
import br.com.model.mail.CommonsEmail;
import br.com.model.mail.DefaultCommonsEmail;
import br.com.model.mail.Email;
import br.com.model.mail.Postman;
import br.com.validation.Util;

public class DefaultCommonsEmailTest {
	private CommonsEmail send;
	private Email email;
	private DefaultUsuarioDao dao;

	@Before
	public void before() {
		send = new DefaultCommonsEmail();
		email = DefaultEmailInfo.getDefaultEmail();
		dao = new DefaultUsuarioDao();
	}

	@Test
	public void testSimpleEmail() {
		 Aviso aviso = new Aviso();
		 aviso.setEmailDestinatario("heitorguerrac@gmail.com");
		 aviso.setTitulo("Academia");
		 aviso.setMensagem("Favor acertar taxa Academia");
		 send.simpleEmail(email, aviso);
	}

	@Test
	public void cobranca() {
		List<Usuario> devedores = dao.buscaTodosAlunoQueDevemDinheiro();
		if (Util.list.validar(devedores)) {
			devedores.forEach(aluno -> {
				List<String> status = aluno.getStatus().stream()
						.filter(s -> !s.isPago())
						.map(s -> s.getMonth().toString())
						.collect(Collectors.toList());
				Aviso aviso = DefaultEmailInfo.getDefaultAviso(
						aluno.getEmail(), status);
				status.forEach(s -> System.out.println(aluno.getNome()+":"+s));
				new Thread(new Postman(aviso)).start();
			});
		}
	}

	@Test
	public void testHtmlEmail() {

	}

	@Test
	public void testMultiPartEmail() {

	}

}
