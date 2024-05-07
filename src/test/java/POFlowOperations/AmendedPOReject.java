package POFlowOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POFlowLocators.POInitiatorL;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.VendorL;

public class AmendedPOReject {
	
@Test	
public void AmendedPOReject() throws InterruptedException {
	
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
	
	Thread.sleep(2000);
	
	poini.amendedreject();
	
	Thread.sleep(2000);
	
	poini.amendedpotab();
	
	Thread.sleep(2000);
	
	mreq.quit();
	
	driver.quit();
	
}

}
