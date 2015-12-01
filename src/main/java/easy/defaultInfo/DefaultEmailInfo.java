package easy.defaultInfo;

import java.util.List;

import br.com.model.engine.Aviso;
import br.com.model.mail.Email;
import br.com.model.mail.Provedor;

public class DefaultEmailInfo {
	private static final DefaultProvedor defaultProvedor = new DefaultProvedor();

	public static Email getDefaultEmail() {
		Provedor provedor = defaultProvedor.getDefaultProvedores().get("GMAIL");
		Email email = new Email();
		email.setEmail("heitorguerrac.teste@gmail.com");
		email.setSenha("shoryuken");
		email.setProvedor(provedor);
		return email;
	}
	
	public static Aviso getDefaultAviso(String destinatario, List<String> mesesDevendo){
		StringBuffer str = new StringBuffer();
		str.append("Favor acertar taxa Academia dos meses: ");
		mesesDevendo.forEach(mes-> str.append(",").append(mes));
		Aviso aviso = new Aviso();
		aviso.setEmailDestinatario(destinatario);
		aviso.setTitulo("Academia");
		aviso.setMensagem(str.toString());
		return aviso;
	}

}
