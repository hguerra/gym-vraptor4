package br.com.observer;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.model.engine.FluxoCaixa;

@SuppressWarnings("serial")
@ApplicationScoped
@Named("academia")
public class AcademiaInfo implements Serializable {
	private FluxoCaixa gestorCaixa;

	public FluxoCaixa getGestorCaixa() {
		return gestorCaixa;
	}

	public void setGestorCaixa(FluxoCaixa gestorCaixa) {
		this.gestorCaixa = gestorCaixa;
	}

}
