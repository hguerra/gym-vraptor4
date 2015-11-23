package br.com.model.bean;

import java.time.LocalDateTime;

import br.com.model.GestorCaixa.Operacao;

import com.google.gson.Gson;

public class Transacao {

	private long id;

	private Double valor;
	private Operacao operacao;
	private LocalDateTime data;

	public Transacao(Double valor, Operacao operacao) {
		this.valor = valor;
		this.operacao = operacao;
		this.data = LocalDateTime.now();

	}

	public Transacao(Double valor, Operacao operacao, LocalDateTime data) {
		this.valor = valor;
		this.operacao = operacao;
		this.data = data;
	}
	
	public Transacao() {
		
	}

	public Double getValor() {
		return valor;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
