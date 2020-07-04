package br.com.estudos.appium;

import org.junit.Assert;
import org.junit.Test;
import br.com.estudos.core.BaseTest;
import br.com.estudos.screen.MenuScreen;

public class OpcaoEscondidaTeste extends BaseTest {
	
	private MenuScreen menu = new MenuScreen();
	
	@Test
	public void deveEncontarOpcaoEscondida() {
		//scroll down
		menu.scrollDown();
		
		//clicar menu
		menu.clicarPorTexto("Op��o bem escondida");
		
		//verificar mensagem
		Assert.assertEquals("Voc� achou essa op��o", menu.obterMensagemAlerta());
		
		//sair
		menu.clicarPorTexto("OK");
	}

}
