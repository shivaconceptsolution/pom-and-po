package com.scsnew;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class VerifyPageExample {
	WebDriver driver;
	By Header=By.xpath("//h1");
	By getStarted=By.xpath("//*[@id='signupModalProductButton']");
	public VerifyPageExample(WebDriver driver)
	{
		this.driver=driver;
	}
	public void veryHeader() {
		String getheadertext=driver.findElement(Header).getText();
		System.out.println(getheadertext);
		if(getheadertext.equals("App & Browser Testing Made Easy"))
		{
			System.out.println("Match");
		}
		else
		{
			System.out.println("Not match");
		}
		//assertEquals("App & Browser Testing Made Easy", getheadertext);
		}
	public void clickOnGetStarted() {
		driver.findElement(getStarted).click();
		} 
}
