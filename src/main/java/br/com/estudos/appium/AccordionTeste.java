package br.com.estudos.appium;

import org.junit.Assert;
import org.junit.Test;
import br.com.estudos.core.BaseTest;
import br.com.estudos.screen.AccordionScreen;
import br.com.estudos.screen.MenuScreen;

public class AccordionTeste extends BaseTest {
	
	private MenuScreen menu = new MenuScreen();
	private AccordionScreen accordion = new AccordionScreen();
	
	@Test
	public void deveInteragirComAccordion() {
		//acessar menu
		menu.acessarAccordion();
		
		//clicar op 1
		accordion.selecionOp1();
		
		//verificar texto op 1
		Assert.assertEquals("Esta é a descrição da opção 1",accordion.obterValorOp1());
	}

}
