package Cucumber1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features",glue={"Cucumber1"},
	plugin= {"pretty","html:target/cucumber-reports/report.html"},
	monochrome=true
	)
	public class TestRunnerconnect {
}
