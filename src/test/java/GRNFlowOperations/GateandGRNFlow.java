package GRNFlowOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GRNFlowLocators.GRNL;
import GRNFlowLocators.GateEntryL;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRApproverl;
import PRFlowlocators.PRinitiatorl;
import PRFlowlocators.PRreviewerl;
import RFQFlowLocators.RFQInitiator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GateandGRNFlow {

	WebDriver driver;

	@Test
	public void GateEntry() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		MaterialReql mreq = new MaterialReql(driver);

		PRinitiatorl prin = new PRinitiatorl(driver);

		RFQInitiator rfq = new RFQInitiator(driver);

		GateEntryL gate = new GateEntryL(driver);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://172.16.5.167/Home/Vendor/");

		mreq.login("150000", "12");

		Thread.sleep(2000);

		rfq.reqfquottab();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		gate.gateget();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);

		gate.gateinvoiceno("");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		gate.gateget();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		gate.gateentryback();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.reqfquottab();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		gate.gateinvoiceno("");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		gate.gateget();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		gate.gateentryback();

		Thread.sleep(2000);

		rfq.reqfquottab();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		gate.gateinvoiceno("");

		Thread.sleep(2000);

		gate.gatevehicleno("");

		Thread.sleep(2000);

		gate.gateget();

		Thread.sleep(2000);

		gate.othervehicleno("");

		Thread.sleep(2000);

		gate.gatesubmit();

		Thread.sleep(2000);

		rfq.inrfqtab();

		Thread.sleep(4000);

		mreq.quit();

		driver.quit();

	}

	@Test(dependsOnMethods = "GateEntry")
	public void GRN() throws InterruptedException {

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

		rfq.reqfquottab();
		
		grn.grnedit();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnsubmit();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnmissingdoc();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnuploadfile("");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnreceivedqty("");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnbatchdetails("", "", "", "", "");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnnoofcontainers("");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnstoragelocation("");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnvendordoc();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnsubmit();

		grn.grnsubmitok();

		grn.grndashhyp();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		rfq.inrfqtab();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		grn.grnreport();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		mreq.quit();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.quit();

	}

}
