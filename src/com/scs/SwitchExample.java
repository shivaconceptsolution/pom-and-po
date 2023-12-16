package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://output.jsbin.com/usidix/1");
	    driver.findElement(By.tagName("input")).click();
	    String s =driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    System.out.println(s);
	   
	    

	}

}
