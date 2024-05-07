package RFQFlowOperations;

import java.rmi.AccessException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class RFQRequotation {
	
@Test
public void RFQReQuotation() throws InterruptedException {

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

		rfq.recquotab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.printprev();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.chbox();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.plantstock();
		
		Thread.sleep(2000);

		rfq.groupstock();
		
		Thread.sleep(2000);

		rfq.qcss();
		
		Thread.sleep(2000);

		rfq.rfqinicomments("Initiated");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.requotation();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.subok();
		
		Thread.sleep(2000);

		mreq.quit();

		driver.quit();
	}
}