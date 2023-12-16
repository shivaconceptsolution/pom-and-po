package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://shivaconceptdigital.com");
	    driver.manage().window().maximize();
	    String s = driver.findElement(By.tagName("h1")).getText();
	    System.out.println(s);

	}

}
