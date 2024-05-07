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

public class POIniAdvancePayInitiation {
	
	WebDriver driver;
	
@Test
public void POIniAdvancePaymentIni() throws InterruptedException {
			
			 WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
				MaterialReql mreq = new MaterialReql(driver);
				
				PRinitiatorl prin = new PRinitiatorl(driver);
				
				RFQInitiator rfq = new RFQInitiator(driver);
			
				POInitiatorL poini = new POInitiatorL(driver);
				
				POApprovL poapp = new POApprovL(driver);
				
				POHODL pohod = new POHODL(driver);
				
				VendorL vend = new VendorL(driver);
				
				driver.manage().window().maximize();
				
				driver.manage().deleteAllCookies();
			
				driver.get("http://172.16.5.167/Home/Vendor/");
				
				mreq.login("120007", "12");
				
				Thread.sleep(2000);
				
				mreq.mis();
				
				Thread.sleep(2000);
				
			    poini.advancepamenttab();
			    
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
			    poini.manualadvpayment();
			    
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
			    vend.asnsubmit();
			    
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.singleadv();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.vchckbox();
				
				Thread.sleep(2000);
				
				vend.advpaydate("");
				
				Thread.sleep(2000);
				
				vend.advpaypercentage();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				poini.poadvpercentage();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.asnsubmit();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				rfq.subok();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
			    mreq.quit();
			    
			    driver.quit();    
		}
}
