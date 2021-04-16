package com.UrbanLadder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.UrbanLadder.MainBase.Constants;

public class SignupPage {
	
//	@FindBy(xpath="//input[@class='textfield email required input_authentication email-suggest']")
//	WebElement textbox;
	By emailTextbox=By.xpath("//input[@class='textfield email required input_authentication email-suggest']");
		
	By passwordTextbox=By.xpath("//div[@class='password']//input[2]");
	
	By showPasswordLink=By.xpath("//a[normalize-space()='Show Password']");
	
	By hidePasswordLink=By.xpath("//a[normalize-space()='Hide Password']");
	
	By signUp=By.xpath("//input[@value='Sign Up']");
	
	By login=By.cssSelector("a[class='login-link link-color']");
	By signupBack=By.xpath("//a[@class='signup-link link-color']");
	
	public void enterEmailIdOnTextbox(String email) {
		Constants.driver.findElement(emailTextbox).click();
		Constants.driver.findElement(emailTextbox).clear();
		Constants.driver.findElement(emailTextbox).sendKeys(email);
//		textbox.click();
//		textbox.clear();
//		textbox.sendKeys(email);
	}

	public void enterPasswordOnTextbox(String password) {
		Constants.driver.findElement(passwordTextbox).click();
		Constants.driver.findElement(passwordTextbox).clear();
		Constants.driver.findElement(passwordTextbox).sendKeys(password);
	}
	
	public void verifyShowAndHidePasswordlink() {
		Constants.driver.findElement(showPasswordLink).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Constants.driver.findElement(hidePasswordLink).click();
	}
	
	public void clickOnSignUpButton() {
		Constants.driver.findElement(signUp).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnLoginink() {
		Constants.driver.findElement(login).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Constants.driver.findElement(signupBack).click();
	}
}
