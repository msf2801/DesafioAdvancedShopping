package logics;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EfetuarLoginELogoutLogics {

	WebDriver driver;

	// Login
	public static By menuLogin = new By.ByXPath("//*[@id='menuUser']");
	public static By login = new By.ByXPath("//input[@name='username']");
	public static By psw = new By.ByXPath("//input[@name='password']");
	public static By entrar = new By.ByXPath("//button[@id='sign_in_btnundefined']");
	public static By validarLogin = new By.ByXPath("//*[@class='hi-user containMiniTitle ng-binding']");
	public static By sair = new By.ByXPath("(//label[@class='option roboto-medium ng-scope'])[3]");

	public void acessarAdvancedShopping() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://advantageonlineshopping.com/#/");
		driver.manage().window().maximize();

	}

	public void clicarIconeAcesso() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(menuLogin));
		driver.findElement(menuLogin).click();
	}

	public void preencherConta(String conta) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement((login)).click();
		driver.findElement((login)).sendKeys(conta);
	}

	public void preencherSenha(String senha) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(psw));
		driver.findElement((psw)).click();
		driver.findElement((psw)).sendKeys(senha);
	}

	public void clicarSingIn() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(entrar));
		driver.findElement(entrar).click();
	}

	public void clicarIconeDoUsuario() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(validarLogin));
		driver.findElement(validarLogin).click();
	}

	public void clicarLogout() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(sair));
		driver.findElement(sair).click();
	}

	public void validoLogout() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(menuLogin));
		Boolean visivel = driver.findElement(menuLogin).isDisplayed();
		assertTrue(visivel);
		System.out.println("Teste Finalizado com Sucesso!");
		driver.close();

	}

	public void validoLogin() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(validarLogin));
		Boolean visivel = driver.findElement(validarLogin).isDisplayed();
		assertTrue(visivel);
		System.out.println("Teste Finalizado com Sucesso!");
		driver.close();

	}

}
