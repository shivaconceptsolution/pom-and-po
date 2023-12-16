package com.scs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTitleExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://shivaconceptdigital.com");
	    System.out.println(driver.getTitle());
	    if(driver.getTitle().length()>60)
	    {
	    	System.out.println("Invalid Title");
	    }
	    else
	    {
	    	System.out.println("Valid Title");
	    }

	}

}
