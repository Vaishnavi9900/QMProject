package PRFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DataProviderpack.BaseClass;
import DataProviderpack.PRDataProv;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;


public class MtReqRejatIni extends BaseClass{

@Test(dataProvider = "PRInRej", dataProviderClass = PRDataProv.class)
public void PRIniRej(String PRInitiator,String Password,String RjCmnts) throws InterruptedException{
    
	MaterialReql mreq = new MaterialReql(driver);
	
	PRinitiatorl prin = new PRinitiatorl(driver);
    
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
	
	prin.reject(RjCmnts);
	
	Thread.sleep(2000);
	
	prin.rejsub();
	
	Thread.sleep(2000);
	
	prin.rejprtab();
	
	Thread.sleep(2000);
	
	mreq.apview();
	
	Thread.sleep(5000);
	
	mreq.rejsts();
	
	Thread.sleep(2000);
	
	mreq.quit();

}
	
}	
	


