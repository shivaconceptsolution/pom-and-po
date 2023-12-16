package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://eroomrent.in/");
	    String path= driver.findElement(By.cssSelector("img[alt=tourist]")).getAttribute("src");
        System.out.println(path);
    	int position =path.lastIndexOf("/");
		String imgname = path.substring(position+1);
		System.out.print(imgname);
	}

}
