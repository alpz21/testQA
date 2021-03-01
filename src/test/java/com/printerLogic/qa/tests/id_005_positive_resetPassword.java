package com.printerLogic.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.printerLogic.qa.base.baseTest;
import com.printerLogic.qa.pages.loginPage;
import com.printerLogic.qa.pages.resetPasswordPage;

import org.junit.Assert;
import org.junit.Test;

public class id_005_positive_resetPassword extends baseTest {

//Test ID: 005
//Author: abnerlopez21@gmail.com
//Scenario : Lost password functionality

	@Test
	public void lostPasswordPositive() {

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

		// reset password
		// go to config.properties and change the email value
		resetPasswordPage.emailTxtbx.sendKeys(prop.getProperty("email"));
		resetPasswordPage.resetPasswordBtn.click();

		// see the successful message
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"password-body\"]/div"),
				"We have emailed your password reset link!"));
	}
}