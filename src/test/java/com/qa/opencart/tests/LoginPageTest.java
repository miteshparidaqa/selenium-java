package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest
{
	@Test
	public void loginPageTitleTest()
	{
		String actualTitle=loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle,"Account Login");
	}
	
	@Test
	public void loginPageUrlTest()
	{
		String ActualURL=loginPage.getLoginPageUrl();
	    //Assert.assertEquals(ActualURL,"https://naveenautomationlabs.com/opencart/index.php?route=account/login"); 
		Assert.assertTrue(ActualURL.contains("route=account/login"));
	}
	@Test
	public void forgotPwdLinkExistTest()
	{
		Assert.assertTrue(loginPage.IsForgotPasswordLinkExist());
	}
	@Test
	public void loginTest()
	{
		loginPage.doLogin("naveen@gmail.com","test@123");
	}
	
	
	
	

}
