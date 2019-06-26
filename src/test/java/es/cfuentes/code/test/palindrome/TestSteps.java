package es.cfuentes.code.test.palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	private String currentWord;
	private boolean currentTestAnswer; 
	
	@Given("a palindrome {string}")
	public void a_palindrome(String string) {
		this.currentWord = string;
	}

	@When("I invoke palindrome checker")
	public void i_invoke_palindrome_checker() {
		currentTestAnswer = PalindromeChecker.check(currentWord); 
	}

	@Then("I should have a true answer")
	public void i_should_have_a_true_answer() {
		assertTrue(currentTestAnswer);
	}

	@Given("a non palindrome {string}")
	public void a_non_palindrome(String string) {
		this.currentWord = string;
	}

	@Then("I should have a false answer")
	public void i_should_have_a_false_answer() {
		assertFalse(currentTestAnswer);
	}


}
