package br.com.dao;

import java.util.List;

import br.com.model.bean.Atividade;
import br.com.model.bean.Lembrete;
import br.com.model.bean.Usuario;

public interface UsuarioDao {

	public boolean verificaUsuarioLogin(Usuario usuario);

	public Usuario carrega(Usuario usuario);
	
	List<Usuario> buscaTodosAlunoQueDevemDinheiro();
	
	List<Usuario> buscaTodosAlunosEmDia();
	
	List<Lembrete> buscarLembretes(Usuario filter);
	
	List<Atividade> buscarAtividades(Usuario filter);
	
	List<String> carregarStatus(long id);
}
