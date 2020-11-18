//TestNG Test Cae


package com.tfAutomationProject.testCases;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tfAutomationProject.pageObjects.ValidateAllMonthsInDropdown;

public class TC_AllMonthsDisplayed_003 extends TestBaseTFAutomationProject{

	@Test
	public void displayMonthDd()
	{
		driver.get(baseURL);

		ValidateAllMonthsInDropdown vmd = new ValidateAllMonthsInDropdown(driver);
		vmd.clickMonthDropdown();

		WebElement lelement = driver.findElement(By.name("due_month"));    
		Select oSelect = new Select(lelement);
		java.util.List <WebElement> elementCount = oSelect.getOptions();
		int iSize = elementCount.size();
		String [] arrdropdown= new String [iSize];          
		for (int j = 0; j < iSize; j++) 
		{
			arrdropdown[j]=elementCount.get(j).getText();
		}


		logger.info("Months are \t" + Arrays.toString(arrdropdown));




	}

}
