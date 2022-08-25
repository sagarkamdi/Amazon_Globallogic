package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

	// declaration
				@FindBy(xpath="//input[@aria-labelledby='shipToThisAddressButton-announce']")
				private WebElement clkshipAdd;
				
				@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
				private WebElement clkAddcc;
				
				@FindBy(xpath = "(//img[@class=\"apx-add-pm-trigger-common-image\"])[1]")
				private WebElement clkaddCard;
				
				@FindBy(xpath= "//iframe[contains(@name,'ApxSecureIframe')]")
				private WebElement ele;
				
				@FindBy(xpath = "//input[@name='addCreditCardNumber']")
				private WebElement inputCardNo;
				
				@FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
				private WebElement selectaddCard;
				
				
				
				
				
				
				// utilization
				
				public void clickShipadd() {
					clkshipAdd.click();
				}
				
				public void clickAddNewCard() {
					clkAddcc.click();
				}
				
				public void clickAddCard() {
					clkaddCard.click();
				}
				
				public void switch2frame() {
					driver.switchTo().frame(ele);
				}
				
				public void enterCardNo(String str) {
					inputCardNo.sendKeys(str);
				}
				
				public void selectAddCard() {
					selectaddCard.click();
				}
				
				
				
}
