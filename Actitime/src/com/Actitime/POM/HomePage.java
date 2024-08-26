package com.Actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="//div[.='Tasks']")
	private WebElement taskelmnt;
	
	@FindBy (xpath="//div[.='Time-Track']")
	private WebElement timetrkelmnt;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportselmnt;
	
	@FindBy (xpath="//div[.='Users']")
	private WebElement usrelmnt;
	
	@FindBy (id="logoutLink")
	private WebElement logutelmnt;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskelmnt() {
		return taskelmnt;
	}

	public WebElement getTimetrkelmnt() {
		return timetrkelmnt;
	}

	public WebElement getReportselmnt() {
		return reportselmnt;
	}

	public WebElement getUsrelmnt() {
		return usrelmnt;
	}

	public WebElement getLogutelmnt() {
		return logutelmnt;
	}

}
