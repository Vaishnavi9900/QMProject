package PRFlowOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.*;
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
import locatorspack.BillDoc;

public class MtReqRejApprover extends BaseClass {
	
@Test(dataProvider = "PRappRej", dataProviderClass = PRDataProv.class)
public void prapproverrej(String PRApprover, String Password, String AppRjCmts ) throws InterruptedException {
				
		MaterialReql mreq = new MaterialReql(driver);
		
		PRinitiatorl prin = new PRinitiatorl(driver);
		
		PRreviewerl prrev = new PRreviewerl(driver);
		
		PRApproverl prapp = new PRApproverl(driver);

             mreq.login(PRApprover,Password);
					
					Thread.sleep(4000);
						
					mreq.mis();
					
					Thread.sleep(2000);
					
					prapp.prpeap();
					
					Thread.sleep(2000);
					
					prapp.prapedit();
					
					Thread.sleep(2000);
					
					prin.reject(AppRjCmts);
					
					Thread.sleep(2000);
					
					prrev.revrej();
					
					Thread.sleep(2000);
					
					prrev.chboxok();
					
					Thread.sleep(2000);
					
					prrev.chbox();
					
					Thread.sleep(2000);
					
					prrev.revrej();
					
					Thread.sleep(2000);
					
					mreq.ok();
					
					Thread.sleep(2000);
					
					mreq.quit();
					
					driver.quit();
					
	}
				

@Test(dataProvider = "MatIni", dataProviderClass = PRDataProv.class,dependsOnMethods = "prapproverrej")
public void mreqrejtabview(String MaterialReq,String Password,String Purpose,String ReqQty,String Adspec) throws InterruptedException, IOException {
						
			    	MaterialReql mreq = new MaterialReql(driver);
			
					 mreq.login(MaterialReq, Password);
					 
					 Thread.sleep(4000);
							
						mreq.mis();
						
						Thread.sleep(2000);
						
						mreq.rejcarttab();
						
						driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
						
					    mreq.rejsts();
					    
					    Thread.sleep(2000);
						
					   mreq.quit();
					 
					   driver.quit();
					   
						 }
}
