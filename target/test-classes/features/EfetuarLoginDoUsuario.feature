@desafio
Feature: Efeuar Login Do Usuario
 
  @CT_003
  
  
  Scenario: Efetuar login do usuario
    
    
    Given acesso a pagina 'Advanced Shopping'
    And clico no icone de 'acesso'
    And preencho a 'conta' 'CRISR77'
    And preencho a 'senha' 'Senha@1234'
    And clico em 'Sing In'
    Then valido login