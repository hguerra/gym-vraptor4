package br.com.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dao.DefaultUsuarioDao;
import br.com.interceptor.UsuarioInfo;
import br.com.model.bean.Usuario;
import br.com.validation.LoginAvailable;

@Controller
public class UsuarioController {
	private final Result result;
	private final Validator validator;
	private final DefaultUsuarioDao dao;
	private final UsuarioInfo usuarioWeb;

	/**
	 * @deprecated
	 */
	protected UsuarioController() {
		this(null, null, null, null);
	}

	@Inject
	public UsuarioController(Result result, Validator validator,
			DefaultUsuarioDao dao, UsuarioInfo usuarioWeb) {
		this.result = result;
		this.validator = validator;
		this.dao = dao;
		this.usuarioWeb = usuarioWeb;
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

	}

	@Get("/atividades")
	public void atividades() {

	}

	@Get("/lembretes")
	public void lembretes() {

	}
}
