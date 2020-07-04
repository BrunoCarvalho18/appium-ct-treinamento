package br.com.estudos.screen;

import br.com.estudos.core.BaseScreen;

public class AbasScreen extends BaseScreen {
	
	public boolean isAba1() {
		return existeElementoPorTexto("Este é o conteúdo da Aba 1");
	}
	
	public boolean isAba2() {
		return existeElementoPorTexto("Este é o conteúdo da Aba 2");
	}
	
	public void selecionarAba2() {
		clicarPorTexto("ABA 2");
	}

	
}
