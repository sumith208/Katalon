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

public class DataFileClass {
	TestData data = findTestObject("Data Files/InternalDataFile")
	HashMap<String, String> hash = new HashMap<>()
	
	
	def getUserEmail(String refName) {
		int row=0;
		
		if(data.getColumnNames().contains("USEREMAIL")
			) {
			for(int i=1; i<data.getRowNumbers();i++) {
				row++
				if(data.getValue("UniqueId", i) == refName) {
					break;
				}
			}
			return data.getValue("USEREMAIL", row)
			
		}else {
			println("Column not found...........")
		}
	}

	def hashCreate() {
		hash.put("USEREMAIL", data.getValue("USEREMAIL", 1))
		hash.put("PASSWORD", data.getValue("PASSWORD", 1))
	}
}
