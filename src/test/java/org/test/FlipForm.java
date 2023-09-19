package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.base.BaseClass;
import org.login.FlipReg;
import org.openqa.selenium.WebElement;

public class FlipForm extends BaseClass {
public static void main(String[] args) throws InterruptedException {

	browserLaunch2("edge");
	urlLaunch("https://www.flipkart.com/");
	implicitlyWait(20);
	FlipReg f= new FlipReg();
	click(f.getClkClose());
	WebElement txtSearch = f.getTxtSearch();
	sendkeys(txtSearch,"iphone");
	f.getTxtSearch().submit();
	click(f.getClkIphone());
	Set<String> allId = driver.getWindowHandles();
	List<String>li=new ArrayList<>();
	li.addAll(allId);
	driver.switchTo().window(li.get(1));
	click(f.getClkAddCart());
	click(f.getClkHelp());
	driver.switchTo().window(li.get(2));
	
    f.getClkViewMore().click();
	driver.switchTo().window(li.get(0));
	Thread.sleep(3000);
	driver.quit();
}
}
