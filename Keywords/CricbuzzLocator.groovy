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

public class CricbuzzLocator {

	public  TestObject scheduleTab() {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/scheduleTab")
	}

	public  TestObject MatchesTab() {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/MatchesTab")
	}

	public  TestObject linkRecent() {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/linkRecent")
	}
	public  TestObject formatName() {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/formatName")
	}

	public  TestObject firstMatch() {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/firstMatch")
	}

	public  TestObject playerName() {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/playerName")
	}

	public  TestObject playerRole() {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/playerRole")
	}

	public  TestObject playerAverage(String formate1) {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/playerAverage",[frm:formate1])
	}


	public  TestObject scoreCardLink() {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/scoreCardLink")
	}

	public  TestObject playerEconomy(String formate1) {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/playerEconomy",[frm:formate1])
	}

	public TestObject teamAA(int number1) {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/teamA",[id:number1])
	}

	public TestObject teamBB(int number1) {
		return findTestObject("Object Repository/Cricbuzz_ObjectRepository/teamB",[id:number1])
	}
}
