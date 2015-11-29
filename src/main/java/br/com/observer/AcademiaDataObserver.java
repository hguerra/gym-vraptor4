package br.com.observer;

import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.com.model.engine.FluxoCaixa;

@ApplicationScoped
public class AcademiaDataObserver {
	private final AcademiaInfo academiaInfo;

	/**
	 * @deprecated
	 */
	protected AcademiaDataObserver() {
		this(null);
	}

	@Inject
	public AcademiaDataObserver(AcademiaInfo academiaInfo) {
		this.academiaInfo = academiaInfo;
	}
	
	public void startGym(@Observes VRaptorInitialized event){
		DefaultFluxoCaixaCreator manager = DefaultFluxoCaixaCreator.getInstance();
		FluxoCaixa gestorCaixa = manager.getGestorCaixa();
		academiaInfo.setGestorCaixa(gestorCaixa);
		/**
		 * Inadimplencia
		 */
		BlackListCheck blackListCheck = new BlackListCheck();
		ReminderTask task = new  ReminderTask();
		task.reminder(blackListCheck, 1, 24, TimeUnit.HOURS);
		
	}

}
