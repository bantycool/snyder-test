package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AOSProductDetails;
import com.snyder.ui.object.AOSSearchResult;

public class ProductDetailsPage {
	RemoteWebDriver driver;
	public ProductDetailsPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getAddToCartButton()
	{

		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSProductDetails.addToCart);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return null;
		}
		return null;	
	}
	
}
