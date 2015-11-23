package br.com.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.model.bean.Usuario;

public class UsuarioController {
	@Inject
	private Result result;
	@Inject
	private Validator validator;

	public void login() {

	}

	@Post("/login")
	public void login(Usuario usuario) {

	}

	@Path("/logout")
	public void logout() {

	}

	public void register() {
	}
}
