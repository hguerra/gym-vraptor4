package hibernate.test;

import java.util.List;

import br.com.dao.UsuarioDao;
import br.com.model.bean.Endereco;
import br.com.model.bean.Usuario;

public class UsuarioDaoTeste {

	public static void main(String[] args) {
		UsuarioDaoTeste dao = new UsuarioDaoTeste();
		// dao.save2();
		// dao.search();
		// dao.remove();
		// dao.getAll();
		dao.carrega();
	}

	public void save() {
		Endereco endereco;
		Usuario usuario;
		UsuarioDao dao;

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

		dao.persist(usuario);
	}

	public void save2() {
		Endereco endereco;
		Usuario usuario;
		UsuarioDao dao;

		dao = new UsuarioDao();

		endereco = new Endereco();
		endereco.setRua("Cruzeiro");
		endereco.setNumero(224);
		endereco.setBairro("Bosque dos Eucaliptos");
		endereco.setCidade("Sao Jose dos Campos");
		endereco.setPais("Brasil");

		usuario = new Usuario();
		usuario.setNome("Isabela");
		usuario.setSobreNome("Gonçalves");
		usuario.setEmail("isabela.ilma@hotmail.com");
		usuario.setSenha("teste");
		usuario.setEndereco(endereco);

		dao.persist(usuario);
	}

	public void search() {
		Usuario usuario = null;
		UsuarioDao dao;

		dao = new UsuarioDao();

		try {
			usuario = dao.search(1L, Usuario.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (usuario != null) {
			System.out.println(usuario.getNome());
			System.out.println(usuario.getEndereco().getRua());
		} else {
			System.out.println("NAO ACHADO!");
		}
	}

	public void getAll() {
		List<Usuario> usuarios = null;
		UsuarioDao dao;

		dao = new UsuarioDao();

		try {
			usuarios = dao.getAll(Usuario.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (usuarios == null) {
			System.out.println("NULO!");
		} else if (usuarios.isEmpty()) {
			System.out.println("NAO ACHADO!");
		} else {
			for (Usuario u : usuarios) {
				System.out.println(u.getNome());
			}
		}
	}

	public void carrega() {
		Usuario usuario = new Usuario();
		usuario.setEmail("heitorguerrac.teste@gmail.com");
		usuario.setSenha("teste");

		UsuarioDao dao = new UsuarioDao();

		Usuario encontrado = null;
		
		encontrado = dao.carrega(usuario);

		if (encontrado != null) {
			System.out.println(encontrado.getNome());
			System.out.println(encontrado.getSenha());
		} else {
			System.out.println("NAO ACHADO!");
		}

	}

	public void remove() {

	}

	public void update() {

	}

}
