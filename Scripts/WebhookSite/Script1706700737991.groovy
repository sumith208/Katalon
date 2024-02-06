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
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser("")
WebUI.navigateToUrl("https://webhook.site/")
WebUI.click(findTestObject('Object Repository/WebhookSite_ObjectRepository/more_dropdownOption'))
WebUI.click(findTestObject('Object Repository/WebhookSite_ObjectRepository/option_deleteAllRequest'))
WebUI.acceptAlert()
String url12 = WebUI.getText(findTestObject('Object Repository/WebhookSite_ObjectRepository/url_wh'))
System.out.println(" :::::: "+url12)
WebUI.navigateToUrl(url12)
WebUI.navigateToUrl("https://webhook.site/")
WebUI.delay(2)
boolean bool = WebUI.verifyElementVisible(findTestObject('Object Repository/WebhookSite_ObjectRepository/recentNotification'))
System.out.println(" :::::: "+bool)
WebUI.closeBrowser()



//RequestObject  request = findTestObject("Object Repository/APIRepository/fourth")
////request.setHttpHeaderProperties("POST")
////request.setRestUrl("https://webhook.site/279e3dda-59c2-4879-96a2-cbcfe51bf4aa")
////request.setHttpBody(requestBody)
//def response = WS.sendRequest(request)
//System.out.println(response.responseText())


