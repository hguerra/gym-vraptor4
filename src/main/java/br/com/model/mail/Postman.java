package br.com.model.mail;

import br.com.model.engine.Aviso;
import easy.defaultInfo.DefaultEmailInfo;

public class Postman implements Runnable {
	private final Aviso aviso;
	private final Email email;

	public Postman(Aviso aviso) {
		this.aviso = aviso;
		this.email = DefaultEmailInfo.getDefaultEmail();
	}

	@Override
	public void run() {
		sendAll();
	}
	
	public void sendAll(){
		CommonsEmail send = new DefaultCommonsEmail();
		send.simpleEmail(email, aviso);
	}


}
