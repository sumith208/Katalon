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

public class CricbuzzKwd {

	CricbuzzLocator locator = new CricbuzzLocator()

	HashMap<String, String> batsman
	HashMap<String, String> bowler
	HashMap<String, String> wicketkeeper
	HashMap<String, String> allrounder
	ArrayList<String> playing11

	String Cricketformat

	public CricbuzzKwd() {

		batsman = new HashMap<String, String>()
		bowler = new HashMap<String, String>()
		wicketkeeper = new HashMap<String, String>()
		allrounder = new HashMap<String, String>()
		playing11 = new ArrayList<String>()
	}

	def open() {
		WebUI.openBrowser("https://www.cricbuzz.com/")
	}

	def navigateToScoreCard() {
		WebUI.click(locator.scheduleTab())
		WebUI.click(locator.MatchesTab())
		WebUI.click(locator.linkRecent())
		WebUI.click(locator.firstMatch())
		WebUI.click(locator.scoreCardLink())
		Cricketformat = WebUI.getText(locator.formatName())
		println("**==**** "+Cricketformat+" *****==**")
	}

	def playerInformationCollect(String teamName) {
		
		String frm = null;
		if(Cricketformat.contains("Test")) {
			frm = "Test"
		}else if(Cricketformat.contains("T20I")){
			frm = "T20I"
		}else if(Cricketformat.contains("ODI")){
			frm = "ODI"
		}
		
		println("frm  ::"+frm)
		for(int i=1; i<=11;i++) {

			if(teamName == "teamA") {
				WebUI.scrollToElement(locator.teamAA(i), 20)
				WebUI.click(locator.teamAA(i))
			}else {
				WebUI.scrollToElement(locator.teamBB(i), 20)
				WebUI.click(locator.teamBB(i))
			}
			String name = WebUI.getText(locator.playerName())
			println(i+" :: "+name)

			WebUI.scrollToElement(locator.playerRole(), 20)
			String role = WebUI.getText(locator.playerRole())
			String average

			switch(role) {
				case "Batsman"    : if(WebUI.verifyElementVisible(locator.playerAverage(frm))) {
					average = (String)WebUI.getText(locator.playerAverage(frm))
					batsman.put(name,average)
				}
					break;

				case "WK-Batsman" :  if(WebUI.verifyElementVisible(locator.playerAverage(frm))) {
					average = (String)WebUI.getText(locator.playerAverage(frm))
					wicketkeeper.put(name,average)
				}
					break;

				case "Bowler"     :  if(WebUI.verifyElementVisible(locator.playerEconomy(frm))) {
					String economy = (String)WebUI.getText(locator.playerEconomy(frm))
					bowler.put(name,economy)
				}
					break;

				default 		  : if(WebUI.verifyElementVisible(locator.playerAverage(frm))) {
					average = (String)WebUI.getText(locator.playerAverage(frm))
					allrounder.put(name,average)
				}
			}
			WebUI.back()
			//WebUI.delay(2)
		}
	}

	def printPlayerInformation() {
		// Information
		println("batsman       ::"+batsman)
		println("wicketkeeper  ::"+wicketkeeper)
		println("bowler        ::"+bowler)
		println("allrounder    ::"+allrounder)
	}

	def chooseBatsman(int playerCount) {
		for(int i=0; i<playerCount; i++) {
			int max =0;
			String actName
			for (Map.Entry<String,String> entry :batsman.entrySet()) {
				String playing11PlayerName = entry.getKey()
				int playing11PlayerName12 = (int)Float.parseFloat(entry.getValue())
				if(max<playing11PlayerName12) {
					max = playing11PlayerName12
					actName = playing11PlayerName
				}
			}
			playing11.add(actName)
			batsman.remove(actName)
		}
	}

	def chooseBowler(int playerCount) {
		for(int i=0; i<playerCount; i++) {
			int low =9999;
			String actName
			for (Map.Entry<String,String> entry : bowler.entrySet()) {
				String playing11PlayerName = entry.getKey()
				int playing11PlayerName12 = (int)Float.parseFloat(entry.getValue())
				if(low>playing11PlayerName12) {
					low = playing11PlayerName12
					actName = playing11PlayerName
				}
			}
			playing11.add(actName)
			bowler.remove(actName)
		}
	}

	def chooseWicketKeeper(int playerCount) {

		for(int i=0; i<playerCount; i++) {
			int max =0;
			String actName
			for (Map.Entry<String,String> entry :wicketkeeper.entrySet()) {
				String playing11PlayerName = entry.getKey()
				int playing11PlayerName12 = (int)Float.parseFloat(entry.getValue())
				if(max<playing11PlayerName12) {
					max = playing11PlayerName12
					actName = playing11PlayerName
				}
			}
			playing11.add(actName)
			wicketkeeper.remove(actName)
		}
	}

	def chooseAllrounder(int playerCount) {
		for(int i=0; i<playerCount; i++) {
			int max =0;
			String actName
			for (Map.Entry<String,String> entry : allrounder.entrySet()) {
				String playing11PlayerName = entry.getKey()
				int playing11PlayerName12 = (int)Float.parseFloat(entry.getValue())
				if(max<playing11PlayerName12) {
					max = playing11PlayerName12
					actName = playing11PlayerName
				}
			}
			playing11.add(actName)
			allrounder.remove(actName)
		}
	}
	def playing11Team() {
		int count =1;
		println("___________=== :: Best playing11_:::__________________")
		for(String playerName : playing11) {
			println("         "+count+" :: "+playerName)
			count++
		}
	}

	//	def bestPlaying11() {
	//		for(int i=0; i<4; i++) {
	//			int max =0;
	//			String actName
	//			for (Map.Entry<String,String> entry : batsman.entrySet()) {
	//				String playing11PlayerName = entry.getKey()
	//				int playing11PlayerName12 = (int)Float.parseFloat(entry.getValue())
	//				if(max<playing11PlayerName12) {
	//					max = playing11PlayerName12
	//					actName = playing11PlayerName
	//				}
	//			}
	//			playing11.add(actName)
	//			batsman.remove(actName)
	//		}
	//		println("::::::::::::::::: ::::::::::::==::::::::::::::: batsman ::"+playing11)
	//
	//		for(int i=0; i<4; i++) {
	//			int low =9999;
	//			String actName
	//			for (Map.Entry<String,String> entry : bowler.entrySet()) {
	//				String playing11PlayerName = entry.getKey()
	//				int playing11PlayerName12 = (int)Float.parseFloat(entry.getValue())
	//				if(low>playing11PlayerName12) {
	//					low = playing11PlayerName12
	//					actName = playing11PlayerName
	//				}
	//			}
	//			playing11.add(actName)
	//			bowler.remove(actName)
	//		}
	//		println("::::::::::::::::: ::::::::::::::::::::::::::::::::::: Batsman+ BOWLER ::"+playing11)
	//
	//		for(int i=0; i<2; i++) {
	//			int max =0;
	//			String actName
	//			for (Map.Entry<String,String> entry : allrounder.entrySet()) {
	//				String playing11PlayerName = entry.getKey()
	//				int playing11PlayerName12 = (int)Float.parseFloat(entry.getValue())
	//				if(max<playing11PlayerName12) {
	//					max = playing11PlayerName12
	//					actName = playing11PlayerName
	//				}
	//			}
	//			playing11.add(actName)
	//			allrounder.remove(actName)
	//		}
	//		println("::::::::::::::::: ::::===:::::::::::::::::::==::::::: batsman + bowler + allrounder ::"+playing11)
	//
	//		for(int i=0; i<1; i++) {
	//			int max =0;
	//			String actName
	//			for (Map.Entry<String,String> entry : wicketkeeper.entrySet()) {
	//				String playing11PlayerName = entry.getKey()
	//				int playing11PlayerName12 = (int)Float.parseFloat(entry.getValue())
	//				if(max<playing11PlayerName12) {
	//					max = playing11PlayerName12
	//					actName = playing11PlayerName
	//				}
	//			}
	//			playing11.add(actName)
	//			wicketkeeper.remove(actName)
	//		}
	//
	//		println("::::::::::::::::: ::::::::::::::::::::::::::::::::::: batsman + bowler +wicket keeper + allrounder ::"+playing11)
	//		WebUI.delay(4)
	//	}

	def close() {
		WebUI.closeBrowser()
	}
}
