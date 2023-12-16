package com.scs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("file:///D:/webdrivertext.html");
	    String s = driver.findElement(By.cssSelector("input[value=PHP]")).getAttribute("value");
	    System.out.println(s);
	    List<WebElement> ele = driver.findElements(By.cssSelector("input[type=radio]"));
	    System.out.println("Total Radio is "+ele.size());
	    List<WebElement> para = driver.findElements(By.tagName("p"));
	    System.out.println("Total Paragraph are "+para.size());
	    for(WebElement ele1 : para)
	    {
	    	System.out.println(ele1.getText());
	    }

	}

}
