package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
	    String s = driver.findElement(By.cssSelector("input[value=click]")).getCssValue("color");
        System.out.println("Color is "+s);
        WebElement el = driver.findElement(By.cssSelector("input[value=click]"));
        System.out.println("x="+el.getLocation().x);
        System.out.println("y="+el.getLocation().y);
        
        
	}

}
