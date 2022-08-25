package com.automation.StepDef;

import com.automation.GenericUtils.PropertyReader;
import com.automation.Pages.Add2CartPage;
import com.automation.Test.LoginTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add2CartStepDef {

	LoginTest lt = new LoginTest();
	@When("Enter valid productName {string} for search and add2cart")
	public void enter_valid_product_name_for_search_and_add2cart(String string) throws InterruptedException {
		
		lt.VerifysuccessfulLogin();
		Add2CartPage up = new Add2CartPage();
		up.Search(PropertyReader.getProperty(string));
		up.clickItem();
		up.clickPro();
		up.switchWin();
		Thread.sleep(2000);
		up.clickAddTC();
		up.clickCont();
	}

	@Then("Add2cart successful")
	public void add2cart_successful() {
	   System.out.println("Add2cart successful");
	}
}
