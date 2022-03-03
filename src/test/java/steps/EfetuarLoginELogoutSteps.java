package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import logics.EfetuarLoginELogoutLogics;

public class EfetuarLoginELogoutSteps {

	EfetuarLoginELogoutLogics efetuarLoginELogoulogics;

	public EfetuarLoginELogoutSteps() {
		efetuarLoginELogoulogics = new EfetuarLoginELogoutLogics();
	}

	@Given("acesso a pagina 'Advanced Shopping'")
	public void realizo_o_acaesso_a_pagina() {
		efetuarLoginELogoulogics.acessarAdvancedShopping();
	}

	@And("clico no icone do 'usuario'")
	public void clico_no_icone_do_usuario() {
		efetuarLoginELogoulogics.clicarIconeDoUsuario();
	}

	@And("clico no icone de 'acesso'")
	public void clico_no_icone_de_acesso() {
		efetuarLoginELogoulogics.clicarIconeAcesso();
	}

	@And("preencho a 'conta' {string}")
	public void preencho_a_conta(String conta) {
		efetuarLoginELogoulogics.preencherConta(conta);
	}

	@And("preencho a 'senha' {string}")
	public void digito_Password(String senha) {
		efetuarLoginELogoulogics.preencherSenha(senha);
	}

	@And("clico em 'Sing In'")
	public void clico_em_Sing_in() {
		efetuarLoginELogoulogics.clicarSingIn();

	}

	@And("clico em 'logout'")
	public void clico_em_logout() {
		efetuarLoginELogoulogics.clicarLogout();

	}

	@Then("valido logout")
	public void valido_logout() {
		efetuarLoginELogoulogics.validoLogout();
	}

	@Then("valido login")
	public void valido_login() {
		efetuarLoginELogoulogics.validoLogin();
	}
}
