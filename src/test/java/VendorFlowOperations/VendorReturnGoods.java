package VendorFlowOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.VendorL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VendorReturnGoods {

	@Test
	public void ReturnGoods() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		MaterialReql mreq = new MaterialReql(driver);

		PRinitiatorl prin = new PRinitiatorl(driver);

		RFQInitiator rfq = new RFQInitiator(driver);

		VendorL vend = new VendorL(driver);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://172.16.5.167/Registration/Vendor/");

		vend.vendorlogin("", "12345");
		
		Thread.sleep(2000);
		
		vend.returngoodstab();
		
		Thread.sleep(4000);
		
		mreq.quit();
		
		driver.quit();
	}

}
