package com.printerLogic.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.printerLogic.qa.base.baseTest;

public class loginPage extends baseTest {

	// textboxes
	public static WebElement usernameTxtbx = driver.findElement(By.id("relogin_user"));
	public static WebElement passwordTxtbx = driver.findElement(By.id("relogin_password"));
	
	// buttons
	public static WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"admin-login-btn\"]/span"));
	
	// links
	public static WebElement lostPasswordLink = driver.findElement(By.linkText("Lost Password"));
	public static WebElement privacyLink = driver.findElement(By.linkText("Privacy Policy"));
	
	// text
	public static WebElement loginText = driver.findElement(By.id("logintext"));

}
