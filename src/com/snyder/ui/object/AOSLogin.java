package com.snyder.ui.object;

import org.openqa.selenium.By;

public interface AOSLogin 
{
	By emailORPhone = By.id("com.flipkart.android:id/mobileNo");
	By password = By.id("com.flipkart.android:id/et_password");
	By signIn = By.id("com.flipkart.android:id/btn_mlogin");
	By cancel = By.id("com.google.android.gms:id/cancel");
}
