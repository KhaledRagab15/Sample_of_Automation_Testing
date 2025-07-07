package com.quaatso.seleniumdemo.app;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverWaits {
	
	public void fluentWait(String browser) {
	    WebDriver driver = Browser.getBrowser(browser);

	    // Open W3Schools Tryit Editor
	    driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

	    // Wait for the iframe to be available and switch to it
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")));

	    // Fluent wait for the button
	    Wait<WebDriver> fluentWait = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(5))
	            .pollingEvery(Duration.ofMillis(500))
	            .ignoring(NoSuchElementException.class);

	    WebElement button = fluentWait.until(driver1 -> driver1.findElement(By.tagName("button")));

	    // Click the button
	    button.click();

	    // Optional: delay so you can see the alert (for demo/debug only)
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	    // Handle alert
	    driver.switchTo().alert().accept();

	    driver.quit();
	}


	
	public void webDriverWait(String browser) {
		WebDriver driver = Browser.getBrowser(browser);

		// OPEN W3SCHOOLS
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		// WAIT FOR AND SWITCH TO IFRAME (fixed ID)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));

		// CLICK BUTTON
		driver.findElement(By.tagName("button")).click();

		// WAIT FOR ALERT
		wait.until(ExpectedConditions.alertIsPresent());

		// Optional delay so the alert is visible
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ACCEPT ALERT
		driver.switchTo().alert().accept();

		// Optional: Close browser
		driver.quit();
	}

}
