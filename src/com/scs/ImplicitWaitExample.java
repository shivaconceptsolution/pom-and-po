package com.scs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.id("APjFqb"));
	    element.sendKeys("Selenium WebDriver Interview questions");
	    element.sendKeys(Keys.RETURN);
	    List<WebElement> list = driver.findElements(By.className("MjjYud"));
	    System.out.println(list.size());

	}

}
