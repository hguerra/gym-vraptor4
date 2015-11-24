package br.com.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.dao.UsuarioDao;
import br.com.model.UsuarioWeb;
import br.com.model.bean.Usuario;
import br.com.validator.LoginAvailable;

@Controller
public class UsuarioController {
	@Inject
	private Result result;
	@Inject
	private Validator validator;
	@Inject
	private UsuarioDao dao;
	@Inject
	private UsuarioWeb usuarioWeb;

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
}
