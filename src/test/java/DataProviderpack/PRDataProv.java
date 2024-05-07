package DataProviderpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PRDataProv {

	@DataProvider(name = "MatIni")
	public String[][] logindata() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\MaterialReqdata.xlsx");

		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("MatData");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

				// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}

		}

		workbook.close();
		fis.close();

		// for (String[] dataarray : data) {

		// Arrays.toString(dataarray);

		// }
		return data;
	}

	@DataProvider(name = "MatreeqPRini")
	public String[][] PRInAp() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\MaterialReqdata.xlsx");

		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("MatreeqPRini");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

				// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}

		}

		workbook.close();
		fis.close();

		// for (String[] dataarray : data) {

		// Arrays.toString(dataarray);

		// }
		return data;
	}
	@DataProvider(name = "PRIni")
	public String[][] PRinitia() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\MaterialReqdata.xlsx");

		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("PRIni");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

				// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}

		}

		workbook.close();
		fis.close();

		// for (String[] dataarray : data) {

		// Arrays.toString(dataarray);

		// }
		return data;
	}

	@DataProvider(name = "PRRev")
	public String[][] PRrev() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\MaterialReqdata.xlsx");

		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("PRRev");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

				// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}

		}

		workbook.close();
		fis.close();

		// for (String[] dataarray : data) {

		// Arrays.toString(dataarray);

		// }
		return data;
	}

	@DataProvider(name = "PRapp")
	public String[][] PRApp() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\MaterialReqdata.xlsx");

		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("PRapp");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

				// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}

		}

		workbook.close();
		fis.close();

		// for (String[] dataarray : data) {

		// Arrays.toString(dataarray);

		// }
		return data;
	}

	@DataProvider(name = "PRInRej")
	public String[][] PRINREJE() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\MaterialReqdata.xlsx");

		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("PRInRej");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

				// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}

		}

		workbook.close();
		fis.close();

		// for (String[] dataarray : data) {

		// Arrays.toString(dataarray);

		// }
		return data;
	}


	@DataProvider(name = "PRRejRev")
	public String[][] RejPRRev() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\MaterialReqdata.xlsx");

		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("PRRejRev");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

				// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}

		}

		workbook.close();
		fis.close();

		// for (String[] dataarray : data) {

		// Arrays.toString(dataarray);

		// }
		return data;
	}
	
	@DataProvider(name = "PRappRej")
	public String[][] RejPRApp() throws IOException {

		File fi = new File("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\MaterialReqdata.xlsx");

		System.out.println(fi.exists());

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("PRappRej");

		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noofrows = sheet.getPhysicalNumberOfRows();

		int noofcolumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noofrows - 1][noofcolumns];

		for (int i = 0; i < noofrows - 1; i++) {

			for (int j = 0; j < noofcolumns; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));

				// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());

			}

		}

		workbook.close();
		fis.close();

		// for (String[] dataarray : data) {

		// Arrays.toString(dataarray);

		// }
		return data;
	}
}
