package br.com.controller;

import br.com.caelum.vraptor.Controller;

@Controller
public class UsuarioController {
//	@Inject
//	private Result result;
//	@Inject
//	private Validator validator;
//	@Inject
//	private UsuarioDao dao;
//	@Inject
//	private UsuarioWeb usuarioWeb;
//
//	@Get("/login")
//	public void login() {
//
//	}
//
//	@Post("/login")
//	public void login(Usuario usuario) {
//		Usuario carregado = dao.carrega(usuario);
//		validator.addIf(carregado == null, new SimpleMessage("usuario.login",
//				"Login e/ou senha inválidos"));
//		validator.onErrorUsePageOf(this).login();
//		usuarioWeb.login(carregado);
//		result.redirectTo(IndexController.class).index();
//	}
//
//	@Get("/register")
//	public void register() {
//
//	}
//
//	@Post("/register")
//	public void register(@LoginAvailable Usuario usuario) {
//		validator.onErrorForwardTo(this).register();
//		dao.persist(usuario);
//		result.redirectTo(this).login();
//	}
//
//	@Path("/logout")
//	public void logout() {
//		usuarioWeb.logout();
//		result.redirectTo(IndexController.class).index();
//	}
}
