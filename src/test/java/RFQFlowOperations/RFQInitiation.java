package RFQFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DataProviderpack.BaseClass;
import DataProviderpack.RFQDataProv;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRApproverl;
import PRFlowlocators.PRinitiatorl;
import PRFlowlocators.PRreviewerl;
import RFQFlowLocators.RFQApL;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.RFQRevL;
import RFQFlowLocators.VendorL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RFQInitiation extends BaseClass {

@Test(dataProvider = "RFQIni", dataProviderClass = RFQDataProv.class)
public void RFQIniInitiate(String RFQInitiator, String Password, String rfqenddate,String mtspec) throws InterruptedException {

		MaterialReql mreq = new MaterialReql(driver);

		PRinitiatorl prin = new PRinitiatorl(driver);

		RFQInitiator rfq = new RFQInitiator(driver);

		mreq.login(RFQInitiator, Password);

		Thread.sleep(4000);

		mreq.eng();

		Thread.sleep(2000);

		rfq.recprtab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.reqfquottab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.raiserfq();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.submit();
		
		Thread.sleep(3000);

		rfq.popok();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.chbox();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.submit();
		
		Thread.sleep(2000);

		rfq.popok();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.reqvendorlist();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.tax();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.Termodel();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.rfqenddate(rfqenddate);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.matspec(mtspec);
		
		Thread.sleep(3000);

		rfq.submit();
		
		Thread.sleep(3000);

		rfq.subok();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.inrfqtab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		mreq.apview();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		prin.commentsection();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		mreq.quit();
	}

}
