package br.com.estudos.screen;

import org.openqa.selenium.By;

import br.com.estudos.core.BaseScreen;

public class AlertaScreen extends BaseScreen {
	
	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void clicarConfirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void clicarSair() {
		clicarPorTexto("SAIR");
	}
	
	public void clicarForaCaixa() {
		tap(167,144);
	}

	
}
