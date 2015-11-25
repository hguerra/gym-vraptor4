package hibernate.test;

import java.util.HashSet;
import java.util.Set;

import br.com.dao.UsuarioDao;
import br.com.model.bean.Endereco;
import br.com.model.bean.Treino;
import br.com.model.bean.Usuario;

public class AlunoDaoTeste {

	public static void main(String[] args) {
		AlunoDaoTeste dao = new AlunoDaoTeste();
		dao.update();
	}

	public void save() {
		UsuarioDao dao = new UsuarioDao();
		
		Endereco endereco = new Endereco();
		endereco.setRua("Cruzeiro");
		endereco.setNumero(224);
		endereco.setBairro("Bosque dos Eucaliptos");
		endereco.setCidade("Sao Jose dos Campos");
		endereco.setPais("Brasil");

		Usuario aluno = new Usuario();
		aluno.setNome("AHeitor");
		aluno.setSobreNome("Carneiro");
		aluno.setEmail("alunoheitorguerrac.teste@gmail.com");
		aluno.setSenha("teste");
		aluno.setEndereco(endereco);
	
		Set<Treino> treinos = new HashSet<Treino>();
		Treino treino = new Treino();
		treino.setExercicio("Supino");
		
		treinos.add(treino);
		
		aluno.setTreino(treinos);

		dao.persist(aluno);
	}
	
	public void update(){
		UsuarioDao dao = new UsuarioDao();
		Usuario user = dao.search(4L, Usuario.class);
		if(user!= null){
			System.out.println(user.getNome());
			System.out.println(user.isAluno());
			user.setAluno(true);
			dao.update(user);
		}
	}

	


}
