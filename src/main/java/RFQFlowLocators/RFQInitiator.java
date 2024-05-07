package RFQFlowLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RFQInitiator {
	
	WebDriver driver;
	
	//***********RFQ Received PR's******//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[1]")
	
	WebElement recprtab;
	
	@FindBy(xpath = "(//a[@class='flex-item'])[1]")
	
	WebElement reqfquottab;
	
	@FindBy(xpath = "(//button[text()='Raise RFQ '])[1]")
	
	WebElement raiserfq;
	
	@FindBy(xpath = "//button[text()='Submit']")
	
	WebElement submit;
	
	@FindBy(xpath = "//button[text()='OK']")
	
	WebElement popok;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	
	WebElement chbox;
	
	@FindBy(xpath = "//a[text()='Vendors-List']")
	
	WebElement vendorlist;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	
	WebElement vlistchbox;
	
	@FindBy(xpath = "//button[@class='close']")
	
	WebElement vlistclose;
	
	@FindBy(xpath = "//*[@id=\"WorkFlow\"]/div/div[1]/div/table/tbody/tr/td[5]/span/select")
	
	WebElement tax;
	
	@FindBy(xpath = "//option[text()=' GI ']")
	
	WebElement taxsele;
	
	@FindBy(xpath = "//*[@id=\"WorkFlow\"]/div/div[1]/div/table/tbody/tr/td[8]/span/select")
	
	WebElement uomco;
	
	@FindBy(xpath = "//option[text()=' SET ']")
	
	WebElement uomcosele;
	
	@FindBy(xpath = "(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	
	WebElement termofdel;
	
	@FindBy(xpath = "//option[text()=' Delivered Duty Paid ']")
	
	WebElement termofdelsel;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	
	WebElement matspec;
	
	@FindBy(xpath = "//button[@title='View']")
	
	WebElement matview;
	
	@FindBy(xpath ="//button[@class='close'] ")
	
	WebElement matviewclose;
	
	@FindBy(xpath = "//input[@type='date']")
	
	WebElement rfqenddate;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement subok;
	
	//*****Repeat Order **************//
	
	@FindBy(xpath = "(//a[@class='flex-item'])[2]")
	
	WebElement repeatordertab;
	
	@FindBy(xpath = "//button[@title='Edit']")
	
	WebElement repeatedit;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	
	WebElement revendlistchbox;
	
	@FindBy(xpath = "//*[@id=\"WorkFlow\"]/div/div[1]/div/table/tbody/tr/td[8]/select")
	
	WebElement baseuom;
	
   @FindBy(xpath = "//*[@id=\"WorkFlow\"]/div/div[1]/div/table/tbody/tr/td[6]")
	
	WebElement reqqty;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")
	
	WebElement vendor1appqty1;
	
	@FindBy(xpath = "//input[@type='number'])[2]")
	
	WebElement vendor1appqty2;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	
	WebElement vendor1pacfor;
	
	//  //*[@id="myModal"]/div/div/div[2]/div/div/table/tbody/tr[2]/td[8]/input  vendor2pack
	
	//   //*[@id="myModal"]/div/div/div[2]/div/div/table/tbody/tr[3]/td[8]/input vendor3pack
	
	@FindBy(xpath = "(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")
	
	WebElement vendor1trans;
	
	//  //*[@id=\"myModal\"]/div/div/div[2]/div/div/table/tbody/tr[2]/td[9]/select vendor2trans
	
	@FindBy(xpath = "//option[text()=' 114287-OM EXIM ']")
	
	WebElement vendorltranssel;
	
	//  //*[@id="myModal"]/div/div/div[2]/div/div/table/tbody/tr[2]/td[9]/select/option[3] vendor2trnssel
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	
	WebElement vendor1freight;
	
	// //*[@id="myModal"]/div/div/div[2]/div/div/table/tbody/tr[2]/td[10]/input  repefeight2
	
	
	//*********Annual Rate Contract(ARC)*********//
	
	@FindBy(xpath = "(//a[@class='flex-item'])[3]")
	
	WebElement arctab;
	
	@FindBy(xpath = "(//button[@class='btn xsBtn'])[1]")
	
	WebElement arcedit;
	
	// (//button[@class='btn xsBtn'])[2]
	
	@FindBy(xpath = "//a[text()=' Submit ']")
	
	WebElement arcsubmit;
	
	@FindBy(xpath = "//a[text()=' Print Preview ']")
	
	WebElement arcprintprev;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	
	WebElement arcchckbox;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-arcinitiate/section/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td[8]/select")
	
	WebElement arctax;
	
	@FindBy(xpath = "//a[text()='Delivery Date Schedule']")
	
	WebElement arcdelsch;
	
	@FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div/table/tbody/tr/td[2]/input")
	
	WebElement arcdelschqty;
	
	@FindBy(xpath = "//input[@type='date']")
	
	WebElement arcdeldate;
	
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	
	WebElement arcdeldateadd;
	
	@FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div/table/tbody/tr/td[5]/button[2]")
	
	WebElement arcdeldateremove;
	
	@FindBy(xpath = "//button[@class='close']")
	
	WebElement arcdelschclose;
	
	@FindBy(xpath = "(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	
	WebElement arcpaymentterms;
	
	@FindBy(xpath = "//option[text()=' 45 Days Credit ']")
	
	WebElement arcpaymenttermsel;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	
	WebElement arcmaterialspec;
	
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	
	WebElement arccomments;
	
	//***********Original Equipment Manufacturer(OEM)******//
	
	@FindBy(xpath = "(//a[@class='flex-item'])[4]")
	
	WebElement oemtab;
	
	//***********Initiated RFQ List********//  
	
	@FindBy(xpath = "(//div[@class='flex-item'])[2]")
	
	WebElement inrfqtab;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-request-for-quotation/div/div[1]/div/nav/ol/li[3]")
	
	WebElement inrfqhyp;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-rfqtable-list/section/div/div[1]/div/nav/ol/li[2]")
	
	WebElement mishhyp;
	
	//**********Open RFQ List*******//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[4]")
	
	WebElement oprfqtab;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[6]")
	
	WebElement vchckbox;
	
	//************Received Quotations********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[3]")
	
	WebElement recquotab;
	
	@FindBy(xpath = "(//button[@title='Edit'])[1]")
	
	WebElement recedit;
	
	@FindBy(xpath = "(//h3[@data-toggle='collapse'])[1]")
	
	WebElement plantstock;
	
	@FindBy(xpath = "(//h3[@data-toggle='collapse'])[2]")
	
	WebElement groupstock;
	
	@FindBy(xpath = "(//h3[@data-toggle='collapse'])[3]")
	
	WebElement qcss;
	
	@FindBy(xpath = "//button[text()='Print Preview']")
	
	WebElement printprev;
	
	@FindBy(xpath = "//button[text()='Back']")
	
	WebElement rfqprintprevback;
	
	@FindBy(xpath = "//button[text()='ReQuotation']")
	
	WebElement requotation;
	
	@FindBy(xpath = "//textarea[@type='text']")
	
	WebElement rfqinicomments;
	
	//*********Approved QCS**********//
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-portaldashboard/div/div[2]/div/div/div[2]/a[5]/div")
	
	WebElement appqcs;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	
	WebElement apqcsview;
	
	@FindBy(xpath = "//span[text()='RFQ Approved']")
	
	WebElement apqcsstatus;
	
	//*********Closed Quotations**********//
	
	@FindBy(xpath = "(//div[@class='flex-item'])[6]")
	
	WebElement closedquotab;
	
	
	public RFQInitiator(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
		
	}
	

	public void recprtab() {
		
		recprtab.click();
		
}
	
	public void reqfquottab() {
		
		reqfquottab.click();
	}
	
	public void raiserfq() {
		
		raiserfq.click();
	}
	
	public void submit() {
		
		submit.click();
	}
	
	public void popok() {
		
		popok.click();
	}
	
	public void chbox() {
		
		chbox.click();
	}
	
	public void reqvendorlist() {
		
		vendorlist.click();
		
		vlistchbox.click();
		
		vlistclose.click();
	}
	
	public void tax() {
		
		tax.click();
		
		taxsele.click();
	}
	
	public void uomco() {
		
		uomco.click();
		
		uomcosele.click();
	}
	
	public void Termodel() {
		
		termofdel.click();
		
		termofdelsel.click();
	}
	
	public void matspec(String mtspec) {
		
    matspec.click();
    
    matspec.sendKeys(mtspec);
	}
	
	public void mtview() {
		
		matview.click();
		
		matviewclose.click();
	}
	
	public void rfqenddate(String rfqdate) {
		
		rfqenddate.click();
		
		rfqenddate.sendKeys(rfqdate);
		
	}
	
	public void subok() {
		
		subok.click();
		
	}
	
	public void repeatordertab() {
		
		repeatordertab.click();
		
		repeatedit.click();
	}
	
	public void baseuom() {
		
		baseuom.click();
	}
	
	public void vendor1pacfor(String packfor) {
		
		vendor1pacfor.click();
		
		vendor1pacfor.sendKeys(packfor);
		
	}
	
	public void vendor1trans() {
		
		vendor1trans.click();
		
		vendorltranssel.click();
	}
	
	public void vendor1freight(String freight) {
		
		vendor1freight.click();
		
		vendor1freight.sendKeys(freight);
	}
	
	//***************ARC TAB*******//
	
	public void arctab() {
		
		arctab.click();
		
		arcedit.click();
	}
	
	public void arcsubmit() {
		
		arcsubmit.click();
	
	}
	
	public void arcprintprev() {
		
		arcprintprev.click();
		
	}
	public void arcchckbox() {
		
		arcchckbox.click();
	}
	public void arctax() {
		
		arctax.click();
		
		taxsele.click();
			
	}
	
	public void arcdelsch(String delqty, String deldate) throws InterruptedException {
		
		arcdelsch.click();
		
		arcdelschqty.click();
		
		arcdelschqty.sendKeys(delqty);
		
		Thread.sleep(2000);
		
		arcdeldate.sendKeys(deldate);
		
		arcdelschclose.click();
		
	}
	
	public void arcdeldateadd() {
		
		arcdeldateadd.click();
	}
	
	public void arcdeldateremove() {
		
		arcdeldateremove.click();
	}
	
	public void arcpaymentterms() {
		
		arcpaymentterms.click();
		
		arcpaymenttermsel.click();
	}
	
	public void arcmaterialspec(String matspec) {
		
		arcmaterialspec.click();
		
		arcmaterialspec.sendKeys(matspec);
	}
	
	public void arccomments(String arccomm) {
		
		arccomments.click();
		
		arccomments.sendKeys(arccomm);
	}
	
	public void oemtab() {
		
		oemtab.click();
		
		arcedit.click();
	}
	
	public void inrfqtab() {
		
		inrfqtab.click();
	}
	
	public void inrfqhyp() {
		
		inrfqhyp.click();
	}
	
	public void mishhyp() {
		
		mishhyp.click();
	}
	
	public void oprfqtab() {
		
		oprfqtab.click();
		
		raiserfq.click();
	
	}
	
	public void openrfqvchckbox() {
		
		vchckbox.click();
	}
	
	public void recquotab() {
		
		recquotab.click();
		
		recedit.click();
	}
	
	public void plantstock() {
		
		plantstock.click();
	}
	
	public void groupstock() {
		
		groupstock.click();
	}
	
	public void qcss() {
		
		qcss.click();
	}
	
	public void printprev() throws InterruptedException {
		
		printprev.click();
		
		Thread.sleep(2000);
		
		rfqprintprevback.click();
		
	}
	
	public void requotation() {
		
		requotation.click();
	}
	
	public void rfqinicomments(String rfqcom) {
		
		rfqinicomments.click();
		
		rfqinicomments.sendKeys(rfqcom);
	}
	
	public void appqcstab() throws InterruptedException {
		
		appqcs.click();
		
		apqcsview.click();
		
		Thread.sleep(2000);
		
		apqcsstatus.click();
	}
	
	public void closedquotab() {
		
		closedquotab.click();
	}
	
	public void revendlistchbox() {
		
		revendlistchbox.click();
	}
}