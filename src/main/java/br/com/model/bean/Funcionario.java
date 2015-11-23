package br.com.model.bean;

import java.time.LocalDate;
import java.time.MonthDay;

public class Funcionario extends Pessoa {
	private long id;
	private Email email;
	private LocalDate dataContratacao;
	private MonthDay dataPagamento;
	private Double salario;

	public Funcionario(String nome, String sobreNome, Endereco endereco,
			Email email, MonthDay dataPagamento, Double salario) {
		setNome(nome);
		setSobreNome(sobreNome);
		setEndereco(endereco);
		this.email = email;
		this.dataContratacao = LocalDate.now();
		this.dataPagamento = dataPagamento;
		this.salario = salario;
	}

	public Funcionario() {

	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public MonthDay getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(MonthDay dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
