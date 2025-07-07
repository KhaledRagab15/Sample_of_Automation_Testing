package com.quaatso.seleniumdemo.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementPart1 {

	public void handleIFrame(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		//open iframe page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		//switch to the parent IFrame
		driver.switchTo().frame("iframeResult");
		//find child iframe
		WebElement childIframe = driver.findElement(By.tagName("iframe"));
		//switch to child iframe
		driver.switchTo().frame(childIframe);
		
		//click on html link
		driver.findElement(By.linkText("LEARN HTML")).click();
		
		//switch to parent iframe
		driver.switchTo().parentFrame();
		
		//switch to default content
		driver.switchTo().defaultContent();
	}
	
	public void handleCheckbox(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		//open iframe page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		//switch to the parent IFrame
		driver.switchTo().frame("iframeResult");
		//find first checkbox, select it 
		driver.findElement(By.name("vehicle1")).click();
		//sleep 
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		//deselect checkbox
		driver.findElement(By.name("vehicle1")).click();
	}
	
	public void handleRadioButton(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		//open iframe page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		
		//switch to the parent IFrame
		driver.switchTo().frame("iframeResult");
		
		//find first radio button and click over it
		driver.findElement(By.cssSelector("input[value='JavaScript']")).click();
		
		//sleep 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[value='CSS']")).click();
	}
	
	public void handleAlert(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		//open iframe page
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		//switch to the parent IFrame
		driver.switchTo().frame("iframeResult");
		
		//find amd click over the button
		driver.findElement(By.tagName("button")).click();
		
		//witch to the alert and get text
		Alert alert = driver.switchTo().alert();
		
		//print alert text
		System.out.println("Alert text is " + alert.getText());
		
		//accept alert
		alert.accept();
		
	}
	
	public void handleDropdown(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		//open iframe page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		//switch to the parent IFrame
		driver.switchTo().frame("iframeResult");
		
		//find select element
		WebElement select = driver.findElement(By.tagName("select"));
		
		//initialise select object
		Select dropdown = new Select(select);
			
		dropdown.selectByVisibleText("Opel");
	}
	
	
	
	
}
