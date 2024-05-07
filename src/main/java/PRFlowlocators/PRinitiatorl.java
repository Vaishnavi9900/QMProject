package PRFlowlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PRinitiatorl {
	
WebDriver driver;
	
	//******Requested Cart********//
	
	@FindBy(xpath = "//div[text()=' Requested Cart ']")
	
	WebElement reqcart;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary xsBtn'])[1]")
	
	WebElement edit;
	
	@FindBy(xpath = "//i[@class='fa fa-commenting']")
	
	WebElement comment;
	
	@FindBy(xpath = "//span[@id='approveMin']")
	
	WebElement cmclose;
	
	@FindBy(xpath = "//button[text()=' Submit ']" )
	
	WebElement mrsubmit;
	
	@FindBy(xpath = "//input[@type='date']")
	
	WebElement deldate;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	
	WebElement unit;
	
	@FindBy(xpath = "//span[text()=' Please enter Unit Value ']")
	
	WebElement unitalert;
	
	@FindBy(xpath = "//textarea[@type='text']")
	
	WebElement adspecup;
	
	@FindBy(xpath = "//input[@type='file']")
	
	WebElement adspecfileup;
	
	@FindBy(xpath = "//button[text()='Reject']")
	
	WebElement reject;
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	
	WebElement rejcmts;
	
	@FindBy(xpath = "//button[text()='Submit']")
	
	WebElement rejsub;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement rejok;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement subok;
	
	//********PR Initiation**********//
	
	@FindBy(xpath = "//div[text()=' Purchase Requsitions  ']")
	
	WebElement prstab;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	
	WebElement prpur;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	
	WebElement prreqqty;
	
	@FindBy(xpath = "(//input[@type='text'])[12]")
	
	WebElement pradspec;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	
	WebElement unitval; 
	
	@FindBy(xpath = "//span[text()=' Please enter Unit Value ']")
	
	WebElement unitvalalert;
	
	@FindBy(xpath = "//td[text()='0']")
	
	WebElement totval;
	
	@FindBy(xpath = "(//input[@type='text'])[12]")
	
	WebElement prspec;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-portaldashboard/div/div[2]/div/div/div[2]/a[2]/div/div/div")
	
	WebElement apprstab;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-portaldashboard/div/div[2]/div/div/div[2]/a[4]/div/div/div")
	
	WebElement rejprtab;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-purchase-requisition/section/div[2]/div[1]/div/nav/ol/li[2]")
	
	WebElement mishyper;
	
	 public PRinitiatorl(WebDriver d) {
			
			driver = d;
			
			PageFactory.initElements(d, this);
		
		}
	
	public void reqcart() {
		
		reqcart.click();
	}

	public void edit() {
		
		edit.click();
	}
	
	public void commentsection() {
		
		comment.click();
		
		cmclose.click();
	}
	
	public void mrsubmit() {
		
		mrsubmit.click();
	}
	
    public void deldate(String date) throws InterruptedException {
    	
 
	   deldate.sendKeys(date);
    }
    
    public void uni(String val) throws InterruptedException {
    	
    	
      if(totval.isDisplayed()){
    	  
    	  
       	  unitval.click();
    	  
    	    unitval.clear();
    	    
    	    Thread.sleep(2000);
    		
    		unitval.sendKeys(val);
    		
    	}
    	else {
    		
    	System.out.println(unitval.getText());
    	}
    }
    public void adspecup(String adspec) {
    	
    	adspecup.clear();
    	
    	adspecup.sendKeys(adspec);
    }
    
    public void adspecfileup(String adfile) {
    	
    	adspecfileup.sendKeys(adfile);
    }
    
    public void reject(String cmts) {
    	
    	reject.click();
    	
    	rejcmts.sendKeys(cmts);
    }
    
    public void rejsub() {
    	
    	rejsub.click();
    	
    	rejok.click();
    }
    
    public void subok() {
    	
    	subok.click();
    }
    
    public void prstab() {
    	
    	prstab.click();
    }
    
    public void unitval(String punit) {
    	
    	if(unitval.getText().isEmpty()) {
    		
    		unitval.clear();
    	
    		unitval.sendKeys(punit);		
    	}
    	else {
    		
    		unitval.getText();
    	}
    	
    }
    
    public void prspec(String pspec) {
    	
    	prspec.sendKeys(pspec);
    }
    
    public void apprstab() {
    	
    	apprstab.click();
    }
    
    public void rejprtab() {
    	
    	rejprtab.click();
    }
    
    public void prpur(String pur) {
    	
    	prpur.click();
    	
    	prpur.sendKeys(pur);
    }
    
    public void prreqqty(String reqqty) {
    	
    	prreqqty.click();
    	
    	prreqqty.sendKeys(reqqty);
    }
    
    public void pradspec(String adspec) {
        	
    	pradspec.sendKeys(adspec);
    }
    
  
    
}
