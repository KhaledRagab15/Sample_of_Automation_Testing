package com.quaatso.seleniumdemo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementsPart2 {
	public void openWebPageUsingNavigation(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		
		//OPEN FACEBOOK PAGE USING NAVIGATION CLASS
		driver.navigate().to("https://www.facebook.com");
	}
	
	public void handleBackwardNavigation(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		
		//OPEN FACEBOOK PAGE USING NAVIGATION CLASS
		driver.navigate().to("https://www.facebook.com");
		
		//OPEN YOUTUBE
		driver.navigate().to("https://www.youtube.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//BACKWARD NAVIGATION
		driver.navigate().back();
		
		
	}
	
	public void handleForwardNavigation(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		
		//OPEN FACEBOOK PAGE USING NAVIGATION CLASS
		driver.navigate().to("https://www.facebook.com");
		
		//OPEN ABOUT PAGE
		driver.findElement(By.linkText("Messenger")).click();
		
		//CLICK ON LOGIN BUTTON
		driver.findElement(By.id("loginbutton")).click();
		
		//MOVE BACK
		driver.navigate().back();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FORWARD NAVIGATION
		driver.navigate().forward();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//NAVIGATE BACKWARD
		driver.navigate().back();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FORWARD NAVIGATION
		driver.navigate().forward();
		
	}
	
	public void handlePageRefresh(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		
		//OPEN FACEBOOK PAGE USING NAVIGATION CLASS
		driver.navigate().to("https://www.facebook.com");
		
		//REFRESH PAGE
		driver.navigate().refresh();
	}
	
	public void handleMultipleWindows(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		
		//OPEN W3SCHOOL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		
		//PRINT TITLE OF PAGE
		System.out.println("Parent title is " + driver.getTitle());
		
		//SWITCH TO IFRAME
		driver.switchTo().frame("iframeResult");
		
		//CAPTURE WINDOW ID
		String parentWindowId = driver.getWindowHandle();
		
		System.out.println("Parent window id is " + parentWindowId );
		
		//CLICK OVER THE BUTTON
		driver.findElement(By.tagName("button")).click();
		
		//GET ALL WINDOW IDS
		Set <String> windIdsSet = driver.getWindowHandles();
		
		//CONVERT TO LIST
		List <String> windIdsList = new ArrayList <String> (windIdsSet);
		
		//SWITCH TO THE CHILD WINDOW
		driver.switchTo().window(windIdsList.get(1));
		
		//PRINT TITLE OF CHILD PAGE
		System.out.println("Child title is " + driver.getTitle());
		
		//SWITCH TO THE PARENT PAGE
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent title is " + driver.getTitle());
		
		//MAXIMIZE OF WINDOW
		driver.manage().window().maximize();
		
		
	}
}
