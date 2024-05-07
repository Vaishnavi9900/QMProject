package PRFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import DataProviderpack.BaseClass;
import DataProviderpack.PRDataProv;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRApproverl;
import PRFlowlocators.PRinitiatorl;
import PRFlowlocators.PRreviewerl;
import io.github.bonigarcia.wdm.WebDriverManager;
import locatorspack.BillDoc;

  
 public class PRiniInitiation extends BaseClass{
	  
	  
@Test(dataProvider = "PRIni", dataProviderClass = PRDataProv.class)
public void priniinitiate(String PRInitiator, String Password, String purpose,String unival,String reqqty, String deldate, String adspec) throws InterruptedException {
	  
		MaterialReql mreq = new MaterialReql(driver);
		
		PRinitiatorl prin = new PRinitiatorl(driver);
		
		PRreviewerl prrev = new PRreviewerl(driver);
		
		PRApproverl prapp = new PRApproverl(driver);
			
	mreq.login(PRInitiator, Password);

	Thread.sleep(4000);
		
	mreq.mis();
	
	Thread.sleep(2000);
	
	prin.prstab();
	
	Thread.sleep(2000);
	
	mreq.add();
	
	Thread.sleep(2000);
	
	mreq.mdes();
	
	Thread.sleep(2000);
	
	prin.prpur(purpose);
	
	 Thread.sleep(2000);
	
	 prin.unitval(unival);
	 
	Thread.sleep(2000);
	
	prin.prreqqty(reqqty);
	
	Thread.sleep(2000);
	
	prin.deldate(deldate);
	
	Thread.sleep(2000);
	
	prin.pradspec(adspec);
	
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
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.quit();
	
	driver.quit();
	
}
  }


