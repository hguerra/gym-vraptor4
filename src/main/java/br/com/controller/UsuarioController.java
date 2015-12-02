package br.com.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dao.DefaultUsuarioDao;
import br.com.infra.HibernateDao;
import br.com.interceptor.UsuarioInfo;
import br.com.model.bean.Atividade;
import br.com.model.bean.Lembrete;
import br.com.model.bean.Usuario;
import br.com.validation.LoginAvailable;
import easy.defaultInfo.ControllersInfo;

@Controller
public class UsuarioController {
	private final Result result;
	private final Validator validator;
	private final DefaultUsuarioDao dao;
	private final UsuarioInfo usuarioWeb;
	private final HibernateDao<Atividade> atividadeDao;
	private final HibernateDao<Lembrete> lembreteDao;
	private final HttpServletRequest request;

	/**
	 * @deprecated
	 */
	protected UsuarioController() {
		this(null, null, null, null, null, null, null);
	}

	@Inject
	public UsuarioController(Result result, Validator validator,
			DefaultUsuarioDao dao, UsuarioInfo usuarioWeb,
			HibernateDao<Atividade> atividadeDao,
			HibernateDao<Lembrete> lembreteDao, HttpServletRequest request) {
		this.result = result;
		this.validator = validator;
		this.dao = dao;
		this.usuarioWeb = usuarioWeb;
		this.atividadeDao = atividadeDao;
		this.lembreteDao = lembreteDao;
		this.request = request;
	}

	@Get("/login")
	public void login() {

	}

	@Post("/login")
	public void login(Usuario usuario) {
		Usuario carregado = dao.carrega(usuario);
		validator.addIf(carregado == null, new SimpleMessage("usuario.login",
				"Login e/ou senha inválidos"));
		validator.onErrorUsePageOf(this).login();
		usuarioWeb.login(carregado);
		result.redirectTo(IndexController.class).index();
	}

	@Get("/register")
	public void register() {

	}

	@Post("/register")
	public void register(@LoginAvailable Usuario usuario) {
		validator.onErrorForwardTo(this).register();
		dao.persist(usuario);
		result.redirectTo(this).login();
	}

	@Path("/logout")
	public void logout() {
		usuarioWeb.logout();
		result.redirectTo(IndexController.class).index();
	}

	@Get("/perfil")
	public void perfil() {
		List<String> status = usuarioWeb.getUsuario().getStatus().stream()
				.map(s -> {
					StringBuffer str = new StringBuffer();
					str.append(s.getMonth().toString());
					if (s.isPago())
						str.append("-> PAGO");
					else
						str.append("-> Não PAGO");
					return str.toString();
				}).collect(Collectors.toList());

		result.include("treinos", usuarioWeb.getUsuario().getTreino());
		result.include("status", status);
	}

	@Get("/atividades")
	public void atividades() {
		result.include("atividades", atividadeDao.getAll(Atividade.class));
	}

	@Get("/lembretes")
	public void lembretes() {
		result.include("lembretes", lembreteDao.getAll(Lembrete.class));
	}

	@Post("/cadastrarAtividade")
	public void cadastrarAtividade(Atividade atividade) {
		ControllersInfo.printAccess("cadastrarAtividade", atividade,
				Arrays.asList("getNome", "getDescricao"));

	}

	@Post("/cadastrarLembrete")
	public void cadastrarLembrete() {
		try {
			String strLembrete = request.getParameter("evento.nome");
			String str = request.getParameter("evento.data");
			LocalDate data = LocalDate.parse(str);
			Lembrete lembrete = new Lembrete();
			lembrete.setLembrete(strLembrete);
			lembrete.setData(data);

			lembreteDao.persist(lembrete);

			result.redirectTo(this).lembretes();

		} catch (Exception e) {
			result.redirectTo(this).lembretes();
		}

	}

	@Post("/removerEvento/{id}")
	public void removerEventos(long id) {
		System.out.println(id);
	}

	@Post("/removerAtividade/{id}")
	public void removerAtividade(long id) {
		System.out.println(id);
	}

	@Post("/removerLembrete/{id}")
	public void removerLembrete(long id) {
		System.out.println(id);

	}
}
