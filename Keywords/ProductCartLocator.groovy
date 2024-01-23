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

public class ProductCartLocator {
	def TestObject useremail() {
		return findTestObject("Object Repository/ProductCart_ObjectRepository/input_userEmail")
	}

	def TestObject password() {
		return findTestObject("Object Repository/ProductCart_ObjectRepository/input_userPassword")
	}

	def TestObject login() {
		return findTestObject("Object Repository/ProductCart_ObjectRepository/input_login")
	}

	def TestObject firstProduct() {
		return findTestObject("Object Repository/ProductCart_ObjectRepository/button_firstProduct")
	}

	def TestObject cartMenu() {
		return findTestObject("Object Repository/ProductCart_ObjectRepository/button_cartMenu")
	}

	def TestObject productName() {
		return findTestObject("Object Repository/ProductCart_ObjectRepository/txt_productNameValidation")
	}
}
