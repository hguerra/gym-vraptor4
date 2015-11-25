package br.com.model.defaultInfo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Email implements Serializable {
	private String email;
	private String senha;
	private Provedor provedor;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Provedor getProvedor() {
		return provedor;
	}

	public void setProvedor(Provedor provedor) {
		this.provedor = provedor;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
