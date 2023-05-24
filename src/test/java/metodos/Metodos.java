package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos {
	
	WebDriver driver;
	
	public void iniciarTeste() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.br");
	}
	
	public void finalizarTeste() {
		driver.quit();
	}
	
	public void validarTitle(String titleDesejado) {
		assertEquals(titleDesejado, driver.getTitle());
	}
	
	public void validarUrl(String urlDesejada) {
		assertEquals(urlDesejada, driver.getCurrentUrl());
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
	

}
