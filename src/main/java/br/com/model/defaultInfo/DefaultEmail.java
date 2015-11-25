package br.com.model.defaultInfo;

public class DefaultEmail {
	private static final DefaultProvedor defaultProvedor = new DefaultProvedor();

	public static Email getDefaultEmail() {
		Provedor provedor = defaultProvedor.getDefaultProvedores().get("GMAIL");
		Email email = new Email();
		email.setEmail("heitorguerrac.teste@gmail.com");
		email.setSenha("shoryuken");
		email.setProvedor(provedor);
		return email;
	}

}
