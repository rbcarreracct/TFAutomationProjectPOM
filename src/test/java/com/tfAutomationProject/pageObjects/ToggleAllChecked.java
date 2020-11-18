package com.tfAutomationProject.pageObjects;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ToggleAllChecked {


	WebDriver driver;


	public WebElement tacfield = driver.findElement(By.name("data"));

	public WebElement textToAdd = driver.findElement(By.xpath("/html/body/div[4]/input[2]"));

	//public String RdmKeys()

	//{
	//String uuid = UUID.randomUUID().toString();
	//return uuid;

	//}

	public void fieldToAddCat(String ac)
	{
		//WebElement tacfield = driver.findElement(By.name("data"));
		tacfield.sendKeys(ac);
	}

	public void clickAddButton()
	{
		WebElement textToAdd = driver.findElement(By.xpath("/html/body/div[4]/input[2]"));
		textToAdd.click();

	}


}
