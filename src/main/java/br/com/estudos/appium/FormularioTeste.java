package br.com.estudos.appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.estudos.core.BaseTest;
import br.com.estudos.core.DriverFactory;
import br.com.estudos.screen.FormularioScreen;
import br.com.estudos.screen.MenuScreen;

public class FormularioTeste extends BaseTest{
    
	private MenuScreen menu = new MenuScreen();
	private FormularioScreen form = new FormularioScreen();	
	
	@Test
	public void deveInteragirComSwitchCheckbox() throws MalformedURLException {
		menu.acessarFormulario();
		
		Assert.assertFalse(form.isCheckMarcado());
		Assert.assertTrue(form.isSwitchMarcado());
		
		// Verificar status dos elementos
		form.clicarCheck();
		form.clicarSwitch();

		// Verificar estados alterados
		Assert.assertTrue(form.isCheckMarcado());
		Assert.assertFalse(form.isSwitchMarcado());
	}

	@Test
	public void deveRealizarCadastro() throws MalformedURLException {
		menu.acessarFormulario();
		// Preencher Campos
		form.escreveNome("Bruno");
		form.clicarCheck();
		form.clicarSeekBar(0.40);
		form.clicarSwitch();
		form.selecionarCombo("Nintendo Switch");
		form.clicarPorTexto("01/01/2000");
		form.clicarPorTexto("20");
		form.clicarPorTexto("OK");
     
		//Clicar no Salvar
                form.salvar();
		
		//Verificacoes
		Assert.assertEquals("Nome: Bruno",form.obterNomeCadastrado());
		
		Assert.assertEquals("Console: switch",form.obterConsoleCadastrado());
		
		Assert.assertTrue(form.obterCheckCadastrado().endsWith("Off"));
		
		Assert.assertTrue(form.obterSwitchCadastrado().endsWith("Marcado"));
	}
	
	@Test
	public void deveRealizarCadastroDemorado() throws MalformedURLException {
		menu.acessarFormulario();
		
		// Preencher Campos
		form.escreveNome("Bruno");
     
		//Clicar no Salvar Demorado
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
                form.salvarDemorado();
                //esperar(3000);
                WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: Bruno']")));
		
		//Verificacoes
		Assert.assertEquals("Nome: Bruno",form.obterNomeCadastrado());
	}
	
}
