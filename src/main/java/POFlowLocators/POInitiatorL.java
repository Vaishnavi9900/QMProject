package POFlowLocators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POInitiatorL {
	
	WebDriver driver;
	
	//************Quotation PO's***********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[1]")
	
	WebElement pocreationtab;
	
	@FindBy(xpath = "(//a[@class='flex-item'])[1]")
	
	WebElement quopotab;
	
	@FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
	
	WebElement quopoedit;
	
	@FindBy(xpath = "//a[@class='btn successBtn ml-3']")
	
	WebElement quoposubmit;
	
	@FindBy(xpath = "//button[text()='OK']")
	
	WebElement popupok;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	
	WebElement quopocheckbox;
	
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	
	WebElement quopocomments;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-poinitiate/section/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td[13]/select")
	
	WebElement quopotransporter;
	
	@FindBy(xpath = "//option[text()=' 114287-OM EXIM']")
	
	WebElement quopotranssel;
	
	@FindBy(xpath = "//a[text()='Delivery Date Schedule']")
	
	WebElement delschedule;
	
	@FindBy(xpath = "//input[@type='number']")
	
	WebElement delscheorderqty;
	
	@FindBy(xpath = "//input[@type='date']")
	
	WebElement delschedeldate;
	
	@FindBy(xpath = "//button[@class='close']")
	
	WebElement delscheduleclose;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	
	WebElement quoanalysisview;
	
	@FindBy(xpath = "//a[text()=' Print Preview ']")
	
	WebElement quopoprintpreview;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement submitok;
	
	//******Initiated PO's******//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[2]")
	
    WebElement initiatedpotab;
	
	@FindBy(xpath = "(//button[@class='btn xsBtn btn-primary'])[1]")
	
	WebElement initiatedpoview;
	
	@FindBy(xpath = "//i[@class='fa fa-commenting']" )
	
	WebElement initiatedpocomsec;
	
	@FindBy(xpath = "//span[@id='approveMin']")
	
	WebElement initiatedpocomseclose;
	
	@FindBy(xpath = "//li[text()='Engineering Revenue']")
	
	WebElement engrevhyperlink;
	
	@FindBy(xpath = "(//li[@class='breadcrumb-item routerLink'])[1]")
	
	WebElement mishyperlink;
	
	//**********Repeat Order ***********//
	
	@FindBy(xpath = "(//a[@class='flex-item'])[2]")
	
	WebElement repeatorderpotab;
	
	@FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
	
	WebElement repeatorderpoedit;
	
	//************Returned PO's**********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[3]")
	
	WebElement returnedpotab;
	
	@FindBy(xpath = "//input[@type='file']")
	
	WebElement supportfile;
	
	//*******Approved PO's**********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[4]")
	
	WebElement approvedpotab;
	
	//********PO Tracking********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[5]")
	
	WebElement potrackingtab;
	
	@FindBy(xpath = "//button[text()=' Back ']")
	
	WebElement potrackingback;
	
	//************Amended PO's********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[6]")
	
	WebElement amendedpotab;
	
	@FindBy(xpath = "//button[text()='Submit']" )
	
	WebElement amendedsubmit;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	
	WebElement amendedunitprice;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	
	WebElement amendedorderqty;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	
	WebElement amendedpackfor;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	
	WebElement amendedfreight;
	
	@FindBy(xpath = "//button[text()='Reject']")
	
	WebElement amendedreject;
	
	//*********AdvancePayment tab*********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[7]")
	
	WebElement advancepamenttab;
	
	@FindBy(xpath = "//a[text()='Manual Advance Payment Request']")
	
	WebElement manualadvpayment;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-advance-payment/div/div[2]/div/div/div/table/tbody/tr[1]/td[7]/a/img")
	
	WebElement manualadvpaymentedit;
	
	@FindBy(xpath = "//select[@class='form-control ng-untouched ng-pristine ng-valid']")
	
	WebElement poadvpercentage;
	
	@FindBy(xpath = "  //option[text()=' 30%']")
	
	WebElement poadvpercentagesel;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-edit-advance-payment/div/div[2]/div/div/div/div[1]/div/table/tbody/tr/td[11]")
	
	WebElement poadvamount;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-edit-advance-payment/div/div[2]/div/div/div/div[1]/div/table/tbody/tr/td[12]")
	
	WebElement poadvremainingamount;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-edit-advance-payment/div/div[2]/div/div/div/div[1]/div/table/tbody/tr/td[8]")
	
	WebElement poadvtotalamount;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-edit-advance-payment/div/div[1]/div/nav/ol/li[3]")
	
	WebElement advhyperlink;
	
	@FindBy(xpath = "//a[text()='Vendor Advance Payment Request']")
	
	WebElement vendoradvpayment;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-advance-payment/div/div[2]/div/div/div/table/tbody/tr[1]/td[7]/a/img")
	
	WebElement vendoradvpaymentedit;
	
	public POInitiatorL(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d,this);
	}
	
	public void pocreationtab() {
		
		pocreationtab.click();
	}
	
	public void quopotab() {
		
		quopotab.click();
		
		quopoedit.click();
	}
	
	public void poedit() {
		
		quopoedit.click();
	}
	
	public void quoposubmitalert() {
		
		quoposubmit.click();
		
		popupok.click();
	}
	
	public void quopocheckbox() {
		
		quopocheckbox.click();
	}
	
	public void quopocomments(String poinicomments) {
		
		quopocomments.click();
		
		quopocomments.sendKeys(poinicomments);
	}
	
	public void quopotransporter() {
		
		quopotransporter.click();
		
		quopotranssel.click();
	}
	
	public void delschedule(String delqty, String deldate) throws InterruptedException {
		
		delschedule.click();
		
		Thread.sleep(2000);
		
		delscheorderqty.click();
		
		delscheorderqty.sendKeys(delqty);
		
		Thread.sleep(2000);
		
		delschedeldate.sendKeys(deldate);
		
		Thread.sleep(2000);
		
		delscheduleclose.click();
		
	}
	
	public void quoanalysisview() throws InterruptedException {
		
	   	  JavascriptExecutor jse = (JavascriptExecutor) driver; 
		
		  jse.executeScript("arguments[0].click();", quoanalysisview);
		  
		  Thread.sleep(2000);
		  
		  delscheduleclose.click();
		  
	}
	
	public void quopoprintpreview() {
		
		quopoprintpreview.click();
		
		driver.close();
	}
	
	public void quoposubmit() {
		
		quoposubmit.click();
		
		submitok.click();
	}
	
	public void initiatedpotab() {
		
		initiatedpotab.click();
		
		initiatedpoview.click();
	
	}
	
	public void initiatedpocomsec() {
		
		initiatedpocomsec.click();
		
		initiatedpocomseclose.click();
	}
	
	public void engrevhyperlink() {
		
		engrevhyperlink.click();
	}
	
	public void mishyperlink() {
		
		mishyperlink.click();
	}
	
	public void repeatorderpotab() {
		
		repeatorderpotab.click();
		
		repeatorderpoedit.click();
	}
	
	public void returnedpotab() {
		
		returnedpotab.click();
	
	}
	
	public void returnfile(String poretfile) {
		
		supportfile.click();
		
		supportfile.sendKeys(poretfile);
	}
	
	public void approvedpotab() {
		
		approvedpotab.click();
	}
	
	public void potrackingtab() throws InterruptedException {
		
		potrackingtab.click();
		
		Thread.sleep(2000);
		
		initiatedpoview.click();
		
		Thread.sleep(2000);
		
		 JavascriptExecutor jse = (JavascriptExecutor) driver; 
			
		 jse.executeScript("arguments[0].click();", potrackingback);
	}
	
	public void amendedpotab() {
		
		amendedpotab.click();
		
		quopoedit.click();
		
	}
	
	public void amendedsubmit() {
		
		amendedsubmit.click();
		
		submitok.click();
	}
	
	public void amendedunitprice(String amunitprice) {
		
		amendedunitprice.click();
		
		amendedunitprice.sendKeys(amunitprice);
	}
	
	public void amendedorderqty(String amorderqty) {
		
		amendedorderqty.click();
		
		amendedorderqty.sendKeys(amorderqty);
	}
	
	public void amendedpackfor(String ampackfor) {
		
		amendedpackfor.click();
		
		amendedpackfor.sendKeys(ampackfor);
	}
	
	public void amendedfreight(String amfreight) {
		
		amendedfreight.click();
		
		amendedfreight.sendKeys(amfreight);
	}
	
	public void amendedreject() {
		
		amendedreject.click();
		
		submitok.click();		
		
	}
	
	public void advancepamenttab() {
		
		advancepamenttab.click();
	}
	
	public void manualadvpayment() {
		
		manualadvpayment.click();
		
		manualadvpaymentedit.click();
		
	}
	
	public void poadvpercentage() {
		
		poadvpercentage.click();
		
		poadvpercentagesel.click();
	}
	
	public void poadvamount(String adv) {
		
		String advamount = poadvamount.getText();
		
		String advremamount = poadvremainingamount.getText();
		
		String totalamount = poadvtotalamount.getText();
		
		String poadvper = poadvpercentagesel.getText();
		
		adv = "(totalamount*poadvper)/100";
		
		String poremianingamount = "totalamount-adv";
		
		if(totalamount.equals(adv)) {
			
			System.out.println(adv);
			
			System.out.println(poremianingamount);
		}
		
		else {
			
			System.out.println("po advance amount is not correct");
		}
		
	}
	
	public void advhyperlink() {
		
		advhyperlink.click();
	}
	
	public void vendoradvpayment() {
		
		vendoradvpayment.click();
		
		vendoradvpaymentedit.click();
	}
	
	public void vendoradvsubmit() {
		
		quopocheckbox.click();
		
		quoposubmit();
	}
	
	
	
	
			
			
			
	
	
	
	

}
