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

public class SpiceJetKwd {
	SpiceJet_Locator locator = new SpiceJet_Locator()
	
	@Keyword
	public void open() {
		WebUI.openBrowser("https://www.spicejet.com/")
		WebUI.maximizeWindow()
	}
	
	@Keyword
	public void searchFlite() {
		WebUI.click(locator.radioButton_roundTrip())
		WebUI.click(locator.from())
		WebUI.click(locator.from_place())
		WebUI.click(locator.destination_place())
		WebUI.click(locator.start_date())
		WebUI.click(locator.return_date())
		WebUI.click(locator.radioButton_student())
		WebUI.delay(3)
		WebUI.click(locator.searchFlite())
		
	}
	
	@Keyword
	public void discount() {
		
		WebUI.click(locator.popupCheckbox())
		WebUI.click(locator.popupContinueButton())
		WebUI.click(locator.buttonContinue())
	}
	
	@Keyword
	public void userInformation() {
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
	}
	
	@Keyword
	def seatbook() {
		WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/selectNOW'))
		WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/A1seat'))
		WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/privateRow'))
		WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/popupCheckbox'))
		WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/bookSeatconfirmedContinue'))
		
		WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/selectMeals'))
		def i=1
		while(true) {
			if(WebUI.verifyElementVisible(findTestObject('Object Repository/SpiceJet_ObjectRepository/selectFirstMeal',[id:i]),FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/selectFirstMeal',[id:i]))
				break;
				
			}else {
				i++
			}
			
		}
		
		WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/selectMealsDoneButton'))
		
		WebUI.click(findTestObject('Object Repository/SpiceJet_ObjectRepository/buttonContinue2'))
		
	}
	
	
}
