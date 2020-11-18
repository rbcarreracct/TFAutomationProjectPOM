//JUnit Test

package com.tfAutomationProject.testCases;

import java.util.UUID;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TC_RemoveAllItems_006 extends BaseClassJunitTest{

	@Test
	public void RemoveAll()

	{
		driver.get(baseURL);

		String uuid = UUID.randomUUID().toString();
		driver.findElement(By.name("data")).sendKeys(uuid);



		driver.findElement(By.name("allbox")).click();

		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();


		String strUrl = driver.getCurrentUrl();

		driver.get(strUrl);

		Actions act = new Actions(driver); act.sendKeys(Keys.F5).perform();


	}

}
