package VendorFlowOperations;

import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DataProviderpack.BaseClass;
import DataProviderpack.RFQDataProv;
import PRFlowlocators.MaterialReql;
import PRFlowlocators.PRinitiatorl;
import RFQFlowLocators.RFQInitiator;
import RFQFlowLocators.VendorL;


public class OpenRFQ extends BaseClass {

@Test(dataProvider = "openrfq", dataProviderClass = RFQDataProv.class)
public void vendoropenrfq(String Vendor, String Password, String dleleadtime,String qprice, String disprice, String packforw, String freight, String paymentother, String warranty) {

			MaterialReql mreq = new MaterialReql(driver);

			PRinitiatorl prin = new PRinitiatorl(driver);

			RFQInitiator rfq = new RFQInitiator(driver);

			VendorL vend = new VendorL(driver);
			
			driver.get("http://172.16.5.167/Registration/Vendor/");

			try {
				vend.vendorlogin(Vendor, Password);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				vend.openrfqtab();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			vend.vsubmit();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			vend.valistsubok();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			vend.vchckbox();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			vend.delleadtime(dleleadtime);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			vend.quotedprice(qprice);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			vend.discountedprice(disprice);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			vend.packndfor(packforw);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			vend.freight(freight);

			// vend.vpaymentterms();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			try {
				vend.paymentother(paymentother);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			vend.warranty(warranty);	
		   
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//	vend.actionview();
			
			//switchToNEWwindow();
			
			vend.vendorfinalsubmit();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			vend.subquotab();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			vend.mtcode();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			try {
				mreq.quit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


}
}

