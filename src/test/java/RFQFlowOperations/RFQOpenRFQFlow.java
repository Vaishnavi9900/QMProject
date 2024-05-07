package RFQFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;
import RFQFlowLocators.RFQApL;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.RFQRevL;
import RFQFlowLocators.VendorL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RFQOpenRFQFlow {

@Test
public void OpenRFQInitiation() throws InterruptedException {
	
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
	
	rfq.oprfqtab();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.submit();
	
	Thread.sleep(3000);
	
	rfq.rfqenddate("");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.tax();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.reqvendorlist();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	rfq.submit();
	
	Thread.sleep(2000);
	
	rfq.subok();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	mreq.quit();
	
	driver.quit();
	
}
}