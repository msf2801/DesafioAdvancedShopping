@desafio
Feature: Efeuar logout Do Usuario
 
  @CT_002
  
  
  Scenario: Efetuar logout do usuario
    
    
    Given acesso a pagina 'Advanced Shopping'
    And clico no icone de 'acesso'
    And preencho a 'conta' 'CRISR77'
    And preencho a 'senha' 'Senha@1234'
    And clico em 'Sing In'
    And clico no icone do 'usuario'
		And clico em 'logout'
		Then valido logout