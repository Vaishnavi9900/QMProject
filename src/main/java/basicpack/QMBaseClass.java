package basicpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QMBaseClass {
	
public static WebDriver driver;

@BeforeMethod
public void browserlogin() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://172.16.5.89/QMSpectrum/Production/");
	
}

public void quit() {
	
	driver.quit();
}

}


