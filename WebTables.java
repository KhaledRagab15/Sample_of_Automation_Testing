package com.quaatso.seleniumdemo.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTables {
	
	public void getSingleElementFromWebTable(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		
		//OPEN TIME AND DATE WEBPAGE
		driver.get("https://www.timeanddate.com/worldclock/");
		
		//GET DATE OF p133 ID ELEMENT
		String elementText = driver.findElement(By.id("p133")).getText();
		
		//PRINT DATE AND TIME
		System.out.println("Text from the web table is " + elementText);
	}
	
	public void getAllElementFromWebTable(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		
		//OPEN W3SCHOOL
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		
		//SWITCH TO IFRAME
		driver.switchTo().frame("iframeResult");
		
		//GET TABLE ELEMENT
		WebElement table = driver.findElement(By.tagName("table"));
		
		//GET ALL ROW ELEMENTS
		List <WebElement> rowList = table.findElements(By.tagName("tr"));
		
		//RUN THROUGH EACH ROW AND RETREIVE DATA
		for(WebElement row : rowList) {
			//GET ALL DATA ELEMENTS
			List <WebElement> dataList = row.findElements(By.tagName("td"));
			
			//RUN THROUGH EACH DATA AND PRINT DATA
			for(WebElement data : dataList) {
				System.out.println(data.getText() + "\t");
			}
			System.out.println();
		}
	}
}
