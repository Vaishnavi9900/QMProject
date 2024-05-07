package operationspack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import locatorspack.BillDoc;

@Test
public class billdocopr {

	public void billdoc() throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		BillDoc bill = new BillDoc(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	
		driver.get("http://172.16.5.167/Home/Vendor/");
		
	bill.login();
	
	Thread.sleep(2000);
	
	bill.userid("110001");
	
	Thread.sleep(2000);
	
	bill.password("12");
	
	Thread.sleep(2000);
	
	bill.login();

	Thread.sleep(2000);
	
	//bill.termo();
	
	Thread.sleep(2000);
	
	//bill.vptab();
	
	Thread.sleep(6000);
	
	bill.billdoc();
	
	driver.quit();
		
		
	}
}
