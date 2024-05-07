package PRFlowlocators;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import locatorspack.BillDoc;

public class MaterialReql{
	
	WebDriver driver;
	
	//**********Shopping Cart*****//
	
	 @FindBy(xpath = "//input[@placeholder='User ID']")

     WebElement userid;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	
	WebElement password;
  		
	@FindBy(xpath = "//button[text()='Login']")
	
	WebElement login;
	
	 @FindBy(xpath = "//p[text()='Termination']")
  
	   WebElement termm;
	   
	   @FindBy(xpath = "//button[text()='Terminate Other Login']")

	   
	   WebElement termotherr;
	
	   @FindBy(xpath = "(//a[@class='flex-item'])[1]")
	   
	   WebElement eng;
	   
	   @FindBy(xpath = "//div[@id='ae9e04aaed50-1']")
	   
	   WebElement engmat;
	   
	   
	@FindBy(xpath = "(//a[@class='flex-item'])[2]")
	
	WebElement mis;
	
	@FindBy(xpath = "//div[text()=' Shopping Cart ']")
	
	WebElement shcart;
	
	@FindBy(xpath = "//button[@class='btn successBtn'] ")
	
	WebElement add;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	
	WebElement mdes;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	
	WebElement mdeso;
	
    @FindBy(xpath = "(//div[@role='option'])[5]")
	
	WebElement mdeso1;
	
	@FindBy(xpath ="(//input[@type='text'])[4]")
	
	WebElement pur;
	
	@FindBy(xpath = "//input[@type='']")
	
	WebElement reqqty;
	
	@FindBy(xpath = "//textarea[@type='text']")
	
	WebElement adspec;
	
	@FindBy(xpath = "//input[@type='file']")
	
	WebElement adspecfile;
	
	@FindBy(xpath = "//button[text()='Yes']")
	
	WebElement yes;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	
	WebElement view;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[3]")
	
	WebElement viewfile;
	
	@FindBy(xpath = "//button[@class='close']")
	
	WebElement close;
	
	@FindBy(xpath = "//button[text()='Submit']")
	
	WebElement submit;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement ok;
	
	@FindBy(xpath = "//span[@class='avatarIcon']")
	
	WebElement profile;
	
	@FindBy(xpath = "//a[text()=' Quit']")
	
	WebElement quit;
	
	@FindBy(xpath = "//a[text()='Yes']")
	
	WebElement qyes;
	
	//********Approved Cart***********//
	
	@FindBy(xpath = "//div[text()=' Approved Cart ']")
	
	WebElement apcarttab;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	
	WebElement apview;
	
	@FindBy(xpath = "//td[text()=' 5130231 ']")
	
	WebElement mttcode;
	
	@FindBy(xpath = "//td[text()='  PR Approved ']")
	
	WebElement apstatus;
	
	//********Rejected Cart*******//
	
	@FindBy(xpath = "//div[text()=' Rejected Cart ']")
	
	WebElement rejcarttab;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary xsBtn'])[1]")
	
	WebElement mrejview;
	
	@FindBy(xpath = "//th[text()='Status']")
	
	WebElement rejstatus;
	
	@FindBy(xpath = "//td[text()=' Rejected at PR Initiator ']")
	
	WebElement rejstsini;
	
	@FindBy(xpath = "//td[text()=' Rejected at Warehouse Reviewer ']")
	
	WebElement rejstsrev;
	
	@FindBy(xpath = "//td[text()=' Rejected at Plant Approver ']")
	
	WebElement rejstsap;
	
	
	 public MaterialReql(WebDriver d) {
			
			driver = d;
			
			PageFactory.initElements(d, this);
		
		}
	 
//	// public void userid(String id) {
//		 
//		userid.click();
//		
//		userid.sendKeys(id);
//	 }
//	 
//	 public void password(String pass) {
//		 
//		 password.click();
//		 
//		 password.sendKeys(pass);
//	 }
//	 
//	 public void login() {
//		
//		 login.click();
//	 }
	 
	 public  void login(String id, String pass) throws InterruptedException {
		 
		 userid.click();
		 
		 userid.sendKeys(id);
		 
		 Thread.sleep(2000);
		 
		 password.click();
		 
		 password.sendKeys(pass);
		 
		 Thread.sleep(2000);
		 
		 login.click();
		 
	 }
	 
	 
	 public void mis() {
			   
				//if(termm.isDisplayed()) {
					
				//	termotherr.click();
		//		}
				
		//		else{
		// JavascriptExecutor jse = (JavascriptExecutor) driver;
		 
		// jse.executeScript("arguments[0].click", mis);
					
					mis.click();
		//		}		 
			
	 }
	 public void shcart() {
		 
		 shcart.click();
	 }

	 public void add() {
		 
		 add.click();
	 }
	 
	public void mdes() throws InterruptedException {
		
		mdes.click();
		
		Thread.sleep(2000);
		
		mdeso.click();
		
	}
	
	public void mdeso1() {
		
		mdes.click();
		
		mdeso1.click();
	}
	
	public void pur(String puri){
		
		pur.click();
		pur.sendKeys(puri);		
	}
	
	public void reqqty(String qty) {
		
		reqqty.click();
		
		reqqty.sendKeys(qty);
	}
	
	public void adspec(String spec) {
		
		adspec.click();
		
		adspec.clear();
		
		adspec.sendKeys(spec);
	}
	
	public void adspecfile(String file) {
		
		adspecfile.sendKeys(file);
	
}
	
	public void yes() {
		
		yes.click();
	}
	
	public void view() {
		
		view.click();
		
		viewfile.click();
		
	}
	
	public void close() {
		
		close.click();
	}
	
	public void submit() {
		
		submit.click();
		
	}
	
	public void ok() {
		
		ok.click();
	}
	
	public void quit() throws InterruptedException {
		
		profile.click();
		
		Thread.sleep(2000);
		
		quit.click();
		
		Thread.sleep(2000);
		
		qyes.click();
	}
	public void apcarttab() {
		
		apcarttab.click();
	}
	
	public void apview() {
		
		apview.click();
	}
	
	public void mttcode() {
		
		mttcode.click();
		
		mttcode.isDisplayed();
		
	}
	
	public void rejcarttab() throws InterruptedException {
		
		rejcarttab.click();
		
		Thread.sleep(2000);
		
		mrejview.click();
	}
	
	public void rejsts(){
				
		if(rejstsini.isDisplayed()) {
			
			System.out.println("PR Rejected at PR Initiator");
			
		}
		
	
		else if(rejstsrev.isDisplayed()) {
			
			System.out.println("PR Rejected at PR Reviewer");
			
		}

		else if(rejstsap.isDisplayed()){
		
			System.out.println("PR Rejected at PR Approver");
		
		}
			}
	
	public void eng() {
		
		eng.click();
	}

	
}
