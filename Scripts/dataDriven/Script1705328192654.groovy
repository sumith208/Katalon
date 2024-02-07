import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.google.common.collect.Table.Cell
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys as Keys

//TestData data = findTestData("Data Files/testDataFile")
//println("value"+data.getValue(1, 1))
//
//
//TestData internaldata = findTestData(GlobalVariable.dataFiles)
//println("value hdshh"+internaldata.getValue(1, 1))
//println(internaldata.getValue("USEREMAIL", 1))
//println(internaldata.getValue("USEREMAIL", 2))
//
//HashMap<String, ArrayList<String>> hash = new HashMap<>()
//String[] columnName = internaldata.getColumnNames()
////for(String ss : columnName) {
////}
//println(internaldata.getAllData())
//// https://reqres.in/ ::: API url
//DataFileClass obj = new DataFileClass()
//println(obj.getUserEmail("one"))
//println(obj.getUserEmail("two"))
//println(obj.getUserEmail("three"))

NewClass obj = new NewClass()
//HashMap hash = obj.getDatFileVAlue("one")
//println(hash.get("PASSWORD"))
//println(hash.get("USEREMAIL"))
//println(hash)
String value = obj.getExportdata("Technology","Customer Segment")
KeywordUtil.logInfo("Value :"+value)

//        FileInputStream file = new FileInputStream("C:\\Users\\Lakkappa Y\\git\\Katalon\\Resources\\ExcelDataFile.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		Sheet sheet = workbook.getSheet("Orders");
//		
//		Iterator<Row> rowIterator = sheet.iterator();
//		while (rowIterator.hasNext()) {
//		    Row row = rowIterator.next();
//		    Iterator<Cell> cellIterator = row.iterator();
//		    while (cellIterator.hasNext()) {
//		        Cell cell = cellIterator.next();
//		        DataFormatter dataFormatter = new DataFormatter();
//		        String cellValue = dataFormatter.formatCellValue(cell)
//				
//		        System.out.println(cellValue);
//		        
//		    }
//		}
		