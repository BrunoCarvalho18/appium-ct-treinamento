package br.com.estudos.appium;

import org.junit.Assert;
import org.junit.Test;
import br.com.estudos.core.BaseTest;
import br.com.estudos.screen.MenuScreen;
import br.com.estudos.screen.SplashScreen;

public class SplashTeste extends BaseTest {
	
	private MenuScreen menu = new MenuScreen();
	private SplashScreen splash = new SplashScreen();
	
	@Test
	public void deveAguardarSplashSumir() {
		//acessar menu splash
		menu.acessarSplash();
		
		//verificar que o splash esta sendo exibido
		splash.isTelaVisivel();
		
		//aguardar saida do splash
		splash.aguardarSplashSumir();
		
		//verificar que o formulario esta aparecendo
		Assert.assertTrue(splash.existeElementoPorTexto("Formulário"));
	}

}
