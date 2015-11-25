package br.com.model.defaultInfo;

import java.util.HashMap;
import java.util.Map;

public class DefaultProvedor {
	private Map<String, Provedor> provedores = new HashMap<String, Provedor>();

	public DefaultProvedor() {
		provedores.put("GMAIL", new Provedor("pop.gmail.com",
				"smtp.gmail.com", 995, 465));
		provedores.put("YAHOO", new Provedor("pop.mail.yahoo.com",
				"smtp.mail.yahoo.com"));
		provedores.put("OUTLOOK",
				new Provedor("pop3.live.com", "smtp.live.com"));
		provedores.put("BOL",
				new Provedor("pop3.bol.com", "smtp.bol.com"));
		provedores
				.put("UOL", new Provedor("pop.uol.com", "smtp.uol.com"));
		provedores.put("TERRA", new Provedor("pop.terra.com",
				"smtp.terra.com"));
		provedores.put("IG", new Provedor("pop.ig.com", "smtp.ig.com",
				995, 465));
	}

	public Map<String, Provedor> getDefaultProvedores() {
		return provedores;
	}

}
