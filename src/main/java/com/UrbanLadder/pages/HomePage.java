package com.UrbanLadder.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.UrbanLadder.MainBase.Constants;
import com.UrbanLadder.MainBase.MainBaseClass;

/**
 * This page contains all WebElements path which present on home page.
 * It verifies the different links are displayed on page or not.
 * It givers total  number of links present on the page.
 * @author ashwi
 *
 */
public class HomePage extends MainBaseClass{
	
	
By logo=By.className("logo-text");

By close=By.xpath("//a[contains(text(),'Close')]");

By searchbar=By.id("search");

@FindBy(xpath="search-icon icofont-search")
WebElement searchicon;

By help=By.xpath("//a[normalize-space()='Help']");

By order=By.xpath("//a[normalize-space()='Track Order']");

By stores=By.cssSelector("a[href='../../furniture-stores?src=header']");

By bulkOrder=By.xpath("//a[normalize-space()='Bulk Orders']");

By giftcards=By.xpath("//a[contains(text(),'Gift Cards')]");

By trackorderlogo=By.xpath("//a[@title='Track Order']");

By loginlogo=By.xpath("//span[@class='header-icon-link user-profile-icon']");

By shortlistlogo=By.cssSelector("div#shortlist-badge");

By cartbadgelogo=By.cssSelector("div#cart-badge");

public boolean verifyLogo(){
	
	Constants.driver.findElement(logo).isDisplayed();
	System.out.println("Urban Ladder logo is verified");
	return true;
}
 public void getTitle() {
	System.out.println( Constants.driver.getTitle());
 }

public void isSearchTextBoxDisplay() {
	if(Constants.driver.findElement(By.xpath("//input[@id='search']")).isDisplayed()) {
		System.out.println("Search bar is displayed");
	}else {
		System.out.println("Search bar is not displayed");
	}
}
public void closeloginpage() {
	Constants.driver.findElement(close).click();
}
public void verifysearchbox()  {
	
	Constants.driver.findElement(searchbar).sendKeys("Living");
	Constants.driver.findElement(searchbar).click();
	
}
public void clickOnSearchIcon() {
	searchicon.click();
}

public void isHelpLinkDiplay() {
	
	
	if(Constants.driver.findElement(help).isDisplayed()) {
		System.out.println("Help link diplay on page");
	}else {
		System.out.println("Help link is not displayed");
	}
}

public void istrackOrderLinkDisplay() {
	if(Constants.driver.findElement(order).isDisplayed()) {
		System.out.println("Order Link display on page");
	}else {
		System.out.println("Order Link is not display on page");
	}
}

public void isStoresLinkDisplay() {
	if(Constants.driver.findElement(stores).isDisplayed()) {
		System.out.println("Store Link display on page");
	}else {
		System.out.println("Store Link is not display on page");
	}
}

public void isBulkOrderLinkDisplay() {
	if(Constants.driver.findElement(bulkOrder).isDisplayed()) {
		System.out.println("BulkOrder Link display on page");
	}else {
		System.out.println("BulkOrder Link is not display on page");
	}
}

public void isGiftCardsLinkDisplay() {
	if(Constants.driver.findElement(giftcards).isDisplayed()) {
		System.out.println("Order Link display on page");
	}else {
		System.out.println("Order Link is not display on page");
	}
}
public boolean verifyLoginLogo() {
	
	Constants.driver.findElement(loginlogo).isDisplayed();
	return true;
}

public boolean verifyTrackOrderLogo() {
	
	Constants.driver.findElement(trackorderlogo).isDisplayed();
	return true;
}
public boolean verifyShortListLogo() {
	
	Constants.driver.findElement(shortlistlogo).isDisplayed();
	return true;
}

public boolean verifyCartBadgeLogo() {
	
	Constants.driver.findElement(shortlistlogo).isDisplayed();
	return true;
}

//Following method counts no of  links present on home page. 

public void countOfAllLinks() {
List<WebElement> list=Constants.driver.findElements(By.tagName("a"));
int size=list.size();
System.out.println(size);

for(int i=1;i<size;i++) {
	WebElement a=list.get(i);
	String alllinks=a.getText();
	//System.out.println(alllinks);//this page have  444 links.
}
}
}
