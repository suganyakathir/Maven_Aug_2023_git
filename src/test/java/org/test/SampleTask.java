package org.test;

import org.base.BaseClass;
import org.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTask extends BaseClass {
	
	public static void main(String[] args) {
		
		WebDriver driver = browserLaunch();
		driver.get("https://www.facebook.com/");
		
		implicitlyWait(20);
		
		LoginPage l=new LoginPage();
		
		sendkeys(l.getTxtUsername(),"suganya.iniya@gmail.com");
		
		sendkeys(l.getTxtPassword(),"kathi@M20");
		
		refresh();
		
		sendkeys(l.getTxtUsername(),"kathir");
		click(l.getBtnLogin());
		
		}

	
    
}
