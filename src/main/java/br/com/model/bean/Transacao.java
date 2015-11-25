package br.com.model.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.model.Operacao;

import com.google.gson.Gson;

@SuppressWarnings("serial")
@Entity
@Table(name = "TRANSACAO")
public class Transacao implements Serializable{
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private Double valor;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(nullable = false)
	private Operacao operacao;
	
	@Column(nullable = false)
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
