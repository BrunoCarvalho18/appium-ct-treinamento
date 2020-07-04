package br.com.estudos.core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
	
	private static AndroidDriver<MobileElement>driver;
	
	public static AndroidDriver<MobileElement> getDriver(){
		if(driver==null) {
			createDriver();
		}
		return driver;
	}

	private static void createDriver() {
		File diretorioAplicacao = new File("app");
		File arquivoAplicacao = new File(diretorioAplicacao, "CTAppium.apk");

		DesiredCapabilities capacidade = new DesiredCapabilities();
		capacidade.setCapability("deviceName", "emulator-5554");
		capacidade.setCapability("platformName", "Android");
		capacidade.setCapability("app", arquivoAplicacao.getAbsolutePath());
		capacidade.setCapability("noReset", true);
		capacidade.setCapability("automationName", "UiAutomator1");
		capacidade.setCapability("newCommandTimeout", 5600);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capacidade);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}

}
