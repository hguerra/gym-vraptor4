package br.com.dao;

import java.util.List;

import br.com.dao.detailed.AlunoHibernateDao;
import br.com.dao.generic.GenericHibernateDao;
import br.com.model.bean.Aluno;

public class AlunoDao extends GenericHibernateDao<Aluno> implements AlunoHibernateDao{

	@Override
	public List<Aluno> buscaTodosAlunoQueDevemDinheiro() {
		// TODO Auto-generated method stub
		return null;
	}

}
