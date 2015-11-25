package br.com.model;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.model.defaultInfo.DefaultEmail;
import br.com.model.defaultInfo.Email;

public class Cobrador implements Runnable {
	private final Aviso aviso;
	private final Email email;

	public Cobrador(Aviso aviso) {
		this.aviso = aviso;
		this.email = DefaultEmail.getDefaultEmail();
	}

	@Override
	public void run() {
		enviarEmail();
	}

	public void enviarEmail() {
		Properties props = new Properties();
		props.put("mail.smtp.host", email.getProvedor().getSMTP());
		props.put("mail.smtp.socketFactory.port", email.getProvedor()
				.getPORT_SMTP());
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", email.getProvedor().getPORT_SMTP());

		String emailOrigem = email.getEmail();
		String senha = email.getSenha();
		String para = aviso.getEmailDestinatario();
		String assunto = aviso.getTitulo();
		String texto = aviso.getMensagem();

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(emailOrigem, senha);
					}
				});

		session.setDebug(false);
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(emailOrigem));
			// Remetente
			Address[] toUser = InternetAddress.parse(para);
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject(assunto);// Assunto
			message.setText(texto);

			Transport.send(message);
		} catch (MessagingException e) {
			System.out.println(e);
		}

	}

}
