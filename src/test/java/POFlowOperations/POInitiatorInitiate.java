package POFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POFlowLocators.POApprovL;
import POFlowLocators.POHODL;
import POFlowLocators.POInitiatorL;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRApproverl;
import PRFlowlocators.PRinitiatorl;
import PRFlowlocators.PRreviewerl;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.VendorL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POInitiatorInitiate {
	
	WebDriver driver;

@Test
public void POIniInitiate() throws InterruptedException {
	
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
			
			rfq.recprtab();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			rfq.reqfquottab();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.quopoprintpreview();
			
            Thread.sleep(2000);
			
			mreq.mis();
			
			Thread.sleep(2000);
			
			rfq.recprtab();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			rfq.reqfquottab();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.quoposubmitalert();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.quopocheckbox();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.quopotransporter();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.delschedule("", "");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.quoanalysisview();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.quopocomments("PO Initiated");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.quoposubmit();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.initiatedpotab();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			poini.initiatedpocomsec();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			mreq.quit();
			
			driver.quit();
		
}

@Test
public void POIniRepeatOrderInitiation() throws InterruptedException {
	
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
	
	rfq.recprtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.repeatordertab();
	
	Thread.sleep(2000);
	
	poini.quopoprintpreview();
	
	driver.close();
	
	Thread.sleep(2000);
	
    mreq.mis();
	
	Thread.sleep(2000);
	
	rfq.recprtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.repeatordertab();
	
	Thread.sleep(2000);
	
	rfq.arcsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.popok();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcchckbox();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arccomments("PO Initiated");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poini.quopotransporter();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcdelsch("", "");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcsubmit();
	
	Thread.sleep(2000);
	
	rfq.subok();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.quit();
	
	driver.quit();	
}

@Test
public void POIniARCInitiation() throws InterruptedException {
	
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
	
	rfq.recprtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arctab();
	
	Thread.sleep(2000);
	
	poini.poedit();
	
	Thread.sleep(2000);
	
	poini.quopoprintpreview();
	
	driver.close();
	
	Thread.sleep(2000);
	
    mreq.mis();
	
	Thread.sleep(2000);
	
	rfq.recprtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arctab();
	
	Thread.sleep(2000);
	
	rfq.arcsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arccomments("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.popok();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcchckbox();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arctax();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcpaymentterms();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.Termodel();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcmaterialspec("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcdelsch("", "");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.reqvendorlist();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.revendlistchbox();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1pacfor(null);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1trans();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1freight(null);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.close();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcsubmit();
	
	rfq.subok();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.quit();
	
	driver.quit();	
}

@Test
public void POIniOEMInitiation() throws InterruptedException {
	
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
	
	rfq.recprtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.oemtab();
	
	Thread.sleep(2000);
	
	poini.poedit();
	
	Thread.sleep(2000);
	
	poini.quopoprintpreview();
	
	driver.close();
	
	Thread.sleep(2000);
	
    mreq.mis();
	
	Thread.sleep(2000);
	
	rfq.recprtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.oemtab();
	
	Thread.sleep(2000);
	
	rfq.arcsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arccomments("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.popok();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcchckbox();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arctax();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcpaymentterms();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.Termodel();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcmaterialspec("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcdelsch("", "");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.reqvendorlist();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.revendlistchbox();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1pacfor(null);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1trans();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1freight(null);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.close();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.arcsubmit();
	
	rfq.subok();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.quit();
	
	driver.quit();	
	
	
}

}

