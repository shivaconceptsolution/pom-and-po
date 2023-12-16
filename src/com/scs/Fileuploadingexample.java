package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadingexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	    WebDriver driver; //reference
	    ChromeDriver ch = new ChromeDriver(); //object 
	    driver=ch;
	    driver.get("https://demo.guru99.com/test/upload/");
	    WebElement ele = driver.findElement(By.name("uploadfile_0"));
	    ele.sendKeys("d://info.txt");
	    driver.findElement(By.name("terms")).click();
	    driver.findElement(By.id("submitbutton")).click();
	    

	}

}
