@desafio
Feature: Consultar Produto
 
  @CT_004
  
  
  Scenario: Consultar Produto
    
    Given Entro na pagina 'Advanced Shopping'
    And clico no icone 'Pesquisar'
    And digito 'nome' do produto 'tablet'
    And clico em 'ver tudo'
    And clico no primeiro produto
		Then valido acesso ao produto
