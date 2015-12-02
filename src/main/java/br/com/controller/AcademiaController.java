package br.com.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dao.DefaultUsuarioDao;
import br.com.infra.HibernateDao;
import br.com.interceptor.UsuarioInfo;
import br.com.model.bean.Evento;
import br.com.model.bean.Historico;
import br.com.model.bean.Transacao;
import br.com.model.bean.Treino;
import br.com.model.bean.Usuario;
import br.com.model.engine.Aviso;
import br.com.model.engine.Operacao;
import br.com.model.mail.Postman;
import br.com.observer.AcademiaInfo;

@Controller
public class AcademiaController {
	private final Result result;
	private final Validator validator;
	private final AcademiaInfo academia;
	private final HttpServletRequest request;
	private final DefaultUsuarioDao userDao;
	private final HibernateDao<Evento> eventoDao;
	private final HibernateDao<Historico> contasDao;

	/**
	 * @deprecated
	 */
	protected AcademiaController() {
		this(null, null, null, null, null, null, null, null);
	}

	@Inject
	public AcademiaController(Result result, Validator validator,
			AcademiaInfo academia, UsuarioInfo user,
			HttpServletRequest request, DefaultUsuarioDao userDao,
			HibernateDao<Evento> eventoDao, HibernateDao<Historico> contasDao) {
		this.result = result;
		this.validator = validator;
		this.academia = academia;
		this.request = request;
		this.userDao = userDao;
		this.eventoDao = eventoDao;
		this.contasDao = contasDao;

	}

	@Get("/adm")
	public void painelAdm() {
		Historico historico = academia.getGestorCaixa().getHistorico();
		Set<Transacao> transacoes = historico.getTransacoes();
		result.include("contas", transacoes);
	}

	@Get("/addExercicio/{id}")
	public void aluno(long id) {
		Usuario usuario = userDao.search(id, Usuario.class);
		validator.addIf(usuario == null, new SimpleMessage("usuario.null",
				"Usuario nao pode ser nulo"));
		validator.onErrorUsePageOf(this).painelAdm();
		result.include("user", usuario);
		result.include("treinos", usuario.getTreino());

	}

	@Post("/addExercicio/{id}/treino")
	public void cadastrarTreino(long id, Treino treino) {
		Usuario usuario = userDao.search(id, Usuario.class);
		validator.addIf(usuario == null, new SimpleMessage("usuario.null",
				"Usuario nao pode ser nulo"));
		validator.onErrorUsePageOf(this).painelAdm();
		usuario.getTreino().add(treino);
		userDao.update(usuario);
		result.redirectTo(this).aluno(id);
	}

	@Post("/removeExercicio/{userId}/treino/{treinoId}")
	public void removerTreino(long userId, long treinoId) {
		Usuario usuario = userDao.search(userId, Usuario.class);
		validator.addIf(usuario == null, new SimpleMessage("usuario.null",
				"Usuario nao pode ser nulo"));
		validator.onErrorUsePageOf(this).painelAdm();

		Set<Treino> treinos = usuario.getTreino();
		for (Treino t : treinos) {
			if (t.getId() == treinoId)
				treinos.remove(t);
		}

		usuario.setTreino(treinos);

		userDao.update(usuario);

		result.redirectTo(this).aluno(userId);
	}

	@Get("/buscar")
	public void buscarAluno(Usuario usuario) {
		// ControllersInfo.printAccess("buscarAluno", usuario,
		// Arrays.asList("getNome"));
		validator.addIf(usuario.getNome() == null, new SimpleMessage(
				"usuario.nome", "Nome nao pode ser nulo"));
		validator.onErrorUsePageOf(this).painelAdm();
		List<Usuario> usuarios = userDao.searchFilter(usuario);
		result.include("usuarios", usuarios);
		result.forwardTo(this).painelAdm();
	}

	@Get("/buscar/{id}")
	public void buscarAlunoStatus(long id) {
		List<String> status = userDao.carregarStatus(id);
		validator.addIf(status == null || status.isEmpty(), new SimpleMessage(
				"status", "status nao pode ser nulo"));
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

	@Get("/cadastrarConta")
	public void contasForm() {

	}

	@Post("/cadastrarConta")
	public void cadastrarConta() {
		try {
			String strValor = request.getParameter("transacao.valor");
			String operacao = request.getParameter("transacao.operacao");
			String str = request.getParameter("transacao.data") + " 12:30";
			Double valor = Double.parseDouble(strValor);
			Operacao op = operacao.equals("PAGAR") ? Operacao.PAGAR
					: Operacao.RECEBER;
			DateTimeFormatter formatter = DateTimeFormatter
					.ofPattern("yyyy-MM-dd HH:mm");
			LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

			Transacao transacao = new Transacao(valor, op, dateTime);

			academia.getGestorCaixa().getHistorico().addTransacao(transacao);

			contasDao.update(academia.getGestorCaixa().getHistorico());

			result.redirectTo(this).painelAdm();

		} catch (Exception e) {
			result.redirectTo(this).contasForm();
		}

	}

	@Get("/cadastrarEvento")
	public void eventosForm() {

	}

	@Post("/cadastrarEvento")
	public void cadastrarEventos() {
		try {
			String nome = request.getParameter("evento.nome");
			String descricao = request.getParameter("evento.descricao");
			String str = request.getParameter("evento.data") + " 12:30";

			DateTimeFormatter formatter = DateTimeFormatter
					.ofPattern("yyyy-MM-dd HH:mm");
			LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

			Evento evento = new Evento();
			evento.setNome(nome);
			evento.setDescricao(descricao);
			evento.setData(dateTime);

			eventoDao.persist(evento);

			result.redirectTo(this).eventos();

		} catch (Exception e) {
			result.redirectTo(this).eventosForm();
		}

	}

	@Get("/eventos")
	public void eventos() {
		List<Evento> eventos = eventoDao.getAll(Evento.class);
		LocalDateTime now = LocalDateTime.now();
		for (Evento e : eventos) {
			if (now.isAfter(e.getData())) {
				eventoDao.remove(e);
			}
		}
		eventos = eventoDao.getAll(Evento.class);
		result.include("eventos", eventos);
	}

}
