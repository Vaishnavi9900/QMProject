package ApplicationMastersOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ApplicationMasterslocators.Arealocatorclass;
import QMDataProvidersPack.QMMastersDT;
import basicpack.CommonMethods;

public class Area extends CommonMethods {

	public Arealocatorclass ar;

//@Test(dataProvider = "Area", dataProviderClass = QMMastersDT.class)
	public void areacreation(String id, String pass, String area) throws InterruptedException {

		ar = new Arealocatorclass(driver);

		ar.login(id, pass);

		ar.termination();

		ar.menu();

		ar.areamaster();

		ar.areacreate(area, pass);

		ar.subok();

		ar.quit();
	}

	@Test
	public void areaexist() throws IOException, InterruptedException {

		cell2("Area");

		ar = new Arealocatorclass(driver);

		ar.login("191919", "123");

		ar.termination();

		ar.menu();

		ar.areamaster();

		ar.create();

		ar.createbutton();

		ar.areaexisted(cell2);

		ar.createbutton();

		ar.exist();

		ar.close();

		ar.quit();

	}

}
