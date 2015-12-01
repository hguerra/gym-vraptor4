package br.com.model.mail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

import br.com.model.engine.Aviso;
import br.com.validation.Util;

public class DefaultCommonsEmail implements CommonsEmail {

	@Override
	public void simpleEmail(Email eMail, Aviso aviso) {
		if (Util.email.validar(aviso.getEmailDestinatario())) {

			SimpleEmail email = new SimpleEmail();
			email.setSSLOnConnect(true);
			email.setHostName(eMail.getProvedor().getSMTP());
			email.setSmtpPort(eMail.getProvedor().getPORT_SMTP());
			email.setAuthenticator(new DefaultAuthenticator(eMail.getEmail(),
					eMail.getSenha()));
			try {
				email.setFrom(aviso.getEmailDestinatario());

				email.setDebug(false);

				email.setSubject(aviso.getTitulo());
				email.setMsg(aviso.getMensagem());
				email.addTo(aviso.getEmailDestinatario());
				email.setStartTLSEnabled(true);
				email.send();

			} catch (EmailException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void htmlEmail(Email eMail, Aviso aviso) {
		if (Util.email.validar(aviso.getEmailDestinatario())) {

			HtmlEmail email = new HtmlEmail();
			email.setSSLOnConnect(true);
			email.setHostName(eMail.getProvedor().getSMTP());
			email.setSmtpPort(eMail.getProvedor().getPORT_SMTP());
			email.setAuthenticator(new DefaultAuthenticator(eMail.getEmail(),
					eMail.getSenha()));
			try {
				email.setFrom(aviso.getEmailDestinatario());
				email.setDebug(false);
				email.setSubject(aviso.getTitulo());
				email.setHtmlMsg(aviso.getHtmlEmail());
				email.addTo(aviso.getEmailDestinatario());
				email.setStartTLSEnabled(true);
				email.send();
			} catch (EmailException e) {
				e.printStackTrace();

			}

		}
	}

	@Override
	public void multiPartEmail(Email eMail, Aviso aviso) throws EmailException {
		if (Util.email.validar(aviso.getEmailDestinatario())) {

			EmailAttachment attachment = new EmailAttachment();
			attachment.setPath(aviso.getEmailAttachment());
			attachment.setDisposition(EmailAttachment.ATTACHMENT);
			attachment.setDescription("ATTACHMENT");
			attachment.setName("ATTACHMENT");

			MultiPartEmail email = new MultiPartEmail();
			email.setHostName(eMail.getProvedor().getSMTP());
			email.addTo(aviso.getEmailDestinatario());
			email.setFrom(eMail.getEmail());
			email.setSubject(aviso.getTitulo());
			email.setMsg(aviso.getMensagem());
			email.attach(attachment);
			email.setStartTLSEnabled(true);
			email.send();

		}
	}
}
