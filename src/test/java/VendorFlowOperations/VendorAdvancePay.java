package VendorFlowOperations;

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

public class VendorAdvancePay {
	
	@Test
	public void Vendoradvancepay() throws InterruptedException {
			
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

				driver.get("http://172.16.5.167/Registration/Vendor/");

				vend.vendorlogin("", "12345");
				
				Thread.sleep(2000);
				
				vend.advpaymenttab();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.asnsubmit();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.singleadv();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.vchckbox();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.advpaydate("");
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.advpaypercentage();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.Calcheck();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				vend.asnsubmit();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				rfq.subok();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				mreq.quit();
				
				driver.quit();	
		}


}
