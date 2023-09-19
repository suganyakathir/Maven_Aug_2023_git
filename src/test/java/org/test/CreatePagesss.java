package org.test;

import org.base.BaseClass;
import org.create.CreatePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatePagesss extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	browserLaunch("chrome");
	urlLaunch("https://www.facebook.com/");
	implicitlyWait(20);
	CreatePage e=new CreatePage();
	Thread.sleep(3000);
	click(e.getBtnCreate());
	sendkeys(e.getTxtFirstname(),"suganya");
	sendkeys(e.getTxtLastname(),"kathiravan");
	
   
	}
}
