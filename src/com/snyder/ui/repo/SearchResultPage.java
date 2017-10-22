package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AOSFlipkartHome;
import com.snyder.ui.object.AOSSearchResult;

import io.appium.java_client.AppiumDriver;

public class SearchResultPage 
{
	RemoteWebDriver driver;
	public SearchResultPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getFirstElement()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSSearchResult.firstElememt);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return null;
		}
		return null;
	}
}
