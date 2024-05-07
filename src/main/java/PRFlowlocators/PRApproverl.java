package PRFlowlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PRApproverl {
	
	WebDriver driver;
	
	//*******PR's Pending for Approval*****//
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-portaldashboard/div/div[2]/div/div/div/a[1]/div/div/div")
	
	WebElement prpeap;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary xsBtn'])[1]")
	
	WebElement prapedit;
	
	 public PRApproverl(WebDriver d) {
			
			driver = d;
			
			PageFactory.initElements(d, this);
		
		}
	 
	 public void prpeap() {
		 
		 prpeap.click();
	}
	 
	 public void prapedit() {
		 
		 prapedit.click();
	 }
	
	

}
