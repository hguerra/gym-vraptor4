package br.com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.criterion.Restrictions;

import br.com.infra.HibernateDao;
import br.com.infra.HibernateControl;
import br.com.model.bean.Atividade;
import br.com.model.bean.Lembrete;
import br.com.model.bean.Status;
import br.com.model.bean.Usuario;

public class DefaultUsuarioDao extends HibernateDao<Usuario> implements
		UsuarioDao {

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

	@Override
	public List<Usuario> buscaTodosAlunoQueDevemDinheiro() {
		Usuario filter = new Usuario();
		filter.setAluno(true);
		Set<Status> status = filter.getStatus().stream()
				.filter(p -> !p.isPago()).collect(Collectors.toSet());
		filter.setStatus(status);
		List<Usuario> usuarios = searchFilter(filter);
		return usuarios;
	}

	@Override
	public List<Usuario> buscaTodosAlunosEmDia() {
		Usuario filter = new Usuario();
		filter.setAluno(true);
		Set<Status> status = filter.getStatus().stream()
				.filter(p -> p.isPago()).collect(Collectors.toSet());
		filter.setStatus(status);
		List<Usuario> usuarios = searchFilter(filter);
		return usuarios;
	}

	@Override
	public List<Lembrete> buscarLembretes(Usuario filter) {
		Usuario user = search(filter.getId(), Usuario.class);
		List<Lembrete> lembretes = new ArrayList<Lembrete>(user.getLembretes());
		return lembretes;
	}

	@Override
	public List<Atividade> buscarAtividades(Usuario filter) {
		Usuario user = search(filter.getId(), Usuario.class);
		List<Atividade> atividades = new ArrayList<Atividade>(
				user.getAtividades());
		return atividades;
	}

	@Override
	public List<String> carregarStatus(long id) {
		Usuario usuario = search(id, Usuario.class);
		if (usuario != null) {
			List<String> status = usuario.getStatus().stream().map(s -> {
				StringBuffer str = new StringBuffer();
				str.append(s.getMonth().toString());
				if (s.isPago())
					str.append("-> PAGO");
				else
					str.append("-> Não PAGO");
				return str.toString();
			}).collect(Collectors.toList());
			return status;
		}
		return null;
	}

}
