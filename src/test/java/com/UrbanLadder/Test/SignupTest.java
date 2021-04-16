package com.UrbanLadder.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.UrbanLadder.MainBase.Constants;
import com.UrbanLadder.MainBase.MainBaseClass;
import com.UrbanLadder.pages.SignupPage;

public class SignupTest {
	
	//SignupPage signup=PageFactory.initElements(Constants.driver, SignupPage.class);
	SignupPage signup = new SignupPage();
	@BeforeClass
	public void intializingBrowser() {	
		try {
			Class.forName("com.UrbanLadder.MainBase.MainBaseClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		MainBaseClass.openBrowser(Constants.prop.getProperty("browser"));
		MainBaseClass.maximize();
		MainBaseClass.openUrl(Constants.prop.getProperty("url"));
		
		
	}
		
	@Test(priority=1)
	public void enterEmailIdOnTextboxTest() {
		signup.enterEmailIdOnTextbox(Constants.prop.getProperty("email"));
		
	}
	
	@Test(priority=2)
	public void enterPasswordOnTextboxTest() {
		signup.enterPasswordOnTextbox(Constants.prop.getProperty("password"));
			
	}
	
	@Test(priority=3)
	public void verifyShowAndPasswordlinkTest()  {
		signup.verifyShowAndHidePasswordlink();
		
	}
	
	@Test(priority=5)
	public void clickOnSignUpButtonTest() {
		signup.clickOnSignUpButton();
	}
	
	@Test(priority=4)
	public void clickOnLoginLink() {
		signup.clickOnLoginink();
	}
	
	@AfterClass
	public void closeBrowser() {
		MainBaseClass.tearDown();
	}
		

}
