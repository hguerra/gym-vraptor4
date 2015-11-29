package br.com.observer;

import br.com.model.engine.FluxoCaixa;
import br.com.model.engine.DefaultFluxoCaixa;

class DefaultFluxoCaixaCreator {
	private static long ID = 1L;
	private static DefaultFluxoCaixaCreator defaultManager;
	private FluxoCaixa gestor;

	private DefaultFluxoCaixaCreator() {
		gestor = new DefaultFluxoCaixa(ID);
	}

	public static DefaultFluxoCaixaCreator getInstance() {
		if (defaultManager == null) {
			defaultManager = new DefaultFluxoCaixaCreator();
		}
		return defaultManager;
	}
	
	public FluxoCaixa getGestorCaixa() {
		return gestor;
	}
	
}
