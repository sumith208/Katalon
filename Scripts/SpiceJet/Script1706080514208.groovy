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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser("https://www.spicejet.com/")
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/radioButton_roundTrip'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/from'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/from_place'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/destination_place'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/start_date'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/return_date'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/radioButton_student'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/searchFlite'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/popupCheckbox'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/popupContinueButton'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/buttonContinue'))


//WebUI.waitForElementVisible(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_firstAndMidleName'), 30)
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_firstAndMidleName',[id:1]))
WebUI.setText(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_firstAndMidleName',[id:1]),"LAKKAPPA")

WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_lastName',[id:1]))
WebUI.setText(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_lastName',[id:1]),"Basidoni")

WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_contactNumber',[id:1]))
WebUI.setText(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_contactNumber',[id:1]),"8889898823")

WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_Email'))
WebUI.setText(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_Email'),"abc@gmail.com")


WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_firstAndMidleName',[id:2]))
WebUI.setText(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_firstAndMidleName',[id:2]),"LAKKAPPA")

WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_lastName',[id:2]))
WebUI.setText(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_lastName',[id:2]),"Basidoni")

WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_contactNumber',[id:2]))
WebUI.setText(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_contactNumber',[id:2]),"8889898823")



//id card
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_idCard'))
WebUI.setText(findTestObject('Object Repository/SpiceJet_ObjectRepository/input_idCard'),"123456")

WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/buttonContinue'))
WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/buttonContinue2'))