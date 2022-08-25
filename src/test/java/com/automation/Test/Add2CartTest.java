package com.automation.Test;

import org.testng.annotations.Test;

import com.automation.GenericUtils.DriverUtils;
import com.automation.Pages.Add2CartPage;

public class Add2CartTest extends BaseTest {
	@Test

	public void VerifyAdd2Cart() throws InterruptedException {
		DriverUtils.getDriver().get("https://www.amazon.in/");
		LoginTest lt = new LoginTest();
		lt.VerifysuccessfulLogin();
		Add2CartPage up = new Add2CartPage();
		up.Search("iphone 13");
		up.clickItem();
		up.clickPro();
		up.switchWin();
		Thread.sleep(2000);
		up.clickAddTC();
		up.clickCont();
		

	}
}
