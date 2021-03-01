package com.printerLogic.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import org.junit.Test;

import com.printerLogic.qa.pages.loginPage;

import com.printerLogic.qa.base.baseTest;

public class id_001_positive_login extends baseTest {

	// Test ID: 001
	// Author: abnerlopez21@gmail.com
	// Scenario : User is able to login with valid username and password

	@Test
	public void loginCorrectly() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// wait to see login page elements
		wait.until(ExpectedConditions.visibilityOf(loginPage.usernameTxtbx));
		wait.until(ExpectedConditions.visibilityOf(loginPage.passwordTxtbx));
		wait.until(ExpectedConditions.visibilityOf(loginPage.loginBtn));
		wait.until(ExpectedConditions.visibilityOf(loginPage.lostPasswordLink));
		wait.until(ExpectedConditions.visibilityOf(loginPage.privacyLink));

		// send the values
		// go to config.properties and change the username and password values
		loginPage.usernameTxtbx.sendKeys(prop.getProperty("username"));
		loginPage.passwordTxtbx.sendKeys(prop.getProperty("password"));

		// sign in
		loginPage.loginBtn.click();
		wait.until(ExpectedConditions.urlToBe(prop.getProperty("initialURL")));

		// save element location
		By byElement = By.id("tabsetpage");

		// wait to see the home page
		Thread.sleep(3000);
		Assert.assertTrue("Home Page is not displayed", driver.findElements(byElement).size() >= 1);

	}
}