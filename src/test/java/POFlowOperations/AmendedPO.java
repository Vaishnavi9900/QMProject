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

public class AmendedPO {
	

@Test	
public void AmendedPO() throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	
	MaterialReql mreq = new MaterialReql(driver);
	
	PRinitiatorl prin = new PRinitiatorl(driver);
	
	RFQInitiator rfq = new RFQInitiator(driver);

	POInitiatorL poini = new POInitiatorL(driver);
	
	VendorL vend = new VendorL(driver);
	
	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();
	
	driver.get("http://172.16.5.167/Home/Vendor/");
	
	mreq.login("120007", "12");
	
	Thread.sleep(2000);
	
	mreq.mis();
	
	Thread.sleep(2000);
	
	poini.amendedpotab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poini.amendedunitprice("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poini.amendedorderqty("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poini.amendedpackfor("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poini.amendedfreight("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poini.delschedule("", "");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poini.amendedsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	poini.amendedsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.quit();
	
	driver.quit();
}
}
