package br.com.model.mail;

import org.apache.commons.mail.EmailException;

import br.com.model.engine.Aviso;

public interface CommonsEmail {
	void simpleEmail(Email email, Aviso aviso);
	void multiPartEmail(Email email, Aviso aviso) throws EmailException;
	void htmlEmail(Email email, Aviso aviso);
}
