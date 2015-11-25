package br.com.model;

import java.io.Serializable;

import com.google.gson.Gson;

@SuppressWarnings("serial")
public class Caixa implements Serializable{

	private long id;

	
	private Double saldo;


	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
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
