package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AOSCartDetails;

public class CartDetailsPage 
{
	RemoteWebDriver driver;
	public CartDetailsPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getCartProductName()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSCartDetails.productName);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return null;
		}
		return null;	
	}
}
