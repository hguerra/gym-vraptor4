package br.com.model.bean;

import java.util.HashSet;
import java.util.Set;

import com.google.gson.Gson;

public class Historico {
	private long id;

	private Double saldo;
	private Set<Transacao> transacoes = new HashSet<Transacao>();

	public Historico(Double saldo) {
		this.saldo = saldo;
	}

	public void addTransacao(Transacao transacao) {
		transacoes.add(transacao);
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
