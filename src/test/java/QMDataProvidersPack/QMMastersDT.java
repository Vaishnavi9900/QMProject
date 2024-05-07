package QMDataProvidersPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class QMMastersDT{

	
@DataProvider(name="Area")
public String[][] AreaArea() throws IOException {
	

	File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\QMProject\\Resources\\QMData.xlsx");

	System.out.println(fi.exists());

	FileInputStream fis = new FileInputStream(fi);

	XSSFWorkbook workbook = new XSSFWorkbook(fis);

	XSSFSheet sheet = workbook.getSheet("Area");
	
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
