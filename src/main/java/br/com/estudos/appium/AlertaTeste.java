package br.com.estudos.appium;

import org.junit.Assert;
import org.junit.Test;

import br.com.estudos.core.BaseTest;
import br.com.estudos.screen.AlertaScreen;
import br.com.estudos.screen.MenuScreen;

public class AlertaTeste extends BaseTest {

	private MenuScreen menu = new MenuScreen();
	private AlertaScreen alerta = new AlertaScreen();

	@Test
	public void deveConfirmarAlerta() {
		// acessar menu alerta
		menu.acessarAlertas();
		
	   //clicar alerta confirmar
	   alerta.clicarAlertaConfirm();
	   
	   // verificar os textos
       Assert.assertEquals("Info",alerta.obterTituloAlerta());
       Assert.assertEquals("Confirma a operação?",alerta.obterMensagemAlerta());
       
	   // confirmar alerta
       alerta.clicarConfirmar();

		// verificar nova mensagem
       Assert.assertEquals("Confirmado",alerta.obterMensagemAlerta());
		
       // sair
       alerta.clicarSair();
	}

}
