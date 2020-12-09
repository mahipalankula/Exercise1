package com.qa.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\main\\java\\com\\qa\\Features\\problem.feature", // Path of the feature file
		glue = {"com.qa.StepDefinitions"}, // Path of the Step Definition file
		format = {"pretty", "html:test-output"}, // To display output in a proper format
		monochrome = true, //To display the console output in readable format
		strict = false, //it will check if any step is not defined in the step definition file
		dryRun = false //to check the mapping between Feature file and Step Def file
		
		)

public class TestRunner {
 
    }
