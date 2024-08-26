package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Nidhi Singh
 * This class is a generic class used to read data from property ,excel file
 */
public class FileLibrary {
	/**
	 * This method is a generic method used to read data from property file 
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String Key) throws IOException {
	FileInputStream fis= new FileInputStream("./TestData/commondata2.property");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(Key);
	return data;
	
}
	/**
	 * This method is a generic method used to read data from excel File
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcelFile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
}