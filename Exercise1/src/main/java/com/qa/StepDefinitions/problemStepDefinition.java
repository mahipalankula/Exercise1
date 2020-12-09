package com.qa.StepDefinitions;

import java.util.List;
import org.testng.Reporter;
import com.qa.util.BaseTest;
import com.qa.util.Constants;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import com.qa.pages.exercisePage;

public class problemStepDefinition extends BaseTest {
	
	exercisePage exercisePage = new exercisePage();
	List<Double> lst = exercisePage.Replace();
	double TotalBalance = exercisePage.Total_Value();
	List<String> list =  exercisePage.Verify_Currency();
	double sum=0;
	
	@Given("^User launches the browser$")
	public void user_launches_the_browser() throws Throwable {
		BaseTest.initialization();
	}

	@Then("^Verify the count of values appear on the screen$")
	public void verify_the_count_of_values_appear_on_the_screen() throws Throwable {
		Assert.assertEquals(Constants.COUNT, lst.size());				

	}

	@Then("^Verify the values on the screen are greater than zero$")
	public void verify_the_values_on_the_screen_are_greater_than_zero() throws Throwable {
		
		for (int i=0; i<lst.size(); i++) {
			double num = lst.get(i);
			Assert.assertTrue(num > Constants.GREATER_THAN_ZERO);
		}
				
	}

	@Then("^verify the Total Balance matches the sum of all the values$")
	public void verify_the_Total_Balance_matches_the_sum_of_all_the_values() throws Throwable {
		
		for (int i=0; i<lst.size(); i++) {			
			double num = lst.get(i);
			sum = sum + num;
		}
		
		Assert.assertEquals(TotalBalance, sum);

	}

	@Then("^verify all values are formatted as currencies$")
	public void verify_all_values_are_formatted_as_currencies() throws Throwable {
		
			
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);			
			Assert.assertEquals(Constants.CURRENCY, str);			
		}
	}
	
	@After
	public void close_the_browser() {
		driver.quit();
	}
	
	
}
