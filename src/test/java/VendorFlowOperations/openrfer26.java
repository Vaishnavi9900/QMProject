package VendorFlowOperations;

import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import DataProviderpack.BaseClass;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.VendorL;

@Test
public class openrfer26 extends BaseClass {
	
	public void opentfqrqy() throws IOException, InterruptedException {
		
		MaterialReql mreq = new MaterialReql(driver);

		PRinitiatorl prin = new PRinitiatorl(driver);

		RFQInitiator rfq = new RFQInitiator(driver);

		VendorL vend = new VendorL(driver);
		
		driver.get("http://172.16.5.167/Registration/Vendor/");
		
		  XSSFWorkbook workbook = new XSSFWorkbook(".\\Resources\\RFQData");
		  
		  XSSFSheet sheet = workbook.getSheet("openrfq");
		  
		  for (int i = 2; i <=2; i++) { 
		  
		XSSFRow row = sheet.getRow(i);
		
		for (int j = 0; j < 2; j++) {
			
		
		XSSFCell cell = sheet.getRow(0).getCell(j);
		
		
		
		
	
		}
		  
			
		}
	}
	
	

}
