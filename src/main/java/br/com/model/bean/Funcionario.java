package br.com.model.bean;

import java.time.LocalDate;
import java.time.MonthDay;

@SuppressWarnings("serial")
public class Funcionario extends Usuario {
	private LocalDate dataContratacao;
	private MonthDay dataPagamento;
	private Double salario;

	public Funcionario(String nome, String sobreNome, Endereco endereco,
			MonthDay dataPagamento, Double salario) {
		setNome(nome);
		setSobreNome(sobreNome);
		setEndereco(endereco);
		this.dataContratacao = LocalDate.now();
		this.dataPagamento = dataPagamento;
		this.salario = salario;
	}

	public Funcionario() {

	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
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
