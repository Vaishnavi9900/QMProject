package POFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POFlowLocators.POApprovL;
import POFlowLocators.POHODL;
import POFlowLocators.POInitiatorL;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.VendorL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POIniVendorAdvancePayApprove {

@Test
public void POAdvancePaymentApprove() throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			MaterialReql mreq = new MaterialReql(driver);
			
			PRinitiatorl prin = new PRinitiatorl(driver);
			
			RFQInitiator rfq = new RFQInitiator(driver);
		
			POInitiatorL poini = new POInitiatorL(driver);
			
			POApprovL poapp = new POApprovL(driver);
			
			POHODL pohod = new POHODL(driver);
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
		
			driver.get("http://172.16.5.167/Home/Vendor/");
			
			mreq.login("120007", "12");
			
			Thread.sleep(2000);
			
			mreq.mis();
			
			Thread.sleep(2000);
			
		    poini.advancepamenttab();
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    poini.vendoradvpayment();
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    poini.vendoradvsubmit();
		    
		    rfq.popok();
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    rfq.arcchckbox();
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    poini.vendoradvsubmit();
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    mreq.quit();
		    
		    driver.quit();    
	}


}