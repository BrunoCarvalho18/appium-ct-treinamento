package br.com.estudos.screen;

import org.openqa.selenium.By;

import br.com.estudos.core.BaseScreen;

public class AccordionScreen extends BaseScreen {
	
	public void selecionOp1() {
		clicarPorTexto("Op��o 1");
	}
	
	public String obterValorOp1() {
		return obterTexto(By.xpath("//*[@text='Op��o 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}

}
