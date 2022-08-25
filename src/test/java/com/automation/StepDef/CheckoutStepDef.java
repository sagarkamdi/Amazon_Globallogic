package com.automation.StepDef;

import com.automation.GenericUtils.PropertyReader;
import com.automation.Pages.CheckoutPage;
import com.automation.Test.Add2CartTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDef {
	Add2CartTest ad = new Add2CartTest();
	@When("Enter valid details for checkout and card {string}")
	public void enter_valid_details_for_checkout_and_card(String string) throws InterruptedException {
		
		ad.VerifyAdd2Cart();
		CheckoutPage cp = new CheckoutPage();
		cp.clickShipadd();
		Thread.sleep(2000);
		cp.selectAddCard();
		cp.clickAddNewCard();
		Thread.sleep(4000);
		cp.switch2frame();
		cp.enterCardNo(PropertyReader.getProperty(string));
		cp.clickAddCard();
	}

	@Then("Checkout successful")
	public void checkout_successful() {
	    System.out.println("Checkout successful");
	}


}
