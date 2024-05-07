package RFQFlowLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RFQRevL {
	
    WebDriver driver;
    
    //********QCS Pending for Approval*****//
    
    @FindBy(xpath = "/html/body/app-root/div/div/app-portaldashboard/div/div[2]/div/div/div[2]/a[1]/div/div")
    
    WebElement qcspendingapp;
    
    @FindBy(xpath = "(//input[@type='number'])[1]")
    
    WebElement qcsrevappqty1;
    
   @FindBy(xpath = "(//input[@type='number'])[2]")
   
   WebElement qcsrevappqty2;
    
    public RFQRevL(WebDriver d) {
    	
    	driver = d;
    	
    	PageFactory.initElements(d, this);
    }
    
    public  void qcspendingapp() {
    	
    	qcspendingapp.click();
    }
    
    public void qcsrevappqty1(String appqty1) {
    	
    	qcsrevappqty1.click();
    	
    	qcsrevappqty1.sendKeys(appqty1);
    }
    
 public void qcsrevappqty2(String appqty2) {
    	
    	qcsrevappqty2.click();
    	
    	qcsrevappqty2.sendKeys(appqty2);
    }
    
    
	

}
