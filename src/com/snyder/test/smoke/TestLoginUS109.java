package com.snyder.test.smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.snyder.test.config.CreateDriver;
import com.snyder.ui.repo.FlipkartHomePage;
import com.snyder.ui.repo.LoginPage;
import com.snyder.ui.repo.MenuItemsPage;
import com.sun.jna.platform.win32.WinDef.HMENU;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestLoginUS109 
{
	AppiumDriver driver;
	FlipkartHomePage home_page;
	MenuItemsPage menu_items;
	LoginPage login_page;
	
	@BeforeMethod
	public void setUp()
	{
		driver = CreateDriver.getDriverInstance();
		home_page = new FlipkartHomePage(driver);
		menu_items = new MenuItemsPage(driver);
		login_page = new LoginPage(driver);
	}
	@Test
	public void testLoginSuccessTC119()
	{
//		Click on Menu icon
		home_page.getMenuIcon().click();
//		Click on My accounts
		menu_items.getMyAccount().click();
//		Click on Email Textbox
		login_page.getEmailOrPhoneTextbox().click();
//		CLick on None of Above
		login_page.getCancelButton().click();
//		Enter Email ID
		login_page.getEmailOrPhoneTextbox().sendKeys("retheshks78@gmail.com");
//		Enter password
		login_page.getPasswordTextbox().sendKeys("tegststg");
//		Click on SignIn button
		login_page.getSignInButton().click();
	}
}
