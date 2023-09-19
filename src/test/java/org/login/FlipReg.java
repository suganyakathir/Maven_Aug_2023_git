package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipReg extends BaseClass {
	public FlipReg() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement clkClose;
	@FindBy(name="q")
	private WebElement txtSearch;
	@FindBy(xpath="//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")
	private WebElement clkIphone;
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement clkAddCart;
	@FindBy(xpath="//a[text()='Help Center']")
	private WebElement clkHelp;
	@FindBy(xpath="//span[text()='View More']")
	private WebElement clkViewMore;
	public WebElement getTxtSearch() {
		return txtSearch;
	}
	public WebElement getClkClose() {
		return clkClose;
	}
	public WebElement getClkIphone() {
		return clkIphone;
	}
	public WebElement getClkAddCart() {
		return clkAddCart;
	}
	public WebElement getClkHelp() {
		return clkHelp;
	}
	public WebElement getClkViewMore() {
		return clkViewMore;
	}
	
	

}
