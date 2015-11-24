package br.com.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.model.bean.Usuario;

@SessionScoped
@Named("usuario")
public class UsuarioWeb {
	private Usuario logado;

	public void login(Usuario usuario) {
		this.logado = usuario;
	}

	public String getNome() {
		return logado.getNome();
	}

	public boolean isOnline() {
		return logado != null;
	}

	public void logout() {
		this.logado = null;
	}

	public Usuario getUsuario() {
		return logado;
	}

	public String generateNewPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		return null;
	}

}
