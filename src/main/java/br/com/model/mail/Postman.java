package br.com.model.mail;

import easy.defaultInfo.DefaultEmailInfo;
import br.com.model.engine.Aviso;

public class Postman implements Runnable {
	private final Aviso aviso;
	private final Email email;

	public Postman(Aviso aviso) {
		this.aviso = aviso;
		this.email = DefaultEmailInfo.getDefaultEmail();
	}

	@Override
	public void run() {
		send();
	}
	
	public void send(){
		CommonsEmail send = new DefaultCommonsEmail();
		send.simpleEmail(email, aviso);
	}

}
