package com.scsnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPageExampleNew {
	WebDriver driver;
	@FindBy(xpath = "//h1")
	WebElement header;
	@FindBy(xpath = "//*[@id='signupModalProductButton']")
	WebElement getStarted;
	public VerifyPageExampleNew(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void veryHeader() {
		String getheadertext=header.getText();
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
		getStarted.click();
		} 
	
}
