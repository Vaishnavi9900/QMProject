package VendorFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.VendorL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VendorAcceptPO {
	
	@Test
	public void VendorAcceptpo() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			MaterialReql mreq = new MaterialReql(driver);

			PRinitiatorl prin = new PRinitiatorl(driver);

			RFQInitiator rfq = new RFQInitiator(driver);

			VendorL vend = new VendorL(driver);

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.get("http://172.16.5.167/Registration/Vendor/");

			vend.vendorlogin("", "12345");
			
			Thread.sleep(2000);
			
			vend.vendorappstatus();
			
			Thread.sleep(2000);
			
			prin.edit();
			
			Thread.sleep(2000);
			
			vend.actionview();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.close();
			
			Thread.sleep(2000);
			
			vend.acceptpoalert();
			
			Thread.sleep(2000);
			
			vend.acceptpo();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			mreq.quit();
			
			driver.quit();
		}

}
