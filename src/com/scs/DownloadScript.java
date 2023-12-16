package com.scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();  
	    driver.get("https://eternallybored.org/misc/wget/");
	    String path = driver.findElement(By.linkText("ZIP")).getAttribute("href");
	    String wget_command = "cmd /c C:\\wget.exe -P E:\\downloads --no-check-certificate " + path;
	    try {
	           Process exec = Runtime.getRuntime().exec(wget_command);
	           int exitVal = exec.waitFor();
	           System.out.println("Exit value: " + exitVal);
	           } 
	    catch (Exception ex) {
	           System.out.println(ex.toString());
	           }

	}

}
