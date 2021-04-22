package com.UrbanLadder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.UrbanLadder.MainBase.Constants;

public class SignupPage {
	
	@FindBy(xpath="//form[@id='signup_form']//input[@id='spree_user_email']")
	WebElement textbox;
	//By emailTextbox=By.xpath("//input[@class='textfield email required input_authentication email-suggest']");
	
	@FindBy(xpath="//div[@id='signup-module']//div//input[2]")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//a[normalize-space()='Show Password']")
	WebElement showPasswordLink;
	
	@FindBy(xpath="//a[normalize-space()='Hide Password']")
	WebElement hidePasswordLink;
	
	@FindBy(xpath="//input[@value='Sign Up']")
	WebElement signUp;
	
	@FindBy(xpath="//label[@for='spree_user_email']")
	WebElement emailError;
	
	@FindBy(xpath="//label[@for='spree_user_password']")
	WebElement passwordError;
	
	@FindBy(xpath="//a[@class='login-link link-color']")
	WebElement loginLink;
	
	@FindBy(xpath="//a[@class='signup-link link-color']")
	WebElement signupBack;
	
	@FindBy(xpath="//a[@id='facebook_login']")
	WebElement connectToFacebook;
	
	@FindBy(xpath="//a[@id='google_login']")
	WebElement connectToGoogle;
	
//	@FindBy(xpath="//a[@id='logout']")
//	WebElement logout;
	
	public void enterEmailIdOnTextbox(String email) {
		textbox.click();
		textbox.clear();
		textbox.sendKeys(email);
	}

	public void enterPasswordOnTextbox(String password) {
		passwordTextbox.click();
		passwordTextbox.clear();
		passwordTextbox.sendKeys(password);
	}
	
	public void verifyShowAndHidePasswordlink() {
		showPasswordLink.click();
		hidePasswordLink.click();
	}
	
	public void clickOnSignUpButton() {
		signUp.click();
	}
	
	public String getEmailErrorMessage() {
		return emailError.getText();
	}
	
	public String getPasswordErrorMessage() {
		return passwordError.getText();
		
	}
	public void clickOnLoginink() {
		loginLink.click();
				
		signupBack.click();
	}
	
	public void clickOnConnectToFacebookLink() {
		connectToFacebook.click();
	}
	public void clickOnConnectToGoogleLink() {
		connectToGoogle.click();
	}
	public void executeSignupFlow(String email, String password) {
		enterEmailIdOnTextbox(email);
		enterPasswordOnTextbox(password);
		verifyShowAndHidePasswordlink();
		clickOnSignUpButton();
	}
	
//	public boolean verifyLogo() {
//		return logo.isDisplayed();
//	}
}
