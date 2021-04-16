package com.UrbanLadder.MainBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainBaseClass {
//	public static WebDriver driver;
//	public static Properties prop;

	public MainBaseClass() {
		
	}
	static {
		try {
			Constants.prop=new Properties();
			FileInputStream fis=new FileInputStream("src\\main\\resources\\config.properties");
			Constants.prop.load(fis);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void openBrowser(String browserName) {

		switch (browserName) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
			break;

		case "IE":
			WebDriverManager.iedriver().setup();
			Constants.driver = new InternetExplorerDriver();
			break;

		case "HtmlUnit":
			Constants.driver = new HtmlUnitDriver();
			break;

		default: System.err.println("Unable to open browser"+ "provide correct browser name");
		}

		Constants.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


	}	  

	public static void maximize() {
		Constants.driver.manage().window().maximize();

	}

	public static void implicitWait(int duration) {
		Constants.driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

	public static  void deleteAllCookies() {
		Constants.driver.manage().deleteAllCookies();
	}
	
	

	public static void tearDown() {
		Constants.driver.close();
	}	
	public static void explicitWait(int duration) {
		FluentWait	wait=new FluentWait(Constants.driver);
		wait.withTimeout(duration, TimeUnit.SECONDS);
	}


	public static  void openUrl(String url) {

		Constants.driver.get(url);
	}


	
	
}
