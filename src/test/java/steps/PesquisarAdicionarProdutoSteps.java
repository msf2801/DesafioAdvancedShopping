package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import logics.PesquisarAdicionarProdutoLogics;

public class PesquisarAdicionarProdutoSteps {

	PesquisarAdicionarProdutoLogics pesquisarAdicionarProdutoLogics;

	public PesquisarAdicionarProdutoSteps() {

		pesquisarAdicionarProdutoLogics = new PesquisarAdicionarProdutoLogics();

	}

	@Given("Entro na pagina {string}")
	public void entro_na_pagina(String string) {
		pesquisarAdicionarProdutoLogics.acessarAdvancedShopping();
	}

	@And("clico no icone 'Pesquisar'")
	public void clico_no_icone_Pesquisar() {
		pesquisarAdicionarProdutoLogics.clicarLupa();
	}

	@And("digito 'nome' do produto {string}")
	public void digito_do_produto(String produto) {
		pesquisarAdicionarProdutoLogics.digitarNomeProduto(produto);
	}

	@And("clico no primeiro produto")
	public void clico_no_primeiro_produto() {
		pesquisarAdicionarProdutoLogics.primeiroProduto();
	}

	@And("clico em 'ver tudo'")
	public void clico_em_ver_tudo() {
		pesquisarAdicionarProdutoLogics.clicarVerTudo();
	}

	@Then("valido acesso ao produto")
	public void valido_acesso_ao_produto() {
		pesquisarAdicionarProdutoLogics.validarProduto();
	}

	@And("clico no tipo de produto que desejo")
	public void clico_no_tipo_de_produto_que_desejo() {
		pesquisarAdicionarProdutoLogics.selecionarTipoProduto();
	}

	@And("clico no primeiro produto apresentado")
	public void clico_no_primeiro_produto_apresentado() {
		pesquisarAdicionarProdutoLogics.selecionarProduto();
	}

	@And("clico em no botao 'ADD TO CARD'")
	public void clico_em_no_botao_ADD_TO_CARD() {
		pesquisarAdicionarProdutoLogics.clicarADDToCart();
	}

	@And("clico no icone do carrinho")
	public void clico_no_icone_do_carrinho() {
		pesquisarAdicionarProdutoLogics.clicarIconeCarrinho();
	}

	@Then("valido item adicionado")
	public void valido_item_adicionado() {
		pesquisarAdicionarProdutoLogics.validarProdutoNoCarrinho();
	}

}
