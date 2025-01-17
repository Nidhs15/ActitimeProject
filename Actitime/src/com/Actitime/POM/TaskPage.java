package com.Actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	@FindBy (xpath="//div[.='Add New']")
	private WebElement addbtn;
	
	@FindBy (xpath="//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy (xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement creatcustbtn;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	public TaskPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}

	public WebElement getCreatcustbtn() {
		return creatcustbtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
     
}
