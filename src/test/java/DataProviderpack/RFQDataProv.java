package DataProviderpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class RFQDataProv {
	
@DataProvider(name = "RFQIni")
public String[][] RFQInitiation() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\RFQData.xlsx");
		
		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("RFQIni");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

			}

		}

		workbook.close();
		fis.close();
		return data;
	}
@DataProvider(name = "openrfq")
public String[][] vendoropenRFQ() throws IOException {

	File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\RFQData.xlsx");
	
	System.out.println(fi.exists());

	FileInputStream fis = new FileInputStream(fi);

	XSSFWorkbook workbook = new XSSFWorkbook(fis);

	XSSFSheet sheet = workbook.getSheet("openrfq");

	// System.out.println(sheet.getPhysicalNumberOfRows());

	int noofrows = sheet.getPhysicalNumberOfRows();

	int noofcolumns = sheet.getRow(0).getLastCellNum();

	String[][] data = new String[noofrows - 1][noofcolumns];

	for (int i = 0; i < noofrows - 1; i++) {

		for (int j = 0; j < noofcolumns; j++) {

			DataFormatter df = new DataFormatter();

			data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

		}

	}

	workbook.close();
	fis.close();
	return data;
}


}
