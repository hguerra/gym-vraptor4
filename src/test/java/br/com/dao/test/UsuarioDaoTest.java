package br.com.dao.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import easy.defaultInfo.DefaultEmailInfo;
import easy.defaultInfo.DefaultSuperficialJunitTest;
import br.com.dao.DefaultUsuarioDao;
import br.com.model.bean.Usuario;
import br.com.model.engine.Aviso;
import br.com.model.mail.DefaultCommonsEmail;
import br.com.model.mail.Email;
import br.com.observer.BlackListCheck;
import br.com.validation.Util;

public class UsuarioDaoTest {
	private DefaultUsuarioDao dao;

	@Before
	public void before() {
		dao = new DefaultUsuarioDao();
	}

	@Test
	public void persistTest() {
		// Usuario persist = new Usuario();
		// DefaultInfoTest.generateUserInfo(persist, "Devedor",
		// "teste2@gmail.com");
		// persist.setAluno(true);
		// Set<Status> status = new HashSet<Status>();
		// Status s1 = new Status();
		// s1.setMonth(Month.OCTOBER);
		// s1.setPago(false);
		// status.add(s1);
		// persist.setStatus(status);
		// dao.persist(persist);

	}

	@Test
	public void searchTodosAlunoQueDevemDinheiro() {
		List<Usuario> usuarios = null;
		try {
			usuarios = dao.buscaTodosAlunoQueDevemDinheiro();
		} catch (Exception e) {
			e.printStackTrace();
		}

		DefaultSuperficialJunitTest.equals(new ArrayList<Usuario>(), usuarios);
	}

	@Test
	public void searchTodosAlunosEmDia() {
		List<Usuario> usuarios = null;
		try {
			usuarios = dao.buscaTodosAlunosEmDia();
		} catch (Exception e) {
			e.printStackTrace();
		}

		DefaultSuperficialJunitTest.equals(new ArrayList<Usuario>(), usuarios);
	}

	//
	// @Test
	// public void searchFilter() {
	// Usuario filter = new Usuario();
	// filter.setNome("Persist");
	// List<Usuario> usuarios = null;
	// try {
	// usuarios = dao.searchFilter(filter);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// DefaultSuperficialJunitTest.userEquals(new ArrayList<Usuario>(),
	// usuarios);
	// }
	//
	// @Test
	// public void search() {
	// Usuario usuario = null;
	// try {
	// usuario = dao.search(1L, Usuario.class);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// DefaultSuperficialJunitTest.userEquals(DefaultInfoTest.getUsuario(),
	// usuario);
	// }
	//
	// @Test
	// public void getAll() {
	// List<Usuario> usuarios = null;
	//
	// try {
	// usuarios = dao.getAll(Usuario.class);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// DefaultSuperficialJunitTest.userEquals(new ArrayList<Usuario>(),
	// usuarios);
	// }
	//
	// @Test
	// public void carrega() {
	// Usuario usuario = new Usuario();
	// usuario.setEmail("heitorguerrac.teste@gmail.com");
	// usuario.setSenha("teste");
	//
	// Usuario encontrado = null;
	//
	// encontrado = dao.carrega(usuario);
	//
	// DefaultSuperficialJunitTest.userEquals(DefaultInfoTest.getUsuario(),
	// encontrado);
	// }

	@After
	public void after() {

	}
}
