package br.com.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

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

	@Path("/about.jsp")
	public void about() {
	}
	
	@Path("/blogSingle.jsp")
	public void blogSingle() {
	}
	
	@Path("/blog.jsp")
	public void blog() {
	}
	
	@Path("/classes.jsp")
	public void classes() {
	}
	
	@Path("/contact.jsp")
	public void contact() {
	}
	
	@Path("/pricing.jsp")
	public void pricing() {
	}
	
	
	@Path("/singleClass.jsp")
	public void singleClass() {
	}
	
	@Path("/trainers.jsp")
	public void trainers() {
	}
	
	@Path("/login.jsp")
	public void login() {
		// TODO Auto-generated method stub

	}
	@Path("/register.jsp")
	public void register() {
		// TODO Auto-generated method stub

	}
	
}