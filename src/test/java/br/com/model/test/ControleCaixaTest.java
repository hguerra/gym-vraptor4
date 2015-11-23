package br.com.model.test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.model.GestorCaixa;
import br.com.model.bean.Caixa;

public class ControleCaixaTest {
	private GestorCaixa controleCaixa;
	private Caixa caixa;

	@Before
	public void before() {
		caixa = new Caixa();
		caixa.setSaldo(1000D);
		controleCaixa = new GestorCaixa(caixa);
	}

	@Test
	public void testPagarPositive() {
		controleCaixa.pagar(100D);
		Double expected = 900D;
		Double actual = caixa.getSaldo();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPagarNegative() {
		controleCaixa.pagar(1000000D);
		Double expected = 1000D;
		Double actual = caixa.getSaldo();
		assertEquals(expected, actual);
	}

	@Test
	public void testReceber() {
		controleCaixa.receber(10D);
		Double expected = 1010D;
		Double actual = caixa.getSaldo();
		assertEquals(expected, actual);
	}

	@After
	public void after() {
		controleCaixa = null;
		caixa = null;
	}

}
