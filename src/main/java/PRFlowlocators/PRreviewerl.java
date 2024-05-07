package PRFlowlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PRreviewerl {
	
	WebDriver driver;
	
	//********PR's Pending for Review*******//
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-portaldashboard/div/div[2]/div/div/div[2]/a[1]/div/div/div")
	
	WebElement pefrev;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary xsBtn'])[1]")
	
	WebElement pefrevedit;
	
	@FindBy(xpath = "(//button[text()='Back'])[1]")
	
	WebElement back;
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	
	WebElement revcmts;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	
	WebElement chbox;	
	
	@FindBy(xpath = "//button[text()='OK']")
	
	WebElement chboxok;
	
	@FindBy(xpath = "//input[@type='number']")
	
	WebElement reqtyrev;
	
	@FindBy(xpath = "//button[text()='Reject']")
	
	WebElement revrej;
	
	 public PRreviewerl(WebDriver d) {
			
			driver = d;
			
			PageFactory.initElements(d, this);
		
		}
	 
	 public void pefrev() {
		 
		 pefrev.click();
	 }
	 
	 public void pefrevedit() {
		 
		 pefrevedit.click();
	 }
	 
	 public void back() {
		 
		 back.click();
	 }
	 
	 public void revcmts(String rcmt) {
		 
		 revcmts.sendKeys(rcmt);
	 }
	 
	 public void chbox() {
	
		 chbox.click();
	 }
	 
	 public void chboxok() {
		 
		 chboxok.click();
	 }
	 
	 public void reqtyrev(String rqty) {
		 
		 reqtyrev.clear();
		 
		 reqtyrev.sendKeys(rqty);
	 }
	 
	 public void revrej() {
		 
		 revrej.click();
	 }

}
