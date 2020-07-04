package br.com.estudos.appium;

import org.junit.Assert;
import org.junit.Test;
import br.com.estudos.core.BaseTest;
import br.com.estudos.screen.MenuScreen;

public class SwipeTeste extends BaseTest {
	
	private MenuScreen menu = new MenuScreen();
	
	@Test
	public void deveRealizarSwipe() {
		//acessar menu
		menu.acessarSwipe();
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
		//swipe pela direita
		menu.swipeRight();
		
		//verificar texto 'E veja se'
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
		
		//clicar botão direita
		menu.clicarPorTexto("›");
		
		//verificar o texto 'Chegar até o fim'
		Assert.assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
		
		//swipe esqueda
		menu.swipeLeft();
		
		//clicar botão 'a esquerda'
		menu.clicarPorTexto("‹");
		
		//verificar text 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
	}
	

}
