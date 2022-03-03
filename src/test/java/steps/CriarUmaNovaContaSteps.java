package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import logics.CriarUmaNovaContaLogics;

public class CriarUmaNovaContaSteps {

	CriarUmaNovaContaLogics criarumanovacontalogics;

	public CriarUmaNovaContaSteps() {
		criarumanovacontalogics = new CriarUmaNovaContaLogics();
	}

	@Given("realizo o acesso a pagina 'Advanced Shopping'")
	public void realizo_o_acaesso_a_pagina() {
		criarumanovacontalogics.acessarAdvancedShopping();
	}

	@And("clico no icone 'User'")
	public void usuario_no_icone() {
		criarumanovacontalogics.clicarIconeUser();
	}

	@And("clico em 'Create New Acconount'")
	public void clico_em_Create_New_Acconount() {
		criarumanovacontalogics.clicarCreateNewAccount();
	}

	@And("digito 'UserName' {string}")
	public void digito_User_Name(String username) {
		criarumanovacontalogics.preencherUsuario(username);
	}

	@And("digito 'Email' {string}")
	public void digito_Email(String email) {
		criarumanovacontalogics.preencherEmail(email);
	}

	@And("digito 'Password' {string}")
	public void digito_Password(String senha) {
		criarumanovacontalogics.preencherSenha(senha);
	}

	@And("confirmo 'Password' {string}")
	public void confirmo_Password(String confirmarsenha) {
		criarumanovacontalogics.confirmarSenha(confirmarsenha);
	}

	@And("digito 'First Name' {string}")
	public void digito_First_Name(String nome) {
		criarumanovacontalogics.preencherNome(nome);
	}

	@And("digito 'Last Name' {string}")
	public void digito_Last_Name(String sobrenome) {
		criarumanovacontalogics.preencherSobrenome(sobrenome);
	}

	@And("digito 'Phone Number' {string}")
	public void digito_Phone_Number(String telefone) {
		criarumanovacontalogics.preencherTelefone(telefone);
	}

	@And("Seleciono 'Contry'")
	public void seleciono_Country() {
		criarumanovacontalogics.preencherPais();
	}

	@And("digito 'City' {string}")
	public void digito_City(String city) {
		criarumanovacontalogics.preencherCidade(city);
	}

	@And("digito 'Address' {string}")
	public void digito_Address(String address) {
		criarumanovacontalogics.preencherEndereco(address);
	}

	@And("digito 'State' {string}")
	public void digito_State(String state) {
		criarumanovacontalogics.preencherEstado(state);
	}

	@And("digito 'Postal Code' {string}")
	public void digito_Postal_Code(String postalcode) {
		criarumanovacontalogics.preencherCep(postalcode);
	}

	@And("Seleciono o 'CheckBox'")
	public void seleciono_o_CheckBox() {
		criarumanovacontalogics.clicarCheckBox();
	}

	@And("clico em 'Register'")
	public void clico_em_Register() {
		criarumanovacontalogics.clicarRegister();
	}

	@Then("valido Conta Cadastrada")
	public void valido_conta_cadastrada() {
		criarumanovacontalogics.validarCadastro();
	}

}
