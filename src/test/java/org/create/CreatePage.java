package org.create;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage extends BaseClass {
	public CreatePage() {
		PageFactory.initElements(driver, this);
	}
   @FindBy(xpath="//a[@role='button'][2]")
   private WebElement btnCreate;
   @FindBy(name="firstname")
   private WebElement txtFirstname;
   @FindBy(name="lastname")
   private WebElement txtLastname;
   @FindBy(name="reg_email__")
   private WebElement txtEmailId;
   @FindBy(name="reg_passwd__")
   private WebElement txtPassword;
   @FindBy(id="day")
   private WebElement clicDay;
   @FindBy(id="month")
   private WebElement clicMonth;
   @FindBy(id="year")
   private WebElement clicYear;
   @FindBy(id="u_a_4_86")
   private WebElement btnRadio;
   


public WebElement getBtnCreate() {
	return btnCreate;
}

public WebElement getTxtFirstname() {
	return txtFirstname;
}

public WebElement getTxtLastname() {
	return txtLastname;
}

public WebElement getTxtEmailId() {
	return txtEmailId;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getClicDay() {
	return clicDay;
}

public WebElement getClicMonth() {
	return clicMonth;
}

public WebElement getClickYear() {
	return clicYear;
}

public WebElement getClicYear() {
	return clicYear;
}

public WebElement getBtnRadio() {
	return btnRadio;
}




}
   

