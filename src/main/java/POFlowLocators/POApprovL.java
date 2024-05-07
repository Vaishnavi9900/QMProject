package POFlowLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POApprovL {
	
	WebDriver driver;
	
	//*******Pending PO's Approval********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[1]")
	
	WebElement pendingpoapp;
	
	@FindBy(xpath = "//a[text()='Last PO Details']")
	
	WebElement lastpodetails;
	
	@FindBy(xpath = "//a[text()=' PO Return ']")
	
	WebElement poreturn;
	
	public POApprovL(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
	}
	
	public void pendingpoapp() {
		
		pendingpoapp.click();
		
	}
	
	public void lastpodetails() {
		
		lastpodetails.click();
	}
	
	public void poreturn() {
		
		poreturn.click();
	}
	

}
