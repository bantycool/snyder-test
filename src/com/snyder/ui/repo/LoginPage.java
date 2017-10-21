package com.snyder.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.snyder.ui.object.AOSLogin;

public class LoginPage 
{
	RemoteWebDriver driver;
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getEmailOrPhoneTextbox()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSLogin.emailORPhone);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
//			TBD
		}
		return null;
	}
	public WebElement getPasswordTextbox()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSLogin.password);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
//			TBD
		}
		return null;
	}
	public WebElement getSignInButton()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSLogin.signIn);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
//			TBD
		}
		return null;
	}
	public WebElement getCancelButton()
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			return driver.findElement(AOSLogin.cancel);
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
//			TBD
		}
		return null;
	}
	
}
