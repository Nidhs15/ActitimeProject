package com.Actitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.GenericLibrary.ListenerImplementation;
import com.Actitime.POM.HomePage;
import com.Actitime.POM.TaskPage;
@Listeners(ListenerImplementation.class)
public class CreateCustomer extends BaseClass{
	FileLibrary f= new FileLibrary();
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
	HomePage hp= new HomePage(driver);
	hp.getTaskelmnt().click();
	TaskPage tp = new TaskPage(driver);
	tp.getAddbtn().click();
	tp.getNewcust().click();
	String name = f.readDataFromExcelFile("StudentsData", 1, 1);
	tp.getCustname().sendKeys(name);
	String desc = f.readDataFromExcelFile("StudentsData", 1, 2);
	tp.getCustdesc().sendKeys(desc);
	tp.getCreatcustbtn().click();
	String ExpectedResult = name;
	String ActualResult = driver.findElement(By.xpath("(//div[.='"+name+"'])[2]")).getText();
	SoftAssert s= new SoftAssert();
	s.assertEquals(ExpectedResult, ActualResult);
	Reporter.log("test script passed successfully", true);
	s.assertAll();
	
}
}