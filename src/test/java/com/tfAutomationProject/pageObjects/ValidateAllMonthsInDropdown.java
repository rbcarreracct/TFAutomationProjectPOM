
//TestNG assignment
package com.tfAutomationProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateAllMonthsInDropdown {
	
	WebDriver ldriver;
	
	public ValidateAllMonthsInDropdown(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="due_month")
	@CacheLookup
	WebElement monthDropdown;
	
	public void clickMonthDropdown()
	
	{
		monthDropdown.click();
		
	}
	
	
}
