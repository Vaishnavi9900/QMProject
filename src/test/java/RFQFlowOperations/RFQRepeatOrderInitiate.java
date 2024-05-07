package RFQFlowOperations;

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

public class RFQRepeatOrderInitiate {
	
	WebDriver driver;

@Test
public void RepeatOrderinitiate() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();

	MaterialReql mreq = new MaterialReql(driver);

	PRinitiatorl prin = new PRinitiatorl(driver);

	RFQInitiator rfq = new RFQInitiator(driver);

	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();

	driver.get("http://172.16.5.167/Home/Vendor/");

	mreq.login("120004", "12");

	Thread.sleep(2000);

	mreq.mis();

	Thread.sleep(2000);
	
	rfq.repeatordertab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.submit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.popok();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.chbox();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.submit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.popok();
	
	Thread.sleep(2000);
	
	rfq.reqvendorlist();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.revendlistchbox();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1pacfor("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1trans();	
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.vendor1freight("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.close();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.submit();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.subok();
	
	Thread.sleep(2000);
	
	rfq.inrfqtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.apview();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	prin.commentsection();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.quit();
	
	driver.quit();
}


}
