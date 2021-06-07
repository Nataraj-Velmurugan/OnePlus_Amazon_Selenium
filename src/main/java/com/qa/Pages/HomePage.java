package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.qa.Pages.mobiles.OnePlusPage;
import com.source.base.SeleniumBase;



public class HomePage extends SeleniumBase {
	
	
	public OnePlusPage orderMobile() {
		
		return new OnePlusPage();
	}
	

}
