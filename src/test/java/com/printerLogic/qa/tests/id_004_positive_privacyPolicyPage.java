package com.printerLogic.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.printerLogic.qa.base.baseTest;
import com.printerLogic.qa.pages.loginPage;

import org.junit.Assert;
import org.junit.Test;

public class id_004_positive_privacyPolicyPage extends baseTest {

//Test ID: 004
//Author: abnerlopez21@gmail.com
//Scenario : User is able to go to the privacy policy page from login

	@Test
	public void privacyPolicyPage() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// wait to see login page elements
		wait.until(ExpectedConditions.visibilityOf(loginPage.usernameTxtbx));
		wait.until(ExpectedConditions.visibilityOf(loginPage.passwordTxtbx));
		wait.until(ExpectedConditions.visibilityOf(loginPage.loginBtn));
		wait.until(ExpectedConditions.visibilityOf(loginPage.lostPasswordLink));
		wait.until(ExpectedConditions.visibilityOf(loginPage.privacyLink));

		// store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// click on privacy policy button
		loginPage.privacyLink.click();

		// switch to new tab opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// see the privacy policy text
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("privacyPolicyURL"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
				By.xpath("/html/body/div[2]/div[1]/div/div[1]/div[1]/div/div/h1"), "Privacy Policy"));

		// close the new tab
		driver.close();

		// switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

	}
}