package br.com.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dao.UsuarioDao;
import br.com.interceptor.Restrito;
import br.com.model.UsuarioWeb;
import br.com.model.bean.Atividade;
import br.com.model.bean.Evento;
import br.com.model.bean.Lembrete;
import br.com.model.bean.Transacao;
import br.com.model.bean.Treino;
import br.com.model.bean.Usuario;

@Controller
public class AcademiaController {
	@Inject
	private Result result;

	@Inject
	private Validator validator;

	@Inject
	private UsuarioDao dao;
	
	@Inject
	private UsuarioWeb user;

	@Get("/adm")
	public void painelAdm() {

	}
	
	@Restrito
	@Post("/addExercicio/{usuario.id}")
	public void cadastrarTreino(long id, Treino treino) {
		System.out.println(id);
		System.out.println(treino);

	}
	
	@Restrito
	@Post("/removeExercicio")
	public void removerTreino(long id) {
	}

	@Restrito
	@Get("/buscar")
	public List<Usuario> buscarAluno(Usuario usuario) {
		validator.addIf(usuario == null, new SimpleMessage("usuario.nome","Nome nao pode ser nulo"));
		validator.onErrorUsePageOf(this).painelAdm();
		List<Usuario> usuarios = dao.searchFilter(usuario);
		return usuarios;
	}

	@Restrito
	@Get("/buscarTodosAlunos")
	public List<Usuario> buscarTodosAlunos() {
		return dao.getAll(Usuario.class);
	}
	
	@Restrito
	@Get("/buscarTodosDevedores")
	public List<Usuario> buscarTodosDevedores() {
		return dao.buscaTodosAlunoQueDevemDinheiro();
	}

	@Restrito
	@Post("/cadastrarConta")
	public void cadastrarConta(Transacao transacao) {

	}
	@Restrito
	@Post("/cadastrarEvento")
	public void cadastrarEventos(Evento evento) {

	}
	@Restrito
	@Post("/cadastrarAtividade")
	public void cadastrarAtividade(Atividade atividade) {

	}
	@Post("/cadastrarLembrete")
	public void cadastrarLembrete(Lembrete lembrete) {

	}
	@Restrito
	@Post("/removerEvento/{evento.id}")
	public void removerEventos(long id) {

	}
	@Restrito
	@Post("/removerAtividade/{atividade.id}")
	public void removerAtividade(long id) {

	}
	@Restrito
	@Post("/removerLembrete/{lembrete.id}")
	public void removerLembrete(long id) {

	}
	
	@Restrito
	public List<Lembrete> listarLembretes(long id) {
		return dao.buscarLembretes(user.getUsuario());
	}
	
	@Restrito
	public List<Atividade> listarAtividades(long id) {
		return dao.buscarAtividades(user.getUsuario());
	}
	
	
	


}
