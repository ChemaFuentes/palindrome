package es.cfuentes.code.test.palindrome;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features="src/test/resources", glue="es.cfuentes.code.test.palindrome")
public class TestRunner {
	
}
