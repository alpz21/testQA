package com.printerLogic.qa.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
 
public class baseTest {
 
	public static WebDriver driver;
	public static Properties prop;
	protected static String username;
    protected static String password;
	 
	@Before
	public void launchApplication(){
		//Read config.properties file to get environment variables
				try {
					prop = new Properties();
					FileInputStream ip = new FileInputStream("src/main/java/com/printerLogic/qa/config/config.properties");
					prop.load(ip);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("initialURL"));
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
 
 
}
