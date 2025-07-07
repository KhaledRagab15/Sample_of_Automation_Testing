package com.quaatso.seleniumdemo.app;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExamples {
	
	public void invokeAlert(String browser) {
		//DRIVER OBJECT
		WebDriver driver = Browser.getBrowser(browser);
	
		//OPEN FACEBOOK
		driver.get("https://www.facebook.com");
		
		//CREATE OBJECT OF JAVASCRIPT EXECUTOR
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		//EXECUTE ALERT() FUNCTION
		executor.executeScript("alert('This alert is injected by webdriver');");
	}
	
	public void sendTextToAnElement(String browser) {
		//DRIVER OBJECT
		WebDriver driver = Browser.getBrowser(browser);
			
		//OPEN FACEBOOK
		driver.get("https://www.facebook.com");
				
		//CREATE OBJECT OF JAVASCRIPT EXECUTOR
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		//ENTER EMAIL
		executor.executeScript("document.getElementById('email').value='sample@sample.com';");
		
		//ENTER PASS
		executor.executeScript("document.getElementsByName('pass') [0].value='abcabc';");
		
		//CLICK ON BUTTON
		executor.executeScript("document.getElementsByName('login') [0].click();");
	}
		
	public void refreshBrowser(String browser) {
		//DRIVER OBJECT
		WebDriver driver = Browser.getBrowser(browser);
					
		//OPEN FACEBOOK
		driver.get("https://www.facebook.com");
		
		//CREATE OBJECT OF JAVASCRIPT EXECUTOR
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		//REFRESH THE PAGE
		executor.executeScript("history.go(0);");
						
	}
	
	public void getTitleOfWebPage(String browser) {
		//DRIVER OBJECT
		WebDriver driver = Browser.getBrowser(browser);
					
		//OPEN FACEBOOK
		driver.get("https://www.facebook.com");
		
		//CREATE OBJECT OF JAVASCRIPT EXECUTOR
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		//REFRESH THE PAGE
		String pageTitle = executor.executeScript("return document.title").toString();
		
		//PRINT TITLE
		System.out.print("The page title is " +pageTitle);			
	}
	
	public void verticalScroll(String browser) {
		//DRIVER OBJECT
		WebDriver driver = Browser.getBrowser(browser);
					
		//OPEN FACEBOOK
		driver.get("https://www.facebook.com");
		
		//CREATE OBJECT OF JAVASCRIPT EXECUTOR
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		//VERTICAL SCROLL
		executor.executeScript("window.scrollBy(0,750);");
	
	}
}
