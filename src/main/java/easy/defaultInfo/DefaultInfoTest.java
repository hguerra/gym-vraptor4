package easy.defaultInfo;

import br.com.model.bean.Endereco;
import br.com.model.bean.Usuario;

public class DefaultInfoTest {
	
	public static Endereco getEndereco() {
		Endereco endereco = new Endereco();
		endereco.setRua("Cruzeiro");
		endereco.setNumero(224);
		endereco.setBairro("Bosque dos Eucaliptos");
		endereco.setCidade("Sao Jose dos Campos");
		endereco.setPais("Brasil");
		return endereco;
	}

	public static Usuario getUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome("Heitor");
		usuario.setSobreNome("Carneiro");
		usuario.setEmail("heitorguerrac.teste@gmail.com");
		usuario.setSenha("teste");
		usuario.setEndereco(getEndereco());
		return usuario;
	}
	public static void generateUserInfo(Usuario usuario, String nome, String email){
		usuario.setNome(nome);
		usuario.setSobreNome("Sobrenome");
		usuario.setEmail(email);
		usuario.setSenha("teste");
		usuario.setEndereco(getEndereco());
	}

	public static String getSenha() {
		return "teste";
	}

}
