package com.printerLogic.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.printerLogic.qa.base.baseTest;

public class homePage extends baseTest{

	// menus
	public static WebElement userMenu = driver.findElement(By.id("user-menu"));
	public static WebElement helpMenu = driver.findElement(By.id("help-menu"));
	public static WebElement toolsMenu = driver.findElement(By.id("gear-menu"));
	public static WebElement reportsMenu = driver.findElement(By.id("reports-menu"));
	
	// buttons
	public static WebElement searchBtn = driver.findElement(By.id("searchButton"));
			
	// tabs
	public static WebElement generalTab = driver.findElement(By.id("oGeneral"));
	public static WebElement securityTab = driver.findElement(By.xpath("//*[@id=\"mainpane\"]/div[2]/ul/li[2]"));
	public static WebElement alertsTab = driver.findElement(By.id("oAlerts"));
	public static WebElement mapTab = driver.findElement(By.id("oMap"));
	public static WebElement privacyLink = driver.findElement(By.linkText("Privacy Policy"));

}
