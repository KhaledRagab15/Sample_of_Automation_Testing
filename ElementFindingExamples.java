package com.quaatso.seleniumdemo.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFindingExamples {
	
	public void findElementByName(String browser) {
		/*
		 * 1. Get webdriver object as per browser name
		 * 2. open facebook
		 * 3. Find email element
		 */
		
		WebDriver driver = Browser.getBrowser(browser);
		
		//open facebook
		driver.get("https://www.facebook.com");
		
		//find email webelement
		WebElement emailElement = driver.findElement(By.name("email"));
		
		//perform any action on the emailElement
		emailElement.sendKeys("author@quaatso.com");
		
	}
	
	public void findElementById(String browser) {
		/*
		 * 1. Get webdriver object as per browser name
		 * 2. open facebook
		 * 3. Find email element
		 */
		
		WebDriver driver = Browser.getBrowser(browser);
		
		//open facebook
		driver.get("https://www.facebook.com");
		
		//find email webelement
		WebElement emailElement = driver.findElement(By.id("pass"));
		
		//perform any action on the emailElement
		emailElement.sendKeys("hotdoglonggadog");
		
	}
	
	public void findElementByLinkText(String browser) {
		/*
		 * 1. Get webdriver object as per browser name
		 * 2. open facebook
		 * 3. Find email element
		 */
		
		WebDriver driver = Browser.getBrowser(browser);
		
		//open facebook
		driver.get("https://www.facebook.com");
		
		//find email webelement
		WebElement emailElement = driver.findElement(By.linkText("Forgot password?"));
		
		//perform any action on the emailElement
		emailElement.click();
		
	}
	
	public void findElementByPartialLinkText(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		//open facebook
		driver.get("https://www.facebook.com");
		
		//find email webelement
		WebElement emailElement = driver.findElement(By.partialLinkText("Instagram"));
		
		//perform any action on the emailElement
		emailElement.click();
		
	}
	
	public void findElementByXPath(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		//open facebook
		driver.get("https://www.facebook.com");
		
		//find email webelement
		WebElement emailElement = driver.findElement(By.xpath("//*[@name='email']"));
		
		//perform any action on the emailElement
		emailElement.sendKeys("sample@sample.com");
		
	}
	
	public void findElementByCSS(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		//open facebook
		driver.get("https://www.facebook.com");
		
		//find email webelement
		WebElement emailElement = driver.findElement(By.cssSelector("input[id='pass']"));
		
		//perform any action on the emailElement
		emailElement.sendKeys("sample@sample.com");
		
	}
	
	
	

}
