import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SpiceJet_Locator {
	
	public TestObject radioButton_roundTrip() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/radioButton_roundTrip')
	}
	
	public TestObject from() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/from')
	}
	
	public TestObject from_place() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/from_place')
	}
	
	public TestObject destination_place() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/destination_place')
	}
	
	public TestObject start_date() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/start_date')
	}
	
	public TestObject return_date() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/return_date')
	}
	
	public TestObject radioButton_student() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/radioButton_student')
	}
	
	public TestObject searchFlite() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/searchFlite')
	}
	
	
	
	public TestObject popupCheckbox() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/popupCheckbox')
	}
	
	public TestObject popupContinueButton() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/popupContinueButton')
	}
	
	public TestObject buttonContinue() {
		return findTestObject('Object Repository/SpiceJet_ObjectRepository/buttonContinue')
	}
}
