package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLOCATORExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("file:///C:/Users/DELL/Desktop/csslocator.html");
	    driver.findElement(By.cssSelector("input")).sendKeys("text1");
	    driver.findElement(By.cssSelector("input.abc")).sendKeys("text1");
	    driver.findElement(By.cssSelector("input[type=radio]")).click();
	    driver.findElement(By.cssSelector("input.abc1[placeholder='text4']")).sendKeys("Tagname classname and attributename");
	    
	    

	}

}
