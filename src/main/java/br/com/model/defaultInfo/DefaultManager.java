package br.com.model.defaultInfo;

import br.com.model.GestorCaixa;

public class DefaultManager {
	private static long ID = 1L;
	private static DefaultManager defaultManager;
	private GestorCaixa gestor;

	private DefaultManager() {
		gestor = new GestorCaixa(ID);
	}

	public static DefaultManager getInstance() {
		if (defaultManager == null) {
			defaultManager = new DefaultManager();
		}
		return defaultManager;
	}
	
	public GestorCaixa getGestorCaixa() {
		return gestor;
	}
	
}
