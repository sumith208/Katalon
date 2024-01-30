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

public class FlipkartLocator {

	public TestObject addToCart() {
		return findTestObject("Object Repository/Flipkart_ObjectReository/buttonAddToCart")
	}

	public TestObject searchBar() {
		return findTestObject("Object Repository/Flipkart_ObjectReository/inputSearchBar")
	}

	public TestObject selectFirstOne() {
		return findTestObject("Object Repository/Flipkart_ObjectReository/selectFirstProduct")
	}

	public TestObject cartProductName() {
		return findTestObject("Object Repository/Flipkart_ObjectReository/txtCartProductName")
	}
	
	public TestObject Price() {
		return findTestObject("Object Repository/Flipkart_ObjectReository/txtPrice")
	}
	
}
