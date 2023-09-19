package org.test;

import org.base.BaseClass;
import org.login.HotelReg;
import org.openqa.selenium.support.ui.Select;

public class HotelForm extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("chrome");
		urlLaunch("https://www.adactinhotelapp.com/");
		
		implicitlyWait(20);
		
		HotelReg h=new HotelReg();
		click(h.getUserName());
		sendkeys(h.getTxtUserName(),"suganranithiyaju");
		sendkeys(h.getTxtPassword(),"kathi@M");
		sendkeys(h.getTxtRePassword(),"kathi@M");
		sendkeys(h.getFullName(),"suganyakathiravan");
		sendkeys(h.getTxtEmail(),"bjvbjbb@gmail.com");
		click(h.getTxtCaptcha());
		Thread.sleep(5000);
		click(h.getClikCheck());
        click(h.getClikSubmit());
        click(h.getClkLogin());
        sendkeys(h.getTxtUser(),"suganyakathi");
        sendkeys(h.getTxtPass(),"H993C7");
        click(h.getClkLoginbtn());
        click(h.getSltLoc());
        selectByIndex(h.getSltLoc(),2);
        click(h.getSltHotel());
        selectByIndex(h.getSltHotel(),4);
        click(h.getRoomType());
        selectByIndex(h.getRoomType(),3);
        click(h.getRoomsNum());
        selectByIndex(h.getRoomsNum(),3);
        sendkeys(h.getTxtDate(),"08/08/2023");
        sendkeys(h.getOutDate(),"15/08/2023");
        click(h.getAdultRoom());
        selectByIndex(h.getAdultRoom(),2);
        click(h.getChildRoom());
        selectByIndex(h.getChildRoom(),3);
        click(h.getClkSearch());
        click(h.getClkRadios());
        click(h.getClkContinue());
        sendkeys(h.getTxtFirstName(),"kathiravan");
        sendkeys(h.getTxtLastName(),"muthusamy");
        sendkeys(h.getTxtAddress(),"madurai");
        sendkeys(h.getTxtCredit(),"1234567890123456");
        click(h.getTxtCreditNum());
        selectByIndex(h.getTxtCreditNum(),3);
        click(h.getMonth());
        selectByIndex(h.getMonth(),3);
        click(h.getYear());
        selectByIndex(h.getYear(),14);
        sendkeys(h.getCvvNum(),"567");
        click(h.getBookNow());
        System.out.println(getAttribute(h.getOrderNum()));
	}

	
}
