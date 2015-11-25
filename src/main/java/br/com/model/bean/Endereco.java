package br.com.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECO")
public class Endereco implements Serializable{
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "ENDERECO_RUA")
	private String rua;
	
	@Column(name = "ENDERECO_NUMERO")
	private int numero;
	
	@Column(name = "ENDERECO_BAIRRO")
	private String bairro;
	
	@Column(name = "ENDERECO_CIDADE")
	private String cidade;
	
	@Column(name = "ENDERECO_PAIS")
	private String pais;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
