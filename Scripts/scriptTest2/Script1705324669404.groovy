import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

//import org.apache.poi.ss.usermodel.Workbook
//import org.openqa.selenium.By as By
//import org.openqa.selenium.Keys as Keys
//
//@Grab(group='org.apache.poi', module='poi', version='4.1.2')
//@Grab(group='org.apache.poi', module='poi-ooxml', version='4.1.2')
//
//import org.apache.poi.ss.usermodel.*
//import org.apache.poi.xssf.usermodel.XSSFWorkbook


//def filePath = "D:\\Book1.xlsx"
//def sheetName = 'Sheet1'
//
//def readExcelData() {
//	FileInputStream file = new FileInputStream(filePath)
//	Workbook workbook = new XSSFWorkbook(file)
//	Sheet sheet = workbook.getSheet(sheetName)
//	println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
//	println(sheet[1][1])
//
//	for (Row row : sheet) {
//		for (Cell cell : row) {
//			def cellValue = cell.toString()
//			println("Cell Value: $cellValue")
//		}
//	}
//
//	workbook.close()
//	file.close()
//	
//}
//
//readExcelData()

//TestData data = findTestData("Data Files/InternalDataFile")
//def user_email = data.getValue(1, 1)
//println(user_email)
//
//String[] ar = data.getColumnNames()
//for(def a : ar) {
//	println(a)
//}
//List<List<Object>> dd =data.getAllData()
//println(dd)

//WebDriver driver = new ChromeDriver();
String baseUrl = "https://www.katalon.com/";
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com");
WebUI.openBrowser("https://www.katalon.com/");
driver.findElement(By.id("btn-make-appointment")).click();
driver.findElement(By.id("txt-username")).clear();
driver.findElement(By.id("txt-username")).sendKeys("John Doe");
driver.findElement(By.id("txt-password")).clear();
driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
driver.findElement(By.id("btn-login")).click();
driver.quit();

WebUI.sendKeys(Keys.ENTER)
//WebUI.waitForElementVisible(findTestObject, 0, FailureHandling.STOP_ON_FAILURE)
WebUI.acceptAlert()
 
