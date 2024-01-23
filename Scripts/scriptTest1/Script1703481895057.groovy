import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

TestObject name = findTestObject("Object Repository/scriptTest1Objects/userEmail")

public WebElemnt addButton() {
	return By.findElement(By.ByXPath(""))
}

WebUI.openBrowser("")
WebUI.navigateToUrl("https://rahulshettyacademy.com/loginpagePractise/")
WebUI.setText(name, "rahulshettyacademy")
WebUI.click(addButton())
WebUI.setText(findTestObject("Object Repository/scriptTest1Objects/userPassword"), "learning")
//WebUI.click(findTestObject("Object Repository/scriptTest1Objects/loginBtn"))
//  WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'), 'Make Appointment', FailureHandling.STOP_ON_FAILURE)
WebUI.closeBrowser()
WebUI.enhancedClick(findTestObject)
WebUI.findWebElements(findTestObject, 0)