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
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def verifyLogsInDebugConsole(String flowName) {
	for (int rowNo=1; rowNo<=row.getRowNumbers(); rowNo++) {
		if (row.getValue(flowNames,rowNo).equalsIgnoreCase(flowName)) {
			RequestObject request = locator.serviceWebhookAPI()
			request.setRestRequestMethod(data.getWebhookAPIMethod(rowNo))
			request.setRestUrl(GlobalVariable.WEBHOOK_URL)
			request.setHttpBody(data.getSampleJsonData(rowNo))
			def response = WS.sendRequest(request)
			if (WS.getResponseStatusCode(response).toString()==data.getStatusCode(rowNo)) {
				KeywordUtil.markPassed("Wenhook API verified successfully: "+WS.getResponseStatusCode(response))
			} else {
				KeywordUtil.markFailed("Webhook API verification failed & Status code: "+WS.getResponseStatusCode(response))
			}
			def jsonSlurper = new JsonSlurper()
			def jsonResponse = jsonSlurper.parseText(response.getResponseText())
			println("API Response body is: "+jsonResponse)
			String transactionId = jsonResponse.response.transid
			String regex = "\\[|\\]";
			String transId = transactionId.replaceAll(regex, "")
			GlobalVariable.TRANSID = transId
			WebUI.click(locator.serviceButtonDebugFlow())
			debugLogs(transId)
			for (int i=0; i<3; i++) {
				WebElement trasaction = WebUI.findWebElement(locator.serviceDebugPayload(),GlobalVariable.MIDWAIT)
				if (trasaction.isDisplayed() == false) {
					WebUI.click(locator.serviceDebugButtonClose())
					debugLogs(transId)
				} else if (WebUI.getText(locator.serviceDebugPayload()).contains(data.getAPIBody(rowNo))) {
					WebUI.waitForElementPresent(locator.serviceDebugPayload(), 60)
					KeywordUtil.markPassed("Payload verification Passed under DebugLogs: "+WebUI.getText(locator.serviceDebugPayload()))
				} else {
					KeywordUtil.markFailed("Payload verification Failed under DebugLogs:  "+WebUI.getText(locator.serviceDebugPayload()))
				}
			}
			WebUI.click(locator.serviceFlowViewBackButton())
		}
	}
}