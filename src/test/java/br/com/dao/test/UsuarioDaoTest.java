package br.com.dao.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.dao.UsuarioDao;
import br.com.model.bean.Endereco;
import br.com.model.bean.Usuario;

public class UsuarioDaoTest {
	private Endereco endereco;
	private Usuario usuario;
	private UsuarioDao dao;

	@Before
	public void before() {
		dao = new UsuarioDao();
		
		endereco = new Endereco();
		endereco.setRua("Cruzeiro");
		endereco.setNumero(224);
		endereco.setBairro("Bosque dos Eucaliptos");
		endereco.setCidade("Sao Jose dos Campos");
		endereco.setPais("Brasil");

		usuario = new Usuario();
		usuario.setNome("Heitor");
		usuario.setSobreNome("Carneiro");
		usuario.setEmail("heitorguerrac.teste@gmail.com");
		usuario.setSenha("teste");
		usuario.setEndereco(endereco);
	}

	@Test
	public void persistTest() {
		dao.persist(usuario);
	}

	@After
	public void after() {
		usuario = null;
		endereco = null;
	}

}
