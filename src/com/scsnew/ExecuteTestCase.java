package com.scsnew;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecuteTestCase {
  VerifyPageExampleNew obj;
  WebDriver driver;
  @BeforeTest
  public void setup() {
  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://www.browserstack.com/");
  }
  @Test
  public void f() {
	  obj = new VerifyPageExampleNew(driver);
	  obj.veryHeader();
	  obj.clickOnGetStarted();
  }
  @AfterTest
  public void closeSetup()
  {
	  driver.close();
  }
}
