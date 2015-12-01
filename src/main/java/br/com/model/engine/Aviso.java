package br.com.model.engine;

public class Aviso {
	private String emailDestinatario;
	private String titulo;
	private String mensagem;
	private String image;
	private String emailAttachment;
	private String htmlEmail;
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmailAttachment() {
		return emailAttachment;
	}

	public void setEmailAttachment(String emailAttachment) {
		this.emailAttachment = emailAttachment;
	}

	public String getHtmlEmail() {
		return htmlEmail;
	}

	public void setHtmlEmail(String htmlEmail) {
		this.htmlEmail = htmlEmail;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getEmailDestinatario() {
		return emailDestinatario;
	}

	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}

}
