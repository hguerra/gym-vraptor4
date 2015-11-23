package br.com.model.bean;

import java.time.LocalDate;
import java.time.MonthDay;

public class Aluno extends Usuario {
	private String email;
	private LocalDate dataMatricula;
	private MonthDay dataVencimento;
	private boolean ativo;

	public Aluno() {

	}

	public Aluno(String nome, String sobreNome, Endereco endereco,
			String email, MonthDay dataVencimento) {
		setNome(nome);
		setSobreNome(sobreNome);
		setEndereco(endereco);
		this.email = email;
		this.dataVencimento = dataVencimento;
		this.dataMatricula = LocalDate.now();
		this.ativo = true;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public MonthDay getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(MonthDay dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
