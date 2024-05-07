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
import io.github.bonigarcia.wdm.WebDriverManager;

public class POApproverApprove {
	
	WebDriver driver;
	
	@Test
	public void POAppApprove() throws InterruptedException {
		
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
					
					mreq.login("120008", "12");
					
					Thread.sleep(2000);
					
					mreq.mis();
					
					Thread.sleep(2000);
					
					poapp.pendingpoapp();
					
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					rfq.reqfquottab();
					
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					poini.quopoprintpreview();
					
		            Thread.sleep(2000);
					
					mreq.mis();
					
					Thread.sleep(2000);
					
					poapp.pendingpoapp();
					
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					rfq.reqfquottab();
					
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					poini.quoposubmit();
					
					poapp.lastpodetails();
					
					Thread.sleep(2000);
					
					poini.quopocomments("PO Approved");
					
					Thread.sleep(2000);
					
				    poini.quoposubmit();
				    
				    Thread.sleep(2000);
					
					mreq.quit();
					
					driver.quit();
	}
	
@Test
public void POAppRepeatOrderPOApprove() throws InterruptedException {
		
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
		
		mreq.login("120008", "12");
		
		Thread.sleep(2000);
		
		mreq.mis();
		
		Thread.sleep(2000);
		
		poapp.pendingpoapp();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.repeatordertab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    poapp.lastpodetails();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    mreq.close();
	    
	    Thread.sleep(2000);
		
		rfq.arccomments("PO Approved");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.arcsubmit();
		
		Thread.sleep(2000);
		
		rfq.subok();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		mreq.quit();
		
		driver.quit();
	}

@Test
public void POAppARCApprove() throws InterruptedException {
	
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
		
		mreq.login("120008", "12");
		
		Thread.sleep(2000);
		
		mreq.mis();
		
		Thread.sleep(2000);
		
		poapp.pendingpoapp();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.arctab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    poapp.lastpodetails();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    mreq.close();
	    
	    Thread.sleep(2000);
		
		rfq.arccomments("PO Approved");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.arcsubmit();
		
		Thread.sleep(2000);
		
		rfq.subok();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		mreq.quit();
		
		driver.quit();
}

@Test
public void POAppOEMApprove() throws InterruptedException {
	
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
		
		mreq.login("120008", "12");
		
		Thread.sleep(2000);
		
		mreq.mis();
		
		Thread.sleep(2000);
		
		poapp.pendingpoapp();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.oemtab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    poapp.lastpodetails();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    mreq.close();
	    
	    Thread.sleep(2000);
		
		rfq.arccomments("PO Approved");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.arcsubmit();
		
		Thread.sleep(2000);
		
		rfq.subok();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		mreq.quit();
		
		driver.quit();

}
}
