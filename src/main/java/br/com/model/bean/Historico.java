package br.com.model.bean;

import java.io.Serializable;
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
import javax.persistence.Table;

import com.google.gson.Gson;

@SuppressWarnings("serial")
@Entity
@Table(name = "HISTORICO")
public class Historico implements Serializable {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private Double saldo;

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idTransacao")
	private Set<Transacao> transacoes = new HashSet<Transacao>();

	public Historico() {

}

	public void addTransacao(Transacao transacao) {
		transacoes.add(transacao);
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setTransacoes(Set<Transacao> transacoes) {
		this.transacoes = transacoes;
	}

	public Set<Transacao> getTransacoes() {
		return transacoes;
	}

	public Double getSaldo() {
		return saldo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
