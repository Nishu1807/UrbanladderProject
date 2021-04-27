package com.UrbanLadder.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UrbanLadder.MainBase.mainBaseClass;

public class LoginPage extends mainBaseClass {

	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	
	
}

By closeTab=By.xpath("//a[@class='close-reveal-modal hide-mobile']");	
By loginlogo=By.xpath("//span[@class='header-icon-link user-profile-icon']");
//By logIn=By.xpath("//a[@class='login-link authentication_popup']");
By logIn=By.xpath("//ul[@class='dropdown']//a[@class='login-link authentication_popup']");
By EmailId=By.xpath("//input[@placeholder='Email Address']");
By password=By.xpath("//input[@class='required input_authentication']");
By LogInButton=By.id("ul_site_login");

/*@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
WebElement loginLoGo;
@FindBy(xpath="//ul[@class='dropdown']//a[@class='login-link authentication_popup']")
WebElement LogIn;
@FindBy(xpath="//input[@id='spree_user_email']")
WebElement emailId;
@FindBy(xpath="//input[@class='required input_authentication']")
WebElement password;
@FindBy(xpath="//input[@class='button primary']")
WebElement loginButton;*/

public void CloseTab() {
	driver.findElement(closeTab);
}


public void clickOnLoginButton() throws InterruptedException {
Actions action=new Actions(driver);
action.moveToElement(driver.findElement(loginlogo)).build().perform();
driver.findElement(logIn).click();
Thread.sleep(3000);
}  

public void EnterEmailAndPassword() {	
//emailId.sendKeys("a.m.sonale1336@gmail.com");
driver.findElement(EmailId).click();
driver.findElement(EmailId).sendKeys("urbanladder01@gmail.com");
driver.findElement(password).sendKeys("urbantest123");
driver.findElement(LogInButton).click();
}  
}   
 