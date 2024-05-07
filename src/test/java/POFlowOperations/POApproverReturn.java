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

public class POApproverReturn {
		
		WebDriver driver;
@Test
public void POappreturn() throws InterruptedException {
	
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
	
	poapp.poreturn();
	
	poini.quopocomments("PO Returned");
	
	Thread.sleep(2000);
	
	poapp.lastpodetails();
	
	Thread.sleep(2000);
	
	poapp.poreturn();
	
	Thread.sleep(2000);
	
	mreq.quit();
	
	driver.quit();
	
}
@Test
public void POAppRepeatOrderReturn() throws InterruptedException {
	
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
	
	rfq.repeatordertab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poapp.poreturn();
	
	poini.quopocomments("PO Returned");
	
	Thread.sleep(2000);
	
	poapp.lastpodetails();
	
	Thread.sleep(2000);
	
	poapp.poreturn();
	
	Thread.sleep(2000);
	
	mreq.quit();
	
	driver.quit();
	
}

@Test
public void POAppARCReturn() throws InterruptedException {
	
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
	
	rfq.arctab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poapp.poreturn();
	
	poini.quopocomments("PO Returned");
	
	Thread.sleep(2000);
	
	poapp.lastpodetails();
	
	Thread.sleep(2000);
	
	poapp.poreturn();
	
	Thread.sleep(2000);
	
	mreq.quit();
	
	driver.quit();
	
}

public void POAppOEMReturn() throws InterruptedException {
	
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
	
	rfq.oemtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poapp.poreturn();
	
	poini.quopocomments("PO Returned");
	
	Thread.sleep(2000);
	
	poapp.lastpodetails();
	
	Thread.sleep(2000);
	
	poapp.poreturn();
	
	Thread.sleep(2000);
	
	mreq.quit();
	
	driver.quit();
	
}
}



