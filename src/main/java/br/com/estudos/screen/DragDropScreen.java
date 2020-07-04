package br.com.estudos.screen;

import br.com.estudos.core.BaseScreen;
import io.appium.java_client.MobileElement;

import static br.com.estudos.core.DriverFactory.getDriver;
import java.util.List;
import org.openqa.selenium.By;

public class DragDropScreen extends BaseScreen {

	public void arrastar(String origem, String destino) {
		
	}
	
	public String[] obterLista() {
		List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
		String [] retorno = new String[elements.size()];
		for(int i=0;i<elements.size();i++) {
			retorno[i]=elements.get(i).getText();
			System.out.println("\"" + retorno[i]+"\",");
		}
		return retorno;
	}
}
