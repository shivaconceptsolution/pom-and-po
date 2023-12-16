package com.scs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllImage {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://shivaconceptdigital.com/");
	    List<WebElement> lst = driver.findElements(By.tagName("img"));
	    for(WebElement ele:lst)
	    {
	    	//System.out.println(ele.getAttribute("src"));
	    	String data = ele.getAttribute("src");
	    	int index= data.lastIndexOf("/");
	    	System.out.println(data.substring(index+1));
	    	
	    }
	    System.out.println("Total Images are "+lst.size());
	}
}
