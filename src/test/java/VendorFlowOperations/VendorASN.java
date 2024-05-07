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

public class VendorASN {
	
	@Test
	public void vendorconfirmandASN() throws InterruptedException {
		
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
		
		vend.asntab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.asnsubmit();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.invnumbernddate("", "");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.modeoftransport();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.ewaybill("", "");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.doctype();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.attachments("");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.doctyperemove();
		
		Thread.sleep(2000);
		
	    vend.doctype();
		
	    Thread.sleep(2000);
	    
		vend.attachments("");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.doctypeview();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.close();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.Trnsportdetails("", "", "", "", "");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.asnadd();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.invqty("");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.grossweight1("");
		
		Thread.sleep(2000);
		
		vend.grossuom1();
		
		Thread.sleep(2000);
		
		vend.asncomments("ASN INITIATED");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.Calcheck();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.asnsubmit();
		
		rfq.subok();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.vendordashhyp();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		vend.apprinvtab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    mreq.quit();
		
		driver.quit();
	}

}
