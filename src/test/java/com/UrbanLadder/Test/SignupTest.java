package com.UrbanLadder.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.UrbanLadder.MainBase.Constants;
import com.UrbanLadder.MainBase.MainBaseClass;
import com.UrbanLadder.pages.SignupPage;

public class SignupTest extends MainBaseClass{
	
	SignupPage signup = null;
	@BeforeClass
	public void intializingBrowser() {	
		try {
			Class.forName("com.UrbanLadder.MainBase.MainBaseClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		openBrowser();
		signup =PageFactory.initElements(Constants.driver, SignupPage.class);
		MainBaseClass.maximize();
		MainBaseClass.deleteAllCookies();
		openUrl();
		
	}
	
	@Test(priority=1)
	public void signupWithValidEmailAndInvalidPasswordTest() {
		signup.executeSignupFlow(Constants.prop.getProperty("email"), Constants.prop.getProperty("invalidPassword"));
		String label=signup.getPasswordErrorMessage();
		Assert.assertEquals(label, "Please enter at least 8 characters.");
	}
	
	@Test(priority=2)
	public void signupWithInvalidEmailAndValidPasswordTest() {
		signup.executeSignupFlow(Constants.prop.getProperty("invalidEmail"), Constants.prop.getProperty("password"));
		String label=signup.getEmailErrorMessage();
		Assert.assertEquals(label, "Please enter a valid email address.");
	}
	
	@Test(priority=3)
	public void signupWithBlankEmailAndValidPasswordTest() {
		signup.executeSignupFlow(Constants.prop.getProperty("blankEmail"), Constants.prop.getProperty("password"));
		String label=signup.getEmailErrorMessage();
		Assert.assertEquals(label, "This field is required.");
	}
	
	@Test(priority=4)
	public void signupWithValidEmailAndBlankPasswordTest() {
		signup.executeSignupFlow(Constants.prop.getProperty("email"), Constants.prop.getProperty("blankPassword"));
		String label=signup.getPasswordErrorMessage();
		Assert.assertEquals(label, "This field is required.");
	}
	
	@Test(priority=5)
	public void signupWithBlankEmailAndBlankPassword() {
		signup.executeSignupFlow(Constants.prop.getProperty("blankEmail"), Constants.prop.getProperty("blankPassword"));
		String label=signup.getEmailErrorMessage();
		String label1=signup.getPasswordErrorMessage();
		Assert.assertEquals(label, "This field is required.");
		Assert.assertEquals(label1, "This field is required.");
	}
	
	@Test(priority=6)
	public void signupWithValidCredentialTest() {
		signup.executeSignupFlow(Constants.prop.getProperty("email"),Constants.prop.getProperty("password"));
	}
	
	@AfterClass
	public void closeBrowser() {
		MainBaseClass.tearDown();
	}
		

}
