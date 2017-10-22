package com.snyder.ui.object;

import org.openqa.selenium.By;

public interface AOSFlipkartHome 
{
	By searchTextbox = By.id("com.flipkart.android:id/search_widget_textbox");
	By addToCart = By.id("com.flipkart.android:id/cart_bg_icon");
	By menuIcon = By.xpath("//android.widget.ImageButton[@content-desc='Open Drawer']");
	By autoCompletesearchTextbox = By.id("com.flipkart.android:id/search_autoCompleteTextView");
	By autoSuggestionMobile = By.xpath("//android.widget.TextView[@text='mobile']");
	
}
