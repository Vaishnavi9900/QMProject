package GRNFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GRNFlowLocators.GRNL;
import GRNFlowLocators.GateEntryL;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.VendorL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GRNReturn {
	
	WebDriver driver;
	
@Test
public void GRNReturn() throws InterruptedException {

	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();

	MaterialReql mreq = new MaterialReql(driver);

	PRinitiatorl prin = new PRinitiatorl(driver);

	RFQInitiator rfq = new RFQInitiator(driver);

	GateEntryL gate = new GateEntryL(driver);

	GRNL grn = new GRNL(driver);

	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();

	driver.get("http://172.16.5.167/Home/Vendor/");

	mreq.login("150001", "12");

	Thread.sleep(2000);
	
	rfq.recquotab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	grn.goodsreturnedit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	grn.goodsreturnsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	grn.reasonforreturn();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	grn.returnqty("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	grn.returnnoofcontainers("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	grn.returnstorageloc();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
    grn.grnvendordoc();
    
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	grn.goodsreturncomments("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	grn.goodsreturnsubmit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	grn.grnsubmitok();
	
	Thread.sleep(2000);
	
	grn.grndashhyp();
	
	Thread.sleep(2000);
	
	rfq.inrfqtab();
	
	Thread.sleep(2000);
	
	grn.goodsreturnreporttab();
	
	Thread.sleep(2000);
  
	mreq.quit();
	
	Thread.sleep(2000);
	
	driver.quit();
}
}
