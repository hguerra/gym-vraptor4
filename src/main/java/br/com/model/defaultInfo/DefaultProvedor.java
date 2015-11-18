package br.com.model.defaultInfo;

import java.util.HashMap;
import java.util.Map;

import br.com.model.bean.Provedor;

public class DefaultProvedor {
	private Map<String, Provedor> provedores = new HashMap<String, Provedor>();

	public DefaultProvedor() {
		provedores.put("GMAIL", new Provedor("pop.gmail.com.br",
				"smtp.gmail.com.br", 995, 465));
		provedores.put("YAHOO", new Provedor("pop.mail.yahoo.com.br",
				"smtp.mail.yahoo.com.br"));
		provedores.put("OUTLOOK",
				new Provedor("pop3.live.com", "smtp.live.com"));
		provedores.put("BOL",
				new Provedor("pop3.bol.com.br", "smtp.bol.com.br"));
		provedores
				.put("UOL", new Provedor("pop.uol.com.br", "smtp.uol.com.br"));
		provedores.put("TERRA", new Provedor("pop.terra.com.br",
				"smtp.terra.com.br"));
		provedores.put("IG", new Provedor("pop.ig.com.br", "smtp.ig.com.br",
				995, 465));
	}

	public Map<String, Provedor> getDefaultProvedores() {
		return provedores;
	}

}
