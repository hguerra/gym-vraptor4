package br.com.dao;

import org.hibernate.criterion.Restrictions;

import br.com.dao.detailed.UsuarioHibernateDao;
import br.com.infra.GenericHibernateDao;
import br.com.infra.HibernateControl;
import br.com.model.bean.Usuario;

public class UsuarioDao extends GenericHibernateDao<Usuario> implements
		UsuarioHibernateDao {

	@Override
	public boolean verificaUsuarioLogin(Usuario usuario) {
		session = HibernateControl.getSession();

		session.beginTransaction();
		
		Usuario encontrado = (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("email", usuario.getEmail()))
				.uniqueResult();
		
		session.getTransaction().commit();

		session.flush();

		session.close();
		
		return encontrado != null;
	}

	public Usuario carrega(Usuario usuario) {
		session = HibernateControl.getSession();

		session.beginTransaction();
		
		Usuario carregado = (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("email", usuario.getEmail()))
				.add(Restrictions.eq("senha", usuario.getSenha()))
				.uniqueResult();
		
		session.getTransaction().commit();

		session.flush();

		session.close();
		
		return carregado; 
	}

}
