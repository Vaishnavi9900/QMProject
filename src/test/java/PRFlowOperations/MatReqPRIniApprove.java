package PRFlowOperations;

import java.util.concurrent.TimeUnit;

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

public class MatReqPRIniApprove extends BaseClass {
	
@Test(dataProvider = "MatreeqPRini",dataProviderClass = PRDataProv.class)	
public void prreqcartApproval(String PRInitiator, String Password,String DelDate,String Univalue,String Adspec) throws InterruptedException {

		  
			MaterialReql mreq = new MaterialReql(driver);
			
			PRinitiatorl prin = new PRinitiatorl(driver);
			
			PRreviewerl prrev = new PRreviewerl(driver);
			
			PRApproverl prapp = new PRApproverl(driver);
	
		     mreq.login(PRInitiator, Password);
		     
		    	Thread.sleep(4000);
					
				mreq.mis();
				
				Thread.sleep(2000);
				
				prin.reqcart();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				prin.edit();
				
				Thread.sleep(2000);
				
				prin.commentsection();
				
				Thread.sleep(2000);

				prin.mrsubmit();
				
				Thread.sleep(2000);

				prin.deldate(DelDate);
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				prin.mrsubmit();
				
				Thread.sleep(2000);
				
				prin.uni(Univalue);
				
				Thread.sleep(2000);
				
				prin.adspecup(Adspec);
				
				Thread.sleep(2000);

				prin.adspecfileup("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorPortal\\Resources\\Files\\MaterialGroup (1).pdf");
				
				Thread.sleep(2000);
				
				prin.mrsubmit();
				
				Thread.sleep(2000);
				
				mreq.ok();
				
				Thread.sleep(2000);
				
				mreq.quit();
				
				driver.quit();
				
	}

}
