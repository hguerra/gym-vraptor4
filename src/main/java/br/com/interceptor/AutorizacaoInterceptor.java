package br.com.interceptor;

import javax.inject.Inject;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.controller.IndexController;

@Intercepts
public class AutorizacaoInterceptor implements Interceptor {
	@Inject
	private UsuarioInfo usuario;
	@Inject
	private Result result;

	@Override
	public boolean accepts(ControllerMethod method) {
		return usuario.isLogado() && usuario.getUsuario().isAluno()
				&& method.containsAnnotation(Funcionario.class);
	}

	@Override
	public void intercept(InterceptorStack arg0, ControllerMethod arg1,
			Object arg2) throws InterceptionException {
		result.redirectTo(IndexController.class).index();

	}
}
