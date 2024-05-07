package PRFlowOperations;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DataProviderpack.BaseClass;
import DataProviderpack.PRDataProv;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRApproverl;
import PRFlowlocators.PRinitiatorl;
import PRFlowlocators.PRreviewerl;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MaterialReqInitiation extends BaseClass{
	
@Test(testName="Matreq",dataProvider = "MatIni", dataProviderClass = PRDataProv.class)
public void MatreqInitiation(String MaterialReq,String Password,String Purpose,String ReqQty,String Adspec) throws InterruptedException{
	
    MaterialReql mreq = new MaterialReql(driver);
	
	PRinitiatorl prin = new PRinitiatorl(driver);
	
	PRreviewerl prrev = new PRreviewerl(driver);
	
	PRApproverl prapp = new PRApproverl(driver);
	
	mreq.login(MaterialReq, Password);

	Thread.sleep(4000);
		
	mreq.mis();
	
	Thread.sleep(2000);
	
	mreq.shcart();
	
	Thread.sleep(2000);
	
	mreq.add();
	
	Thread.sleep(2000);
	
	mreq.mdes();
	
	Thread.sleep(2000);
	
    mreq.pur(Purpose);
	
	Thread.sleep(2000);
	
	mreq.reqqty(ReqQty);
	
	Thread.sleep(2000);
	
	mreq.adspec(Adspec);
	
	Thread.sleep(3000);
	
	mreq.adspecfile("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\Files\\Material (4).xlsx");
	
	Thread.sleep(2000);
	
	mreq.add();
	
	Thread.sleep(2000); 
	
	mreq.yes();
	
	Thread.sleep(2000);
	
	mreq.view();
	
	Thread.sleep(3000);
	
	mreq.close();
	
	Thread.sleep(2000);
	
	mreq.submit();
	
	Thread.sleep(2000);
	
	mreq.ok();
	
    mreq.quit();

}

}
