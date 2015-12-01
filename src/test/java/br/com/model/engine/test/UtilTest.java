package br.com.model.engine.test;

import org.junit.Test;

import easy.defaultInfo.DefaultSuperficialJunitTest;
import br.com.validation.Util;

public class UtilTest {
	
	@Test
	public void emailValidatorTest() {
		DefaultSuperficialJunitTest.equals(true, Util.email.validar("heitorguerrac@gmail.com"));
	}
	
	@Test
	public void emailValidatorFailTest() {
		DefaultSuperficialJunitTest.equals(true, Util.email.validar("heitorguerracgmail.com"));
	}

}
