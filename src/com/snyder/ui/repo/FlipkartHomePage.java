package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AOSFlipkartHome;
import com.snyder.ui.object.IOSFlipkartHome;

public class FlipkartHomePage 
{
	RemoteWebDriver driver;
	public FlipkartHomePage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getAddToCart()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSFlipkartHome.addToCart);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return driver.findElement(IOSFlipkartHome.addToCart);
		}
		return null;
	}
	public WebElement getSearchTextbox()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSFlipkartHome.searchTextbox);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return driver.findElement(IOSFlipkartHome.searchTextbox);
		}
		return null;
	}
	public WebElement getMenuIcon()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSFlipkartHome.menuIcon);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return driver.findElement(IOSFlipkartHome.menuIcon);
		}
		return null;
	}
	public WebElement autoCompleteSearchTextbox()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSFlipkartHome.autoCompletesearchTextbox);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return null;
		}
		return null;
	}
	public WebElement autoSuggestionMobile()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSFlipkartHome.autoSuggestionMobile);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			return null;
		}
		return null;
	}
}
