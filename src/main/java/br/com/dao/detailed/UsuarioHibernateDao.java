package br.com.dao.detailed;

import br.com.model.bean.Usuario;

public interface UsuarioHibernateDao {

	public boolean verificaUsuarioLogin(Usuario usuario);

	public Usuario carrega(Usuario usuario);

}
