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
import org.openqa.selenium.Keys

import java.awt.Robot
import java.awt.event.KeyEvent


public class FlipkartKwd {
	FlipkartLocator  locator = new FlipkartLocator()
	Robot robot = new Robot()

	def openPage() {
		WebUI.openBrowser("https://www.flipkart.com/")
		WebUI.maximizeWindow()
	}

	def cartProduct(String product) {
		WebUI.click(locator.searchBar())
		WebUI.setText(locator.searchBar(), product)
		//WebUI.sendKeys(null,  Keys.ENTER)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		
		//WebUI.sendKeys(Keys.ENTER)
		
		WebUI.click(locator.selectFirstOne())
//		WebUI.click(locator.addToCart())
//		println(WebUI.getText(locator.cartProductName()))
	}
	
	def getPrice() {
	 WebUI.switchToWindowIndex(1)
	 String price = WebUI.getText(locator.Price())
	 println(price)
	}
	
	def close() {
		WebUI.closeBrowser()
	}
}
