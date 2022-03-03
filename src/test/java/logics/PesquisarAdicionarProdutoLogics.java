package logics;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PesquisarAdicionarProdutoLogics {
	WebDriver driver;

	// Pesquisa Produtos
	public static By pesquisar = new By.ByXPath("(//*[@id='menuSearch'])[1]");
	public static By textoproduto = new By.ByXPath("//*[@id='autoComplete']");
	public static By vertudo = new By.ByXPath("//*[@translate='View_All']");
	public static By adicionarcarrinho = new By.ByXPath("//*[@name='save_to_cart']");
	public static By tipoproduto = new By.ByXPath("//*[@id='tabletsImg']");
	public static By produto = new By.ByXPath("(//*[@class='product ng-scope'])[1]");
	public static By iconecarrinho = new By.ByXPath("(//*[@id='shoppingCartLink'])");
	public static By validarcarrinho = new By.ByXPath("(//*[@id='checkOutButton'])");

	public void acessarAdvancedShopping() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
	}

	public void clicarLupa() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(pesquisar));
		driver.findElement(pesquisar).click();
	}

	public void digitarNomeProduto(String produto) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(textoproduto));
		driver.findElement((textoproduto)).click();
		driver.findElement((textoproduto)).sendKeys(produto);
	}

	public void clicarVerTudo() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement((vertudo)).click();

	}

	public void primeiroProduto() {

		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(produto));
		driver.findElement(produto).click();
	}

	public void validarProduto() {
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(adicionarcarrinho));
		Boolean visivel = driver.findElement(adicionarcarrinho).isDisplayed();
		assertTrue(visivel);
		System.out.println("Teste Finalizado com Sucesso!");
		driver.close();
	}

	public void selecionarTipoProduto() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(tipoproduto));
		driver.findElement(tipoproduto).click();
	}

	public void selecionarProduto() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(produto));
		driver.findElement(produto).click();
	}

	public void clicarADDToCart() {
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(adicionarcarrinho));
		driver.findElement(adicionarcarrinho).click();
	}

	public void clicarIconeCarrinho() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(iconecarrinho));
		driver.findElement(iconecarrinho).click();
	}

	public void validarProdutoNoCarrinho() {
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(validarcarrinho));
		Boolean visivel = driver.findElement(validarcarrinho).isDisplayed();
		assertTrue(visivel);
		System.out.println("Teste Finalizado com Sucesso!");
		driver.close();
	}
}
