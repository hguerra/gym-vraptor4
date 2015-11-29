package br.com.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dao.DefaultUsuarioDao;
import br.com.interceptor.Private;
import br.com.interceptor.UsuarioInfo;
import br.com.model.bean.Atividade;
import br.com.model.bean.Evento;
import br.com.model.bean.Lembrete;
import br.com.model.bean.Transacao;
import br.com.model.bean.Treino;
import br.com.model.bean.Usuario;

@Controller
public class AcademiaController {
	private final Result result;
	private final Validator validator;
	private final DefaultUsuarioDao dao;
	private final UsuarioInfo user;
	
	/**
	 * @deprecated
	 */
	protected AcademiaController() {
		this(null, null, null, null);
	}
	
	@Inject
	public AcademiaController(Result result, Validator validator,
			DefaultUsuarioDao dao, UsuarioInfo user) {
		this.result = result;
		this.validator = validator;
		this.dao = dao;
		this.user = user;
	}

	@Get("/adm")
	public void painelAdm() {

	}
	
	@Private
	@Post("/addExercicio/{usuario.id}")
	public void cadastrarTreino(long id, Treino treino) {
		System.out.println(id);
		System.out.println(treino);

	}
	
	@Private
	@Post("/removeExercicio")
	public void removerTreino(long id) {
	}

	@Private
	@Get("/buscar")
	public List<Usuario> buscarAluno(Usuario usuario) {
		validator.addIf(usuario == null, new SimpleMessage("usuario.nome","Nome nao pode ser nulo"));
		validator.onErrorUsePageOf(this).painelAdm();
		List<Usuario> usuarios = dao.searchFilter(usuario);
		return usuarios;
	}

	@Private
	@Get("/buscarTodosAlunos")
	public List<Usuario> buscarTodosAlunos() {
		return dao.getAll(Usuario.class);
	}
	
	@Private
	@Get("/buscarTodosDevedores")
	public List<Usuario> buscarTodosDevedores() {
		return dao.buscaTodosAlunoQueDevemDinheiro();
	}

	@Private
	@Post("/cadastrarConta")
	public void cadastrarConta(Transacao transacao) {

	}
	@Private
	@Post("/cadastrarEvento")
	public void cadastrarEventos(Evento evento) {

	}
	@Private
	@Post("/cadastrarAtividade")
	public void cadastrarAtividade(Atividade atividade) {

	}
	@Post("/cadastrarLembrete")
	public void cadastrarLembrete(Lembrete lembrete) {

	}
	@Private
	@Post("/removerEvento/{evento.id}")
	public void removerEventos(long id) {

	}
	@Private
	@Post("/removerAtividade/{atividade.id}")
	public void removerAtividade(long id) {

	}
	@Private
	@Post("/removerLembrete/{lembrete.id}")
	public void removerLembrete(long id) {

	}
	
	@Private
	public List<Lembrete> listarLembretes(long id) {
		return dao.buscarLembretes(user.getUsuario());
	}
	
	@Private
	public List<Atividade> listarAtividades(long id) {
		return dao.buscarAtividades(user.getUsuario());
	}
	
	
	


}
