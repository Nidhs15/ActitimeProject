package com.Actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	@FindBy (id="username")
	private WebElement untx;
	
	@FindBy(name="pwd")
	private WebElement pwtx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement chbx;
	
    public LogInPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getUntx() {
		return untx;
	}

	public WebElement getPwtx() {
		return pwtx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	public WebElement getChbx() {
		return chbx;
	}
}

