package com.automation.StepDef;

import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.PropertyReader;
import com.automation.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("Open the browser")
	public void open_the_browser() {
		DriverUtils.getDriver().get("https://www.amazon.in/");
	}
	LoginPage lp = new LoginPage();
	@When("Enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
		lp.clickSignin();
		lp.enterUsernme(PropertyReader.getProperty(string));
		lp.clickCont();
		lp.enterPassword(PropertyReader.getProperty(string2));
		lp.clickLogin();
	}

	@Then("LogIn successful")
	public void log_in_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
