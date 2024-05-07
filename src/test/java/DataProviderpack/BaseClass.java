package DataProviderpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRApproverl;
import PRFlowlocators.PRinitiatorl;
import PRFlowlocators.PRreviewerl;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;

	public static String screenshotsubfoldername;
	
    @BeforeMethod()
	public void LoginBrowser() {
		
		    WebDriverManager.chromedriver().setup();
			
		     driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.get("http://172.16.5.167/Home/Vendor/");
	}
    
    //@AfterMethod
    public void Quit() throws InterruptedException {
		
		driver.quit();
    }
    
//    @AfterMethod
//    public void Screenshot(ITestResult result) {
//    	
//    	if(result.getStatus()==ITestResult.FAILURE) {
//    		
//    		CaptureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName());
//    	}
//    }

    
  
    public void CaptureScreenshot(String fileName) {
    	
    	
		if(screenshotsubfoldername ==null) {
			
			LocalDateTime myDateObj = LocalDateTime.now();
			
			DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			
			screenshotsubfoldername = myDateObj.format(myformatobj);
			
		
		}
    	
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
    	
    	File destfile = new File("./Screenshots/" +screenshotsubfoldername+"/" +fileName);
    	
    	try {
			FileUtils.copyFile(sourcefile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("Screenshot saved successfully");
    	
    }
    
    
    public static void Close_Opened_File() throws Exception
    
	{
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(parent);
		// Test.log(Status.PASS, "userclick on Action");
		Thread.sleep(1000);
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("window.scrollTo(0,1000)", "");
		Thread.sleep(1000);
	}
    
    public void switchToNEWwindow(){
        try{
            ArrayList<String> newTab = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(newTab.get(1));
        }
        catch(Exception e){}
    }
    
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
   
}
