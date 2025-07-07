package com.quaatso.seleniumdemo.app;

import java.io.File;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver getBrowser(String browser) {
		WebDriver driver = null;
		//open browser
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		} 
		else
			System.out.println("Browser not supported" + browser);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

}
