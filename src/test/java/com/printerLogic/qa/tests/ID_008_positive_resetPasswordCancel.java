package com.printerLogic.qa.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.printerLogic.qa.base.baseTest;
import com.printerLogic.qa.pages.loginPage;
import com.printerLogic.qa.pages.resetPasswordPage;

import org.junit.Assert;
import org.junit.Test;

public class ID_008_positive_resetPasswordCancel extends baseTest {

//Test ID: 008
//Author: abnerlopez21@gmail.com
//Scenario : Lost password cancel button functionality

	@Test
	public void lostPasswordCancel() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// wait to see login page elements
		wait.until(ExpectedConditions.visibilityOf(loginPage.usernameTxtbx));
		wait.until(ExpectedConditions.visibilityOf(loginPage.passwordTxtbx));
		wait.until(ExpectedConditions.visibilityOf(loginPage.loginBtn));
		wait.until(ExpectedConditions.visibilityOf(loginPage.lostPasswordLink));
		wait.until(ExpectedConditions.visibilityOf(loginPage.privacyLink));

		// click on lost password link
		loginPage.lostPasswordLink.click();
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("resetPwdURL"));

		// click on cancel button
		resetPasswordPage.cancelBtn.click();

		// validate user is redirected to home login page
		wait.until(ExpectedConditions.urlToBe(prop.getProperty("initialURL")));

	}
}