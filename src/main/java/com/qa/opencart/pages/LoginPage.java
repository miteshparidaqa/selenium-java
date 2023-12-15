package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	//1.create private locators so that someone couldnot change them
	private By emailId= By.id("input-email");
	private By password=By.id("input-password");
	private By loginBtn=By.xpath("//input[@value='Login']");
	private By forgotPwdLink=By.linkText("Forgotten Password");
	
	//2.Create page constructor and initialize the driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//3. Create page actions/methods:
	public String getLoginPageTitle()
	{
		String title=driver.getTitle();
		System.out.println("Login Page Title:"+title);
		return title;
	}
	
	public String getLoginPageUrl()
	{
		String Url=driver.getCurrentUrl();
		System.out.println("Login Page Url:"+Url);
		return Url;
	}
	
	public boolean IsForgotPasswordLinkExist()
	{
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void doLogin(String un,String pwd)
	{
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}

}
