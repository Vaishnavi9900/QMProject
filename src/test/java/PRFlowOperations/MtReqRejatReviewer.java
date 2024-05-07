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
import locatorspack.BillDoc;

public class MtReqRejatReviewer extends BaseClass{
	
@Test(dataProvider = "PRRejRev", dataProviderClass = PRDataProv.class)
public void PrreviewerRej(String PRReviewer, String Password, String RevRjCmts) throws InterruptedException {

		MaterialReql mreq = new MaterialReql(driver);
		
		PRinitiatorl prin = new PRinitiatorl(driver);
		
		PRreviewerl prrev = new PRreviewerl(driver);
		
	   mreq.login(PRReviewer, Password);
	
		Thread.sleep(4000);
			
		mreq.mis();
		
		Thread.sleep(2000);
		
		prrev.pefrev();
		
		Thread.sleep(2000);
		
		prrev.pefrevedit();
		
		Thread.sleep(2000);
		
		prin.reject(RevRjCmts);
		
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
		
	  mreq.quit();
	  
	  driver.quit();
	  
}
}
