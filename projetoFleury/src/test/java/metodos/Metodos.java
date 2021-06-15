package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	WebDriver driver;

	public void abrirBrowser(String url, String navegador) {

		
		//criei uma logica para escolher os nagegadores
		if (navegador == "CHROME") {

			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else if (navegador == "FIREFOX") {

			System.setProperty("webdriver.gecko.driver", "./Driver.geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else {

			System.out.println("Opção invalida, escolha CHROME OU FIREFOX");

		}

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void fechar() {
		driver.quit();
	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void pausa(long time) throws InterruptedException {

		Thread.sleep(time);

	}

	public void validarTexto(String texto, By elemento) {
		String txt = driver.findElement(elemento).getText();
		assertEquals(texto, txt);
	}

}
