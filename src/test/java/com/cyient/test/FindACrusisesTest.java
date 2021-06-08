package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;


@Test

public class FindACrusisesTest extends WebDriverWrapper{
	
	@Test
	public void signinInvalidCredential() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='email-capture__body']//*[local-name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='headerMainToolbar__menu__icon']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Find a Cruise']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2021-2022 Cruises']")).click();
		driver.findElement(By.id("rciFirstName")).sendKeys("shraddha");
		driver.findElement(By.id("rciLastName")).sendKeys("Hiwarkar");
	     driver.findElement(By.xpath("//select[@class='md-input']")).click();
		driver.findElement(By.xpath("//option[@value='IND']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		String actualValue = driver.findElement(By.xpath("//span[@id='rciEmailAddressMissing']")).getText();
		Assert.assertEquals(actualValue, "Missing Email Address");
		
	}
}