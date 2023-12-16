package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Eroomrentmenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();  
	    driver.get("https://eroomrent.in/");
	    driver.manage().window().maximize();
	    WebElement link = driver.findElement(By.linkText("Owner-G"));
	    Actions ack = new Actions(driver);
	    Action ac = ack.moveToElement(link).build();
	    ac.perform();
	    driver.findElement(By.partialLinkText("Register")).click();

	}

}
