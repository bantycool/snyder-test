package com.snyder.utils;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.HasNetworkConnection;
import io.appium.java_client.ios.IOSDriver;

public class DeviceHandler 
{
	public static void changeOrientationToPotrait(RemoteWebDriver driver)
	{
		if(driver.getClass().getName().contains("AndroidDriver"))
		{
			AndroidDriver android_driver = (AndroidDriver) driver;
			ScreenOrientation current = android_driver.getOrientation();
			if(current.toString().equalsIgnoreCase("landscape"))
			{
				try
				{
					android_driver.rotate(ScreenOrientation.PORTRAIT);
				}
				catch(Exception e)
				{
					System.err.println("Orientation is not supported  by the application");
				}
			}
		}
		else if(driver.getClass().getName().contains("IOSDriver"))
		{
			IOSDriver ios_driver = (IOSDriver) driver;
			ScreenOrientation current = ios_driver.getOrientation();
			if(current.toString().equalsIgnoreCase("landscape"))
			{
				try
				{
					ios_driver.rotate(ScreenOrientation.PORTRAIT);
				}
				catch(Exception e)
				{
					System.err.println("Orientation is not supported  by the application");
				}
			}
		}
	}
	public static void changeOrientationToLandscape(RemoteWebDriver driver)
	{
		AppiumDriver appium_driver = (AppiumDriver) driver;
		ScreenOrientation current = appium_driver.getOrientation();
		if(current.toString().equalsIgnoreCase("portrait"))
		{
				appium_driver.rotate(ScreenOrientation.LANDSCAPE);
		}
	}
	
	public static void enableNetwork(AppiumDriver driver)
	{
		
		
	}
	public static void disableNetwork(AppiumDriver driver)
	{
		
	}
	public static void swipeRightToLeftScreen(AppiumDriver driver)
	{
		driver.swipe(1010, 820, 80, 820, 2000);
	}
	public static void swipeLeftToRightScreen(AppiumDriver driver)
	{
		driver.swipe(80, 820, 1010, 820, 2000);
	}
	
	// Add more functionality
}
