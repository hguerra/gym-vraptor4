package br.com.interceptor;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.vraptor.BeforeCall;
import br.com.caelum.vraptor.Intercepts;

@Intercepts
public class NoCacheInterceptor {

	@Inject
	private HttpServletResponse response;

	@BeforeCall
	public void intercept() {

		// set the expires to past
		response.setHeader("Expires", "Wed, 31 Dec 1969 21:00:00 GMT");

		// no-cache headers for HTTP/1.1
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");

		// no-cache headers for HTTP/1.1 (IE)
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");

		// no-cache headers for HTTP/1.0
		response.setHeader("Pragma", "no-cache");
	}
}