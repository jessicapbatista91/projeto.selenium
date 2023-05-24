package projeto.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class OpenBrowserTest {
	
	
	String titleDesejado ="Amazon.com.br | Tudo pra você, de A a Z.";
	String urlDesejada = "https://www.amazon.com.br";
    Metodos metodo = new Metodos();
    Elementos el = new Elementos();
    
	@Before
	public void setUp() throws Exception {
		metodo.iniciarTeste();
	}

	@After
	public void tearDown() throws Exception {
		//metodo.finalizarTeste();
	}

	@Test
	public void testAmazonTitle() {
		metodo.validarTitle(titleDesejado);
		
		}
	@Test
	public void testAmazonUrl() {
		metodo.validarUrl(urlDesejada);
		
		}
	@Test
	public void pesquisarProduto() {
		metodo.escrever(el.pesquisar, "Iphone");
		metodo.submit(el.pesquisar);
	}

}
