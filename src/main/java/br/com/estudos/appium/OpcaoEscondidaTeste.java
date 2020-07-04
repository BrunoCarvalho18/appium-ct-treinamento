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
		menu.clicarPorTexto("Opção bem escondida");
		
		//verificar mensagem
		Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
		
		//sair
		menu.clicarPorTexto("OK");
	}

}
