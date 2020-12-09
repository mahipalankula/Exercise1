package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BaseTest;
import com.qa.util.Constants;

import junit.framework.Assert;

public class exercisePage extends BaseTest {
		
	/* The below page elements are written based on the given input, though we can identify web elements in many different ways 
	 * in real time. Since the Application is a Mock one, i have used the id attribute to identify the Label and Value elements
	 * just to show how we can implement page object using Page Factory. 
	 */
	
	//PageFactory Elements
	
	@FindBy(id = "lbl_val_1")
	private WebElement value1;
	
	public WebElement getValue1() {
		return value1;
	}
	
	@FindBy(id = "lbl_val_2")
	private WebElement value2;
	
	public WebElement getValue2() {
		return value2;
	}
	
	@FindBy(id = "lbl_val_3")
	private WebElement value3;
	
	public WebElement getValue3() {
		return value3;
	}
	
	@FindBy(id = "lbl_val_4")
	private WebElement value4;
	
	public WebElement getValue4() {
		return value4;
	}
	
	@FindBy(id = "lbl_val_5")
	private WebElement value5;
	
	public WebElement getValue5() {
		return value5;
	}
	
	@FindBy(id = "lbl_ttl_val")
	private WebElement totalBalance;
	
	public WebElement getTotalBalance() {
		return totalBalance;
	}
	
	@FindBy(id = "txt_val_1")
	private WebElement txt_val_1;
	
	public WebElement getTxt_val_1() {
		return txt_val_1;
	}
	
	@FindBy(id = "txt_val_2")
	private WebElement txt_val_2;
	
	public WebElement getTxt_val_2() {
		return txt_val_2;
	}
	
	@FindBy(id = "txt_val_3")
	private WebElement txt_val_3;
	
	public WebElement getTxt_val_3() {
		return txt_val_3;
	}
	
	@FindBy(id = "txt_val_4")
	private WebElement txt_val_4;
	
	public WebElement getTxt_val_4() {
		return txt_val_4;
	}
	
	@FindBy(id = "txt_val_5")
	private WebElement txt_val_5;	
	
	public WebElement getTxt_val_5() {
		return txt_val_5;
	}
	
	@FindBy(id = "txt_ttl_val")
	private WebElement total;
	
	public WebElement getTotal() {
		return total;
	}
	
	//Initializing the Page Objects
	
	public exercisePage() {
		PageFactory.initElements(driver, this);
	}
	
	/*The commented code below is the actual implementation, but since the URL is a mock one, we cannot interact with the 
	 * Application to fetch the data from the text fields to proceed further.  
	 */
	 
	/*
	String v1 = getTxt_val_1().getText();
	String v2 = getTxt_val_2().getText();
	String v3 = getTxt_val_3().getText();
	String v4 = getTxt_val_4().getText();
	String v5 = getTxt_val_5().getText();
	*/
	
	//In order to get this code run without any errors, I am fetching the given values directly
	
	String val1 = Constants.VAL1;
	String val2 = Constants.VAL2;
	String val3 = Constants.VAL3;
	String val4 = Constants.VAL4;
	String val5 = Constants.VAL5;	

	public List<Double> Replace()  {
		
		List<Double> list = new ArrayList();
		
		//Replacing the dollar and comma symbols 
		String v1 = val1.replace("$","").replace(",", "");
		String v2 = val2.replace("$","").replace(",", "");
		String v3 = val3.replace("$","").replace(",", "");
		String v4 = val4.replace("$","").replace(",", "");
		String v5 = val5.replace("$","").replace(",", "");
		
		//Convert the String to Double
		double num1 = Double.parseDouble(v1);
		double num2 = Double.parseDouble(v2);
		double num3 = Double.parseDouble(v3);
		double num4 = Double.parseDouble(v4);
		double num5 = Double.parseDouble(v5);
		
		//Adding the double values to the list
		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.add(num4);
		list.add(num5);
		
		return list;
		
	}
	
	public Double Total_Value() {
		
		//getting the total value
		String total = Constants.TOTAL;
		
		//Replacing the dollar symbol
		 String tot = total.replace("$","").replace(",","");
		
		//Convert the String to Integer
		double TotalBalance = Double.parseDouble(tot);
		
		return TotalBalance;
	}
	
	public List<String> Verify_Currency() {
		
		List<String> list = new ArrayList();
		
		String str1 = val1.substring(0, 1);
		String str2 = val2.substring(0, 1);
		String str3 = val3.substring(0, 1);
		String str4 = val4.substring(0, 1);
		String str5 = val5.substring(0, 1);
		
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str4);
		list.add(str5);
		
		return list;
	}		

}
