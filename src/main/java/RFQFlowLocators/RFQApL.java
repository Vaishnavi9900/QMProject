package RFQFlowLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RFQApL {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-portaldashboard/div/div[2]/div/div/div[2]/a[1]/div/div/div")
	
	WebElement qcspendingforapp;
	
	public RFQApL(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
	}
	
	public void qcspendingforapp() {
		
		qcspendingforapp.click();
	}
	

}
