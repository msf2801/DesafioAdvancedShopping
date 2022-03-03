@desafio
Feature: Adicionar Produto no Carrinho
 
  @CT_005
  
  
  Scenario: Adicionar Produto no Carrinho
    
    Given Entro na pagina 'Advanced Shopping'
    And clico no icone 'Pesquisar'
    And digito 'nome' do produto 'tablet'
    And clico em 'ver tudo'
    And clico no primeiro produto
    And clico em no botao 'ADD TO CARD'
    And clico no icone do carrinho
		Then valido item adicionado