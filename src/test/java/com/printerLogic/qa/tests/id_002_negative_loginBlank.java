package com.printerLogic.qa.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.printerLogic.qa.base.baseTest;
import com.printerLogic.qa.pages.loginPage;

import org.junit.Test;

public class id_002_negative_loginBlank extends baseTest {

//Test ID: 002
//Author: abnerlopez21@gmail.com
//Scenario : Alert is displayed when user tries to login with blank user and password

	@Test
	public void blankLogin() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// wait to see login page elements
		wait.until(ExpectedConditions.visibilityOf(loginPage.usernameTxtbx));
		wait.until(ExpectedConditions.visibilityOf(loginPage.passwordTxtbx));
		wait.until(ExpectedConditions.visibilityOf(loginPage.loginBtn));
		wait.until(ExpectedConditions.visibilityOf(loginPage.lostPasswordLink));
		wait.until(ExpectedConditions.visibilityOf(loginPage.privacyLink));

		// don't send values in textbox
		loginPage.usernameTxtbx.sendKeys("");
		loginPage.passwordTxtbx.sendKeys("");

		// try to sign in
		loginPage.loginBtn.click();

		// see the text alert
		wait.until(ExpectedConditions.textToBePresentInElement(loginPage.loginText,
				"Please enter your username and password:"));

	}
}