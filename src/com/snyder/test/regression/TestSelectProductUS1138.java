package com.snyder.test.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.snyder.test.config.CreateDriver;
import com.snyder.ui.repo.CartDetailsPage;
import com.snyder.ui.repo.FlipkartHomePage;
import com.snyder.ui.repo.ProductDetailsPage;
import com.snyder.ui.repo.SearchResultPage;

import io.appium.java_client.AppiumDriver;

public class TestSelectProductUS1138 
{
	AppiumDriver driver;
	FlipkartHomePage home_page;
	SearchResultPage search_result_page;
	ProductDetailsPage product_details_page;
	CartDetailsPage cart_details_page;
	
	@BeforeMethod
	public void setUp()
	{
		driver = CreateDriver.getDriverInstance();
		home_page = new FlipkartHomePage(driver);
		search_result_page = new SearchResultPage(driver);
		product_details_page = new ProductDetailsPage(driver);
		cart_details_page = new CartDetailsPage(driver);
	}
	@Test
	public void testAddProductTC1458() throws InterruptedException
	{
		home_page.getSearchTextbox().click();
		home_page.autoCompleteSearchTextbox()
		.sendKeys("mobile", Keys.ENTER);
		
		search_result_page.getFirstElement().click();
		
		product_details_page.getAddToCartButton().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
		.visibilityOf(cart_details_page.getCartProductName()));
		
		Thread.sleep(10000);
		
		String actual = 
				cart_details_page.getCartProductName().getText();
		
		String expected = "Redmi Note 4 (Gold, 64 GB)";
		
		Assert.assertEquals(actual, expected);
	}
}
