package logics;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CriarUmaNovaContaLogics {

	WebDriver driver;
	WebDriverWait wait;

	// Login
	public static By menuLogin = new By.ByXPath("//*[@id='menuUser']");
	public static By cadastro = new By.ByXPath("//*[@data-ng-click='createNewAccount()']");

	// Dados Cliente
	public static By nomedeusuario = new By.ByXPath("//*[@name='usernameRegisterPage']");
	public static By emailderegistro = new By.ByXPath("//*[@name='emailRegisterPage']");
	public static By senhaderegistro = new By.ByXPath("//*[@name='passwordRegisterPage']");
	public static By confirmasenha = new By.ByXPath("//*[@name='confirm_passwordRegisterPage']");

	// Detalhes do Cliente
	public static By nomepessoa = new By.ByXPath("//*[@name='first_nameRegisterPage']");
	public static By sobrenomepessoa = new By.ByXPath("//*[@name='last_nameRegisterPage']");
	public static By numerotelefone = new By.ByXPath("//*[@name='phone_numberRegisterPage']");

	// Região
	public static By pais = new By.ByXPath("//*[@name='countryListboxRegisterPage']");
	public static By cidade = new By.ByXPath("//*[@name='cityRegisterPage']");
	public static By endereco = new By.ByXPath("//*[@name='addressRegisterPage']");
	public static By estado = new By.ByXPath("//*[@name='state_/_province_/_regionRegisterPage']");
	public static By cep = new By.ByXPath("//*[@name='postal_codeRegisterPage']");

	// Registrar
	public static By check = new By.ByXPath("//input[@name='i_agree']");
	public static By botaoregistro = new By.ByXPath("//button[@id='register_btnundefined']");
	public static By validarLogin = new By.ByXPath("//*[@class='hi-user containMiniTitle ng-binding']");

	public void acessarAdvancedShopping() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://advantageonlineshopping.com/#/");
		driver.manage().window().maximize();

	}

	public void clicarIconeUser() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(menuLogin));
		driver.findElement(menuLogin).click();

	}

	public void clicarCreateNewAccount() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		new WebDriverWait(driver, Duration.ofSeconds(100)).until(ExpectedConditions.elementToBeClickable(cadastro));
		driver.findElement((cadastro)).click();
	}

	public void preencherUsuario(String username) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(nomedeusuario));
		driver.findElement((nomedeusuario)).click();
		driver.findElement((nomedeusuario)).sendKeys(username);
	}

	public void preencherEmail(String email) {
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(emailderegistro));
		driver.findElement((emailderegistro)).click();
		driver.findElement((emailderegistro)).sendKeys(email);
	}

	public void preencherSenha(String senha) {
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(senhaderegistro));
		driver.findElement((senhaderegistro)).click();
		driver.findElement((senhaderegistro)).sendKeys(senha);
	}

	public void confirmarSenha(String confirmarsenha) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(confirmasenha));
		driver.findElement((confirmasenha)).click();
		driver.findElement((confirmasenha)).sendKeys(confirmarsenha);
	}

	public void preencherNome(String nome) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(nomepessoa));
		driver.findElement((nomepessoa)).click();
		driver.findElement((nomepessoa)).sendKeys(nome);
	}

	public void preencherSobrenome(String sobrenome) {
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(sobrenomepessoa));
		driver.findElement((sobrenomepessoa)).click();
		driver.findElement((sobrenomepessoa)).sendKeys(sobrenome);

	}

	public void preencherTelefone(String telefone) {
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(numerotelefone));
		driver.findElement((numerotelefone)).click();
		driver.findElement((numerotelefone)).sendKeys(telefone);
	}

	public void preencherPais() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(pais));

		WebElement comboboxElement = driver.findElement(pais);
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText("Brazil");
	}

	public void preencherCidade(String city) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(cidade));
		driver.findElement((cidade)).click();
		driver.findElement((cidade)).sendKeys(city);
	}

	public void preencherEndereco(String adreess) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(endereco));
		driver.findElement((endereco)).click();
		driver.findElement((endereco)).sendKeys(adreess);
	}

	public void preencherEstado(String state) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(endereco));
		driver.findElement((estado)).click();
		driver.findElement((estado)).sendKeys(state);
	}

	public void preencherCep(String postalcode) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(cep));
		driver.findElement((cep)).click();
		driver.findElement((cep)).sendKeys(postalcode);
	}

	public void clicarCheckBox() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(check));
		driver.findElement((check)).click();
	}

	public void clicarRegister() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(botaoregistro));
		driver.findElement((botaoregistro)).click();
	}

	public void validarCadastro() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(validarLogin));
		Boolean visivel = driver.findElement(validarLogin).isDisplayed();
		assertTrue(visivel);
		driver.close();
		System.out.println("Teste Finalizado com Sucesso!");
	}

}
