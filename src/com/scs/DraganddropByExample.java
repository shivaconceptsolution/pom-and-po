package com.scs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganddropByExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();  
	    driver.get("https://demoqa.com/droppable/");
	    driver.manage().window().maximize();
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement source = driver.findElement(By.id("draggable"));
	  //  WebElement desti = driver.findElement(By.id("droppable"));
	    Actions obj = new Actions(driver);
	    obj.dragAndDropBy(source, 250,30).perform();
	   /* obj.dragAndDrop(source, desti).perform();
	    String s = desti.getText();
	    if(s.equals("Dropped!"))
	    {
	    	System.out.println("Dropped");
	    }
	    else
	    {
	    	System.out.println("Not Dropped");
	    }*/
	    
	    

	}

}
