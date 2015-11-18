package br.com.model.bean;

/**
 * @author heitor
 *
 */
public class Provedor {
	private String POP;
	private String SMTP;
	private int PORT_POP = 995;
	private int PORT_SMTP = 587;
	private boolean safeSSL = false;

	public Provedor(String POP, String SMTP) {
		this.POP = POP;
		this.SMTP = SMTP;
	}

	public Provedor(String pOP, String sMTP, int pORT_POP, int pORT_SMTP) {
		POP = pOP;
		SMTP = sMTP;
		PORT_POP = pORT_POP;
		PORT_SMTP = pORT_SMTP;
	}
	
	public Provedor(String pOP, String sMTP, int pORT_POP, int pORT_SMTP,
			boolean safeSSL) {
		POP = pOP;
		SMTP = sMTP;
		PORT_POP = pORT_POP;
		PORT_SMTP = pORT_SMTP;
		this.safeSSL = safeSSL;
	}
	
	public String getPOP() {
		return POP;
	}

	public void setPOP(String pOP) {
		POP = pOP;
	}

	public String getSMTP() {
		return SMTP;
	}

	public void setSMTP(String sMTP) {
		SMTP = sMTP;
	}

	public int getPORT_POP() {
		return PORT_POP;
	}

	public void setPORT_POP(int pORT_POP) {
		PORT_POP = pORT_POP;
	}

	public int getPORT_SMTP() {
		return PORT_SMTP;
	}

	public void setPORT_SMTP(int pORT_SMTP) {
		PORT_SMTP = pORT_SMTP;
	}

	public boolean isSafeSSL() {
		return safeSSL;
	}

	public void setSafeSSL(boolean safeSSL) {
		this.safeSSL = safeSSL;
	}

}
