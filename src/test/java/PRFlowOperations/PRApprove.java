package PRFlowOperations;

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

public class PRApprove extends BaseClass{
	
@Test(dataProvider = "PRapp", dataProviderClass = PRDataProv.class)
public void prapprove(String PRApprover,String Password,String AppCmts) throws InterruptedException {
			
			MaterialReql mreq = new MaterialReql(driver);
			
			PRinitiatorl prin = new PRinitiatorl(driver);
			
			PRreviewerl prrev = new PRreviewerl(driver);
			
			PRApproverl prapp = new PRApproverl(driver);
			
		     mreq.login(PRApprover, Password);
				
					Thread.sleep(4000);
						
					mreq.mis();
					
					Thread.sleep(2000);
					
					prapp.prpeap();
					
					Thread.sleep(2000);
					
					prapp.prapedit();
					
					Thread.sleep(2000);
					
					prin.mrsubmit();
					
					Thread.sleep(2000);
					
					prrev.revcmts(AppCmts);
					
					Thread.sleep(2000);
					
					prin.mrsubmit();
					
					Thread.sleep(2000);
					
					prrev.chboxok();
					
					Thread.sleep(2000);
					
					prrev.chbox();		

	        	    Thread.sleep(2000);
					
					prin.mrsubmit();
					
					Thread.sleep(2000);
					
					mreq.ok();
					
					Thread.sleep(2000);
					
					prin.apprstab();
					
					Thread.sleep(2000);
					
					mreq.apview();
					
					Thread.sleep(2000);
					
					mreq.mttcode();
					
					Thread.sleep(5000);	
					
					mreq.quit();
					
					driver.quit();
	}

}
