
//TestNG Assignment
package com.tfAutomationProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ValidateAddCategory{
	
	
WebDriver ldriver;
	
	public ValidateAddCategory(WebDriver rdriver)
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	//Finding WebElement field for adding category
	@FindBy(name="categorydata")
	@CacheLookup
	WebElement inputFieldAddCat;
	
	//Finding add button to click to submit category
	@FindBy(xpath="/html/body/div[4]/span/input[2]")
	@CacheLookup
	WebElement addButton;
	
	
	
	
	//Sending text of category to add
	public void setAddCategory(String ac)
	{
		inputFieldAddCat.sendKeys(ac);
		
	}
	//Clicking on add button to add category
	public void clickAdd()
	{
		
		addButton.click();
		
	}
	

	@FindBy(xpath="/html/body/div[3]/a[88]/span")
	@CacheLookup
	WebElement catAdded;
	
	
	
    }
