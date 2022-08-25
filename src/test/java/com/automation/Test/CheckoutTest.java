package com.automation.Test;

import org.testng.annotations.Test;

import com.automation.GenericUtils.DriverUtils;
import com.automation.Pages.CheckoutPage;

public class CheckoutTest extends BaseTest {
	@Test

	public void VerifyCheckout() throws InterruptedException {
		DriverUtils.getDriver().get("https://www.amazon.in/");
		Add2CartTest ad = new Add2CartTest();
		ad.VerifyAdd2Cart();
		CheckoutPage cp = new CheckoutPage();
		cp.clickShipadd();
		Thread.sleep(2000);
		cp.selectAddCard();
		cp.clickAddNewCard();
		Thread.sleep(2000);
		cp.switch2frame();
		cp.enterCardNo("1234 5678 9000");
		cp.clickAddCard();

	}
}
