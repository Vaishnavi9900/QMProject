package PRFlowOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProviderpack.BaseClass;
import DataProviderpack.PRDataProv;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRApproverl;
import PRFlowlocators.PRinitiatorl;
import PRFlowlocators.PRreviewerl;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PRReview extends BaseClass {
	
@Test(dataProvider = "PRRev", dataProviderClass = PRDataProv.class)
public void prreview(String PRReviewer,String Password,String RevCmts, String RevReqQty) throws InterruptedException {
		

			MaterialReql mreq = new MaterialReql(driver);
			
			PRinitiatorl prin = new PRinitiatorl(driver);
			
			PRreviewerl prrev = new PRreviewerl(driver);
			
			PRApproverl prapp = new PRApproverl(driver);
			
		     mreq.login(PRReviewer, Password);

			Thread.sleep(4000);
				
			mreq.mis();
			
			Thread.sleep(3000);
			
			prrev.pefrev();
			
			Thread.sleep(3000);
			
			prrev.pefrevedit();
			
			Thread.sleep(2000);
			
			prrev.back();
			
			Thread.sleep(2000);
			
			prrev.pefrevedit();
			
			Thread.sleep(2000);
			
			prin.mrsubmit();
			
			Thread.sleep(2000);
			
			prrev.revcmts(RevCmts);
			
			Thread.sleep(2000);
			
			prin.mrsubmit();
			
			Thread.sleep(2000);
			
			prrev.chboxok();
			
			prrev.chbox();
			
			Thread.sleep(2000);
			
			prrev.reqtyrev(RevReqQty);
			
			Thread.sleep(2000);
			
			prin.mrsubmit();
			
			Thread.sleep(2000);
			
			mreq.ok();
			
			Thread.sleep(2000);
			
			mreq.quit();
			
			driver.quit();
			
	}

}
