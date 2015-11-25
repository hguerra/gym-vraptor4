package br.com.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.model.bean.Evento;

@Controller
public class IndexController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}

	@Inject
	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
	
	}

	@Get("/eventos")
	public List<Evento> eventos() {
		return null;
	}
	
	
	@Path("/pricing")
	public void pricing() {
	}
	
	
	@Path("/trainers")
	public void trainers() {
	}

	
}