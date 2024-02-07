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

//excel package import
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewClass {

	TestData  data = findTestData("Data Files/InternalDataFile")
	def getDatFileVAlue(rname) {


		HashMap<String,String> hash =  new HashMap<>();
		String[] arr = ['lakkappa', 'basidono'];
		String[] dd = data.getColumnNames()
		for(int i=0;i<dd.length; i++) {
			println(dd[i])
		}
		data.getRowNumbers()
		int row=0;
		if(dd.contains("uniqueId")) {
			for(int i=1; i< data.getRowNumbers(); i++) {

				if(data.getValue("uniqueId",i)== rname) {
					row =i;
					break;
				}
			}
			if(row == 0) {
				println("Reference name is not there in sheet.")
				return;
			}

			for(int i=0; i<dd.length; i++) {
				hash.put(dd[i],data.getValue(dd[i], row));
			}
		}else {
			println("ccolumn is not present.")
		}
		return hash
	}


	@Keyword
	def show1() {
		println "inside show1 ....."
	}
	@Keyword
	def show2() {
		println "inside show2 ????????????"
	}
	
	def getExportdata(String refName, String columnName) {
		
		DataFormatter dataformatter = new DataFormatter();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lakkappa Y\\git\\Katalon\\Resources\\ExcelDataFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Orders");
		String value123 = dataformatter(workbook.getSheet("Orders").getRow(1).getCell(1))
		System.out.println(value123)
		int rrnumber;
		for(int i=0;i<1000;i++) {
			if(refName.equalsIgnoreCase(dataformatter.formatCellValue(sheet.getRow(i).getCell(9)))) {
				rrnumber =i;
				break;
			}
		}
		
		int ccnumber ;
		for(int i=0; i<sheet.getRow(0).getLastCellNum();i++) {
			if(columnName.equalsIgnoreCase(dataformatter.formatCellValue(sheet.getRow(0).getCell(i)))) {
				ccnumber = i;
				break;
			}
		}
		String expectedValue = dataformatter.formatCellValue(sheet.getRow(rrnumber).getCell(ccnumber))
		return expectedValue;
	}
}
