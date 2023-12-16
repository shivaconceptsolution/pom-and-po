package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();  
	    driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
	    Actions ack = new Actions(driver);
	    WebElement ele = driver.findElement(By.id("txt1"));
        ack.moveToElement(ele).click().keyDown(ele,Keys.SHIFT).sendKeys("hello world").doubleClick(ele).build().perform();
        
	}

}
