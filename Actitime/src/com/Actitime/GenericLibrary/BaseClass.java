package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Actitime.POM.HomePage;
import com.Actitime.POM.LogInPage;

public class BaseClass {
	public static WebDriver driver;
	FileLibrary f=new FileLibrary();
	
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("DB Connected",true);
	}
	@BeforeTest
	public void launchBrowser() throws IOException {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL = f.readDataFromPropertyFile("url");
		driver.get(URL);
		Reporter.log("Browser Launched");
	}
	@BeforeMethod
	public void login() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String UN = f.readDataFromPropertyFile("username");
		LogInPage lp= new LogInPage(driver);
		lp.getUntx().sendKeys(UN);	
		String PW=f.readDataFromPropertyFile("password");
		lp.getPwtx().sendKeys(PW);
		lp.getLgbtn().click();
		Reporter.log("Logged In",true);
	}
	@AfterMethod
	public void logout() {
		HomePage hp= new HomePage(driver);
		hp.getLogutelmnt().click();
		Reporter.log("Logged Out",true);
		
	}
   @AfterTest
   public void closeBrowser() {
	   driver.close();
	   Reporter.log("Browser Closed",true);
   }
   @AfterSuite
   public void databaseDisconnected() {
	   Reporter.log("DataBase Disconnected",true);
   }
   
}
