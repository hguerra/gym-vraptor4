package br.com.model.bean;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

	@Column(name = "USUARIO_TIPO", nullable = false)
	private boolean aluno = true;

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idTreino")
	private Set<Treino> treino = new HashSet<Treino>();

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idStatus")
	private Set<Status> status = new HashSet<Status>();

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idLembretes")
	private Set<Lembrete> lembretes = new HashSet<Lembrete>();

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idAtividades")
	private Set<Atividade> atividades = new HashSet<Atividade>();

	public boolean isAluno() {
		return aluno;
	}

	public void setAluno(boolean aluno) {
		this.aluno = aluno;
	}

	public Set<Treino> getTreino() {
		return treino;
	}

	public void setTreino(Set<Treino> treino) {
		this.treino = treino;
	}

	public Set<Status> getStatus() {
		return status;
	}

	public void setStatus(Set<Status> status) {
		this.status = status;
	}

	public Set<Lembrete> getLembretes() {
		return lembretes;
	}

	public void setLembretes(Set<Lembrete> lembretes) {
		this.lembretes = lembretes;
	}

	public Set<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(Set<Atividade> atividades) {
		this.atividades = atividades;
	}

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
