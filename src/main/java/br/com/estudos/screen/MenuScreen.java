package br.com.estudos.screen;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static br.com.estudos.core.DriverFactory.getDriver;
import br.com.estudos.core.BaseScreen;

public class MenuScreen extends BaseScreen {
	
	public void acessarFormulario() {
		clicarPorTexto("Formul�rio");
	}
	
	public void acessarSplash() {
		clicarPorTexto("Splash");
	}
	
	public void acessarAlertas() {
		clicarPorTexto("Alertas");
	}
	
	public void acessarAbas() {
		clicarPorTexto("Abas");
	}
	
	public void acessarAccordion() {
		clicarPorTexto("Accordion");
	}
	
	public void acessarCliques() {
		clicarPorTexto("Cliques");
	}
	
	public void acessarSwipe() {
		clicarPorTexto("Swipe");
	}
	
	public void acessarSwipeList() {
		clicarPorTexto("Swipe List");
	}
	
	public void acessarDragAndDrop() {
		WebDriverWait wait = new WebDriverWait(getDriver(),10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formul�rio']")));
		scrollDown();
		clicarPorTexto("Drag and drop");
	}
	
	public void acessarMenuOpcaoBemEscondida() {
		clicarPorTexto("Op��o bem escondida");
	}

}
