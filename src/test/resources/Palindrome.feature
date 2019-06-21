Feature: Palindrome checker
	I want to create a function that is able to ckeck if a given word is a palindrome

Scenario Outline: Palindromes
  Given a palindrome "<word>"
  When I invoke palindrome checker
  Then I should have a true answer

  Examples:
    | word | 
    | reconocer |
    | abba | 
    | amad a la dama |
    
Scenario Outline: non-Palindromes
  Given a non palindrome "<word>"
  When I invoke palindrome checker
  Then I should have a false answer

  Examples:
    | word | 
    | reconocerla |
    | abad | 
    | superlativo |
    