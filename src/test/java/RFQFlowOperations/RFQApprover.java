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
import io.github.bonigarcia.wdm.WebDriverManager;

public class RFQApprover {
	
	@Test
	public void RFQApprove() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		MaterialReql mreq = new MaterialReql(driver);

		PRinitiatorl prin = new PRinitiatorl(driver);

		RFQInitiator rfq = new RFQInitiator(driver);
		
		RFQRevL rfqrev = new RFQRevL(driver);
		
		RFQApL rfqapp = new RFQApL(driver);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://172.16.5.167/Home/Vendor/");

		mreq.login("120006", "12");

		Thread.sleep(2000);

		mreq.mis();

		Thread.sleep(2000);
		
		rfqapp.qcspendingforapp();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		prin.edit();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.chbox();
		
		Thread.sleep(3000);
		
		rfq.rfqinicomments("RFQ Approved");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.submit();
		
		Thread.sleep(2000);
		
		rfq.subok();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		rfq.appqcstab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		mreq.quit();
		
		driver.quit();	
	}


}
