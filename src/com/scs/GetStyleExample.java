package com.scs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetStyleExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();  
	    driver.get("file:///D:/htmlsession/demo1.html");
	    String color = driver.findElement(By.tagName("h2")).getCssValue("background-color");
	    System.out.println(color);
	    List<WebElement> ele = driver.findElements(By.tagName("img"));
	    String width="";
	    String height="";
	    for(WebElement we:ele)
	    {
	    width=  we.getAttribute("width");
	    height = we.getAttribute("height");   
	     
	    }

	    System.out.println("width is"+width);
	    System.out.println("height is"+height);
	    

	}

}
