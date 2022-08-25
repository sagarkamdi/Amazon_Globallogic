package com.automation.Pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add2CartPage extends BasePage{
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath="//div[@aria-label='iphone 13']")
	private WebElement clkItem;
	
	@FindBy(xpath="//span[text()='Apple iPhone 13 (128GB) - Blue']")
	private WebElement clkPro;
	
	

	@FindBy(id="add-to-cart-button")
	private WebElement clkatc;
	
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")
	private WebElement clkcont;



	// utilization
	
	public void Search(String str) {
		searchBox.sendKeys(str);
	}
	
	public void clickItem() {
		clkItem.click();
	}
	
	public void clickPro() {
		clkPro.click();
	}
	
	public void switchWin() {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);

				break;
			}
		}
	}
	
	
	
	public void clickAddTC() {
		clkatc.click();
	}
	
	public void clickCont() {
		clkcont.click();
	}
}
