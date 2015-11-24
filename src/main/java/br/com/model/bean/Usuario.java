package br.com.model.bean;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.encrytion.Encryption;
import br.com.encrytion.EncryptionType;

@SuppressWarnings("serial")
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable, Comparable<Usuario> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "USUARIO_NOME", nullable = false)
	private String nome;

	@Column(name = "USUARIO_SENHA", nullable = false)
	private String senha;

	@Column(name = "USUARIO_EMAIL", nullable = false, unique = true)
	private String email;

	@Column(name = "USUARIO_SOBRENOME")
	private String sobreNome;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "USUARIO_ENDERECO")
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		try {
			if (senha != null) {
				Encryption encryption = new Encryption(EncryptionType.SHA1,
						senha.trim());
				this.senha = encryption.getEncryptedText();
			}
		} catch (NoSuchAlgorithmException e) {
			this.senha = null;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Usuario o) {
		String key = (this.id + this.email).toUpperCase();
		String keyO = (o.getId() + o.getEmail()).toUpperCase();
		return key.compareTo(keyO);
	}

}
