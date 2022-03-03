@desafio
Feature: Feature para Criar uma Nova Conta de Usuario
 
  @CT_001
  
  
  Scenario: Criar uma Nova Conta de Usuario
    
    
    Given realizo o acesso a pagina 'Advanced Shopping'
    And clico no icone 'User'
    And clico em 'Create New Acconount'
    And digito 'UserName' 'CristRon7'
    And digito 'Email' 'teste@teste.com'
    And digito 'Password' 'Senha@1234'
    And confirmo 'Password' 'Senha@1234'
    And digito 'First Name' 'Cristiano'
    And digito 'Last Name' 'Ronaldo'
    And digito 'Phone Number' '55 11976543456'
    And Seleciono 'Contry'
    And digito 'City' 'Sao Paulo'
    And digito 'Address' 'Av.Paulista'
    And digito 'State' 'Sao Paulo'
    And digito 'Postal Code' '06533054'
    And Seleciono o 'CheckBox'
    And clico em 'Register'
    Then valido Conta Cadastrada
