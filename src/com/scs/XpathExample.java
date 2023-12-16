package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("file:///D:/xpathexample.html");
	   // WebElement ele = driver.findElement(By.xpath("//html/body/div/div/input"));
	    WebElement ele = driver.findElement(By.xpath("//div[@id='xyz']/input[2]"));
	    ele.sendKeys("XPATH EXAMPLE");

	}

}
