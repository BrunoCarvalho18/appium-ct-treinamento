package br.com.estudos.appium;

import org.junit.Test;

import br.com.estudos.screen.DragDropScreen;
import br.com.estudos.screen.MenuScreen;

public class DragAndDropTeste {
	
	private MenuScreen menu = new MenuScreen();
	private DragDropScreen dragdrop = new DragDropScreen();
	
	@Test
	public void deveEfetuarDragAndDrop() {
		//acessar menu
		menu.acessarDragAndDrop();
		
		//verificar estado inicial
		dragdrop.obterLista();
	}

}
