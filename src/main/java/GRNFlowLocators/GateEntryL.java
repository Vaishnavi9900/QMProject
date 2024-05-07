package GRNFlowLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GateEntryL {
	
	WebDriver driver;
	
	@FindBy(xpath = "//select[@formcontrolname='invoiceNo']")
	
	WebElement gateinvoiceno;
	
	@FindBy(xpath = "//option[text()='9008007001']")
	
	WebElement gateinvsel;
	
	@FindBy(xpath = "//select[@formcontrolname='vehicleNo']")
	
	WebElement gatevehicleno;
	
	@FindBy(xpath = "//option[text()='AR9865678SS']")
	
	WebElement gatevehiclesel;
	
	@FindBy(xpath = "//button[text()='Get']")
	
	WebElement gateget;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	
	WebElement othervehicleno;
	
	@FindBy(xpath = "//button[text()='Submit ']")
	
	WebElement gatesubmit;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement gatesubmitok;
	
	@FindBy(xpath = "//button[text()=' Back']")
	
	WebElement gateback;
	
	public GateEntryL(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
	}
	
	public void gateinvoiceno(String invno) {
		
		gateinvoiceno.click();
		
		gateinvsel.sendKeys(invno);
	}
	
	public void gatevehicleno(String vehicleno) {
		
		gatevehicleno.click();
		
		gatevehiclesel.sendKeys(vehicleno);
		
	}
	
	public void gateget() {
		
		gateget.click();
		
	}
	
	public void othervehicleno(String othervehno) {
		
		othervehicleno.sendKeys(othervehno);
		
	}
	
	public void gatesubmit() {
		
		gatesubmit.click();
		
		gatesubmitok.click();
	}
	
	public void gateentryback() {
		
		gateback.click();
	}
	


}
