package br.com.dao.detailed;

import java.util.List;

import br.com.infra.Dao;
import br.com.model.bean.Aluno;

public interface AlunoHibernateDao extends Dao<Aluno>{
	List<Aluno> buscaTodosAlunoQueDevemDinheiro();
	List<Aluno> buscaTodosAlunosEmDia();
	
}
