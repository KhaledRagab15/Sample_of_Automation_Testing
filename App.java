package com.quaatso.seleniumdemo.app;
import java.util.Scanner;

import java.io.File;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class App {
	public static void main(String[] args) {
		
		// open google in chrome browser
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://www.youtube.com");
		
		// open google in firefox browser
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.youtube.com");
		
		// open google in safari browser
		//WebDriver driver = new SafariDriver();
		//driver.get("http://www.youtube.com");
		
		/*
		 * 1. Ask user for its browser
		 * 2. Validate user input
		 * 3. run example on user provided browser
		 */
		
		System.out.println("Please enter the browser of your choice: Chrome or Firefox");
		Scanner scanner = new Scanner(System.in);
		String browser = scanner.next();
		
		//example class
		//ElementFindingExamples examples = new ElementFindingExamples();
		//WebElementPart1 examples = new WebElementPart1();
		//WebElementsPart2 examples = new WebElementsPart2();
		//WebTables examples = new WebTables();
		//WebDriverWaits examples = new WebDriverWaits();
		JavaScriptExamples examples = new JavaScriptExamples();
		
		
		if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("Firefox")) {
			//code to be executed
			//examples.findElementByName(browser);
			//examples.findElementById(browser);
			//examples.findElementByLinkText(browser);
			//examples.findElementByPartialLinkText(browser);
			//examples.findElementByXPath(browser);
			//examples.findElementByCSS(browser);
			//examples.handleIFrame(browser);
			//examples.handleCheckbox(browser);
			//examples.handleRadioButton(browser);
			//examples.handleAlert(browser);
			//examples.handleDropdown(browser);
			//examples.openWebPageUsingNavigation(browser);
			//examples.handleBackwardNavigation(browser);
			//examples.handleForwardNavigation(browser);
			//examples.handlePageRefresh(browser);
			//examples.handleMultipleWindows(browser);
			//examples.getSingleElementFromWebTable(browser);
			//examples.getAllElementFromWebTable(browser);
			//examples.fluentWait(browser);
			//examples.webDriverWait(browser);
			//examples.invokeAlert(browser);
			//examples.sendTextToAnElement(browser);	
			//examples.refreshBrowser(browser);
			//examples.getTitleOfWebPage(browser);
			examples.verticalScroll(browser);
		}
		else
			System.out.println("Browser" + browser + "you entered not supported");
	}

}
