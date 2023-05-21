package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/features", 
		glue = "stepdefs",
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		tags = {"@Sanity"} ,
		//tags = {"@WIP"} the first scenario will run  
		monochrome = true
		//tags = {"@Regression or @Sanity"},//either one 
		//tags = {"@Regression and  @Sanity"}// both from feature file but need to put the annotation
		//tags = {"@Calculator"}//feature  level tag
		//tags  = {"@not WIP"}//run all except WIP
		
		
		
		
		
		
		)

public class TestRunner {
	

}
