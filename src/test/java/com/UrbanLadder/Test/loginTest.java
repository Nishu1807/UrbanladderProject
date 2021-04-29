package com.UrbanLadder.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.UrbanLadder.MainBase.Constants;
import com.UrbanLadder.MainBase.MainBaseClass;
import com.UrbanLadder.pages.LoginPage;


@Listeners(com.UrbanLadder.CustomeUtils.Listeners.class)
public class loginTest extends MainBaseClass {
	
     LoginPage page; 
     
	public loginTest() {
		super();
	}
     @Test(priority=0)
	//@BeforeMethod
	public void setUp() {
		openBrowser();
		openUrl();
		page = new LoginPage();
	}
	@Test(priority=1)
	public void VarifyLogIn() throws InterruptedException {
	page.CloseTab();
    page.clickOnLoginButton();
   // page.EnterEmailAndPassword();
    }
	
	@Test(priority=2)
       public void LoginDetails() {
		 page.EnterEmailAndPassword();
	}
	
}