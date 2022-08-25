package com.automation.Test;

import org.testng.annotations.Test;
import com.automation.GenericUtils.DriverUtils;
import com.automation.Pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test

	public void VerifysuccessfulLogin() {
		
		LoginPage lp = new LoginPage();
		lp.clickSignin();
		lp.enterUsernme("sagar.kamdi27@gmail.com");
		lp.clickCont();
		lp.enterPassword("7709@Sak");
		lp.clickLogin();

	}
}
