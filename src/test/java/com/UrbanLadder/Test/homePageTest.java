package com.UrbanLadder.Test;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.UrbanLadder.MainBase.Constants;
import com.UrbanLadder.MainBase.MainBaseClass;
import com.UrbanLadder.pages.HomePage;


public class homePageTest extends MainBaseClass {

	HomePage page=PageFactory.initElements(Constants.driver,HomePage.class);
	public homePageTest(){
		super();
	}
	
	@BeforeClass
	public void setup() {
		page.openBrowser();
		page.openUrl();
		
		
		
	}
	@Test
	public void verifyHomepage()  {
		page.closeloginpage();
		page.getTitle();
		page.verifyLogo();
		page.isSearchTextBoxDisplay();
		
	}
	
	@Test
	public void verifyAllLinksOnHomePage() {
		page.isHelpLinkDiplay();
		page.isSearchTextBoxDisplay();
		page.istrackOrderLinkDisplay();
		page.isBulkOrderLinkDisplay();
		page.isGiftCardsLinkDisplay();
		page.isStoresLinkDisplay();
	}
	
	@Test
	public void totalNoOfLinks() {
		page.countOfAllLinks();
	}
	
	
}
