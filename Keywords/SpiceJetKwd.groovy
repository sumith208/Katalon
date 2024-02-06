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
		WebUI.click(locator.roundtripOption())
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
		WebUI.click(locator.input_firstAndMidleName(1))
		WebUI.setText(locator.input_firstAndMidleName(1),"LAKKAPPA")

		WebUI.click(locator.input_lastName(1))
		WebUI.setText(locator.input_lastName(1),"Basidoni")

		WebUI.click(locator.input_contactNumber(1))
		WebUI.setText(locator.input_contactNumber(1),"8889898823")

		WebUI.click(locator.input_Email())
		WebUI.setText(locator.input_Email(),"abc@gmail.com")


		WebUI.click(locator.input_firstAndMidleName(2))
		WebUI.setText(locator.input_firstAndMidleName(2),"LAKKAPPA")

		WebUI.click(locator.input_lastName(2))
		WebUI.setText(locator.input_lastName(2),"Basidoni")

		WebUI.click(locator.input_contactNumber(2))
		WebUI.setText(locator.input_contactNumber(2),"8889898823")



		//id card
		WebUI.click(locator.input_idCard())
		WebUI.setText(locator.input_idCard(),"123456")

		WebUI.click(locator.buttonContinue())
		WebUI.click(locator.buttonContinue2())
	}

	@Keyword
	def seatbook() {
		WebUI.click(locator.selectNOW())
		WebUI.click(locator.A1seat())
		WebUI.click(locator.privateRow())
		WebUI.click(locator.popupCheckbox())
		WebUI.click(locator.bookSeatconfirmedContinue())

		WebUI.click(locator.selectMeals())
		def i=1
		while(true) {
			if(WebUI.verifyElementVisible(locator.selectFirstMeal(i),FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.click(locator.selectFirstMeal(i))
				break;
			}else {
				i++
			}
		}

		WebUI.click(locator.selectMealsDoneButton())

		WebUI.click(locator.buttonContinue2())
	}
}
