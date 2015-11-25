package br.com.model.bean;

import java.io.Serializable;
import java.time.Month;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "STATUS")
public class Status implements Serializable {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private Month month;

	@Column(nullable = false)
	private boolean pago;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

}
