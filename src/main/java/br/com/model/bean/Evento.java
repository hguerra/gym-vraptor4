package br.com.model.bean;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {
	private String nome;
	private String descricao;
	private LocalDateTime data;

	public Evento(String nome, String descricao, int hora, int min, int dia,
			int mes, int ano) {
		this.nome = nome;
		this.descricao = descricao;
		this.data = LocalDateTime.of(ano, mes, dia, hora, min);
		data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
	}

	public Evento(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.data = LocalDateTime.now();
		data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}
