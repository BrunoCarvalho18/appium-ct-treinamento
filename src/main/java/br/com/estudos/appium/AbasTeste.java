	package br.com.estudos.appium;

import org.junit.Assert;
import org.junit.Test;
import br.com.estudos.core.BaseTest;
import br.com.estudos.screen.AbasScreen;
import br.com.estudos.screen.MenuScreen;

public class AbasTeste extends BaseTest {
	
	private MenuScreen menu = new MenuScreen();
	private AbasScreen aba = new AbasScreen();
	
	@Test
	public void deveInteragirComAbas() {
		// acessar menu abas
		menu.acessarAbas();
		
		//verificar que está na aba1
		Assert.assertTrue(aba.isAba1());
		
		//acessar aba 2	
		aba.selecionarAba2();
		
		//verificar que está na aba2
		Assert.assertTrue(aba.isAba2());
	}

}
