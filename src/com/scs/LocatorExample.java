package com.scs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://shivaconceptdigital.com");
	    WebElement header=  driver.findElement(By.xpath("//html/body/div[10]"));
	    List<WebElement> lst= header.findElements(By.tagName("a"));
	    ArrayList obj= new ArrayList();
	    for(WebElement data:lst)
	    {
	    	obj.add(data.getAttribute("href"));
	    }
	    for(Object data1:obj)
	    {
	    	driver.navigate().to(data1.toString());
	    	Thread.sleep(1000);
	    }
	   // System.out.println("Total Fee are "+sum);
	    // driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
	   /* driver.findElement(By.id("txt1")).sendKeys("test1234");
	    driver.findElement(By.name("txt2")).sendKeys("abcdefgh");
	    driver.findElement(By.name("txt3")).sendKeys("sddsdfdfd@gmail.com");
	    driver.findElement(By.cssSelector("input[type='date']")).sendKeys("10-10-1990");
	    driver.findElement(By.name("txt4")).sendKeys("12345");
	    driver.findElement(By.linkText("Click")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("shivaconcept")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.findElement(By.className("abc")).sendKeys("By Classname");*/
	 //   driver.findElement(By.cssSelector("input[value=click]")).clear();
	   // driver.findElement(By.cssSelector("input[value=click]")).sendKeys("Locator example Tag and Attribute");
       // driver.findElement(By.cssSelector("input[value=FeMale]")).click();
       // driver.findElement(By.name("chk1")).click();
       // Select course = new Select(driver.findElement(By.id("c")));
       // course.selectByValue("TestNG");
     //   course.selectByIndex(2);
      // course.selectByVisibleText("TESTNG");
     //   Select course1 = new Select(driver.findElement(By.name("c[]")));
        // course.selectByValue("TestNG");
      //   course.selectByIndex(2);
      //  Select course1 = new Select(driver.findElement(By.cssSelector("select[name='c[]']")));
        // course1.selectByVisibleText("TESTNG");
         //course1.selectByVisibleText("Web Driver");
         //driver.findElement(By.xpath("//html/body/input[18]")).sendKeys("XPATH EXAMPLE");
       // driver.findElement(By.cssSelector("a[href='http://shivaconceptsolution.com']")).click();
	}

}
