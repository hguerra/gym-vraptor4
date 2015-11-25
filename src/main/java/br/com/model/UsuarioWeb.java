package br.com.model;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.model.bean.Usuario;

@SuppressWarnings("serial")
@SessionScoped
@Named("usuario")
public class UsuarioWeb implements Serializable {
	private Usuario logado;

	public void login(Usuario usuario) {
		this.logado = usuario;
	}

	public String getNome() {
		return logado.getNome();
	}

	public boolean isLogado() {
		return logado != null;
	}

	public void logout() {
		this.logado = null;
	}

	public Usuario getUsuario() {
		return logado;
	}

	public String getEmail() {
		return logado.getEmail();
	}
	
	public boolean isAluno(){
		return logado.isAluno();
	}

}
