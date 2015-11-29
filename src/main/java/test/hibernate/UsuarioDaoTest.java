package test.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.dao.DefaultUsuarioDao;
import br.com.model.bean.Usuario;

public class UsuarioDaoTest {
	private DefaultUsuarioDao dao;

	@Before
	public void before() {
		dao = new DefaultUsuarioDao();
	}

	@Test
	public void persistTest() {
//		Usuario persist = new Usuario();
//		DefaultInfoTest.generateUserInfo(persist, "Persist");
//		dao.persist(persist);

	}

	@Test
	public void searchFilter() {
		Usuario filter = new Usuario();
		filter.setNome("Persist");
		List<Usuario> usuarios = null;
		try {
			usuarios = dao.searchFilter(filter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		DefaultSuperficialJunitTest.userEquals(new ArrayList<Usuario>(), usuarios);
	}

	@Test
	public void search() {
		Usuario usuario = null;
		try {
			usuario = dao.search(1L, Usuario.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		DefaultSuperficialJunitTest.userEquals(DefaultInfoTest.getUsuario(),
				usuario);
	}

	@Test
	public void getAll() {
		List<Usuario> usuarios = null;

		try {
			usuarios = dao.getAll(Usuario.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		DefaultSuperficialJunitTest.userEquals(new ArrayList<Usuario>(), usuarios);
	}

	@Test
	public void carrega() {
		Usuario usuario = new Usuario();
		usuario.setEmail("heitorguerrac.teste@gmail.com");
		usuario.setSenha("teste");

		Usuario encontrado = null;

		encontrado = dao.carrega(usuario);

		DefaultSuperficialJunitTest.userEquals(DefaultInfoTest.getUsuario(),
				encontrado);
	}

	@After
	public void after() {

	}
}
