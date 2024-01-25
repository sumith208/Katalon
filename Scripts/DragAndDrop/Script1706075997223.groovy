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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebElement as Keys

WebUI.openBrowser("https://practice.expandtesting.com/")
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/DragAndDrop_ObjectRepository/boxDragAndDrop'))

//TestObject src = findTestObject('Object Repository/DragAndDrop_ObjectRepository/boxA')
//TestObject dest = findTestObject('Object Repository/DragAndDrop_ObjectRepository/boxB')
WebElement src1=WebUI.findWebElement(findTestObject('Object Repository/DragAndDrop_ObjectRepository/boxA'),2)
WebElement dst1=WebUI.findWebElement(findTestObject('Object Repository/DragAndDrop_ObjectRepository/boxB'),2)
//
//WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop_ObjectRepository/boxA'), findTestObject('Object Repository/DragAndDrop_ObjectRepository/boxB'))
//WebUI.delay(2)
//
//WebUI.dragAndDropToObject(src, dest)


WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop_ObjectRepository/circleOption'), findTestObject('Object Repository/DragAndDrop_ObjectRepository/squireTarget'))
WebUI.delay(2)
WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop_ObjectRepository/circleOption'), findTestObject('Object Repository/DragAndDrop_ObjectRepository/squireTarget'))
WebUI.delay(2)
WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop_ObjectRepository/circleOption'), findTestObject('Object Repository/DragAndDrop_ObjectRepository/squireTarget'))
