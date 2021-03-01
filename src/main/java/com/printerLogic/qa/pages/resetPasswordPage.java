package com.printerLogic.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.printerLogic.qa.base.baseTest;

public class resetPasswordPage extends baseTest {

	// labels
	public static WebElement passwordTitle = driver.findElement(By.id("password-title"));

	// textboxes
	public static WebElement emailTxtbx = driver.findElement(By.id("email"));

	// buttons
	public static WebElement resetPasswordBtn = driver
			.findElement(By.xpath("//*[@id=\"forgot-password-form\"]/div[3]/div/button[1]/span"));
	public static WebElement cancelBtn = driver
			.findElement(By.xpath("//*[@id=\"forgot-password-form\"]/div[3]/div/button[2]/span"));

}
