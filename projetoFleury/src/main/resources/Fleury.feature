#Author: edsonlira87@gmail.com


Feature: validar unidade fleury
  
Eu como ususario quero acessar o site fleury e validar uma unidade
  
  Scenario: pesquisar unidade
  
  
    Given dado que eu esteja no site "https://www.fleury.com.br"
   
    When quando filtro por facilidade
  
    Then valido o nome da unidade "vila mariana"
    

 