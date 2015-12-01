package br.com.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dao.DefaultUsuarioDao;
import br.com.infra.Dao;
import br.com.infra.HibernateDao;
import br.com.interceptor.UsuarioInfo;
import br.com.model.bean.Atividade;
import br.com.model.bean.Evento;
import br.com.model.bean.Lembrete;
import br.com.model.bean.Transacao;
import br.com.model.bean.Treino;
import br.com.model.bean.Usuario;
import br.com.model.engine.Aviso;
import br.com.model.mail.Postman;
import br.com.observer.AcademiaInfo;
import easy.defaultInfo.ControllersInfo;

@Controller
public class AcademiaController {
	private final Result result;
	private final Validator validator;
	private final AcademiaInfo academia;
	private final UsuarioInfo user;
	private final DefaultUsuarioDao userDao;
	private final HibernateDao<Evento> eventoDao;

	/**
	 * @deprecated
	 */
	protected AcademiaController() {
		this(null, null, null, null, null, null);
	}

	@Inject
	public AcademiaController(Result result, Validator validator,
			AcademiaInfo academia, UsuarioInfo user, DefaultUsuarioDao userDao,
			HibernateDao<Evento> eventoDao) {
		this.result = result;
		this.validator = validator;
		this.academia = academia;
		this.user = user;
		this.userDao = userDao;
		this.eventoDao = eventoDao;

	}

	@Get("/adm")
	public void painelAdm() {

	}

	@Post("/addExercicio/{usuario.id}")
	public void cadastrarTreino(long id, Treino treino) {
		ControllersInfo.printAccess("cadastrarTreino", id);
		ControllersInfo.printAccess("cadastrarTreino", treino, Arrays.asList("getNome"));

	}

	@Post("/removeExercicio")
	public void removerTreino(long id) {
		ControllersInfo.printAccess("removerTreino", id);
	}

	@Get("/buscar")
	public void buscarAluno(Usuario usuario) {
		//ControllersInfo.printAccess("buscarAluno", usuario, Arrays.asList("getNome"));
		validator.addIf(usuario.getNome() == null, new SimpleMessage("usuario.nome",
				"Nome nao pode ser nulo"));
		validator.onErrorUsePageOf(this).painelAdm();
		List<Usuario> usuarios = userDao.searchFilter(usuario);
		result.include("usuarios", usuarios);
		result.forwardTo(this).painelAdm();
	}

	@Get("/buscar/{id}")
	public void buscarAlunoStatus(long id) {
		List<String> status = userDao.carregarStatus(id);
		validator.addIf(status == null || status.isEmpty(), new SimpleMessage("status",
				"status nao pode ser nulo"));
		validator.onErrorUsePageOf(this).painelAdm();
		result.include("status", status);
		result.forwardTo(this).painelAdm();
	}

	@Get("/buscarTodosAlunos")
	public List<Usuario> buscarTodosAlunos() {
		return userDao.getAll(Usuario.class);
	}

	@Get("/inadimplentes")
	public void buscarTodosDevedores() {
		result.include("devedores", userDao.buscaTodosAlunoQueDevemDinheiro());
	}

	@Post
	public void cobrar(String email) {
		Aviso aviso = new Aviso();
		aviso.setEmailDestinatario(email);
		aviso.setTitulo("Academia");
		aviso.setMensagem("Favor acertar taxa Academia");
		new Thread(new Postman(aviso)).start();
		result.redirectTo(this).buscarTodosDevedores();
	}

	@Post("/cadastrarConta")
	public void cadastrarConta(Transacao transacao) {
		ControllersInfo.printAccess("cadastrarConta", transacao, Arrays.asList("getNome"));

	}

	@Post("/cadastrarEvento")
	public void cadastrarEventos(Evento evento) {
		ControllersInfo.printAccess("cadastrarEventos", evento, Arrays.asList("getNome"));

	}

	@Post("/cadastrarAtividade")
	public void cadastrarAtividade(Atividade atividade) {
		ControllersInfo.printAccess("cadastrarAtividade", atividade, Arrays.asList("getNome"));

	}

	@Post("/cadastrarLembrete")
	public void cadastrarLembrete(Lembrete lembrete) {
		ControllersInfo.printAccess("cadastrarLembrete", lembrete, Arrays.asList("getNome"));

	}

	@Delete("/removerEvento/{id}")
	public void removerEventos(long id) {
		ControllersInfo.printAccess("removerEventos", id);
	}

	@Delete("/removerAtividade/{id}")
	public void removerAtividade(long id) {
		ControllersInfo.printAccess("removerAtividade", id);
	}

	@Delete("/removerLembrete/{id}")
	public void removerLembrete(long id) {
		ControllersInfo.printAccess("removerLembrete", id);

	}

	public void listarLembretes(long id) {
		Usuario usuario = userDao.search(id, Usuario.class);
		validator.addIf(usuario == null, new SimpleMessage("usuario.id",
				"Usuario inexistente"));
		validator.onErrorUsePageOf(IndexController.class).index();
		result.include("lembretes", userDao.buscarLembretes(usuario));
	}

	public void listarAtividades(long id) {
		Usuario usuario = userDao.search(id, Usuario.class);
		validator.addIf(usuario == null, new SimpleMessage("usuario.id",
				"Usuario inexistente"));
		validator.onErrorUsePageOf(IndexController.class).index();
		result.include("atividades", userDao.buscarAtividades(usuario));
	}

	@Get("/eventos")
	public void eventos() {
		result.include("eventos", eventoDao.getAll(Evento.class));
	}

}
