package RFQFlowLocators;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorL {
	
	WebDriver driver;
	
	//***********Open RFQ's****************//
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	
	WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")
	
	WebElement vlogin;
	
	@FindBy(xpath = "/html/body/app-root/div/app-vendor-dashboard/section/div/div[2]/div/div/div[2]/div/div/a[1]/div")
	
	WebElement openrfqtab;
	
	@FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
	
	WebElement vpenrfqedit;
	
	@FindBy(xpath = "//a[text()=' Submit ']")
	
	WebElement vsubmit;
	
	@FindBy(xpath = "//button[text()='OK']")
	
	WebElement valistsubok;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	
	WebElement vchckbox;
	
	@FindBy(xpath = "//input[@type='date']")
	
	WebElement delleadtime;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	
	WebElement quoprice;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	
	WebElement disprice;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	
	WebElement packndfor;
			
	@FindBy(xpath = "(//input[@type='text'])[7]")
	
	WebElement freight;
	
	@FindBy(xpath = "//*[@id=\"WorkFlow\"]/div/div[1]/div/table/tbody/tr/td[12]")
	
	WebElement cgst;
	
	@FindBy(xpath = "//*[@id=\"WorkFlow\"]/div/div[1]/div/table/tbody/tr/td[13]")
	
	WebElement sgst;
	
	@FindBy(xpath = "//*[@id=\"WorkFlow\"]/div/div[1]/div/table/tbody/tr/td[14]")
	
	WebElement igst;
	
	@FindBy(xpath = "//a[text()='Back']")
	
	WebElement vendorback;
	
	@FindBy(xpath = "(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")
	
	WebElement vpaymentterms;
	
	@FindBy(xpath = "//option[text()=' 60 Days PDC ']")
	
	WebElement vpaymenttermsele;
	
	@FindBy(xpath = "//option[text()='Others']")
	
	WebElement paymentother;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	
	WebElement paymentothinout;
	
	@FindBy(xpath = "//textarea[@type='text']" )
	
	WebElement warranty;
	
	@FindBy(xpath = "//button[@title='View']")
	
	WebElement actionview;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[2]")
	
	WebElement pdfview;
	
	@FindBy(xpath = "//button[@class='close']")
	
	WebElement  vactionclose;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement vfsubok;
	
	@FindBy(xpath = "//td[text()='5108312']")
	
	WebElement rfqmtcode;
	
	//************Submitted Quotations**********//
	
	@FindBy(xpath = "/html/body/app-root/div/app-vendor-dashboard/section/div/div[2]/div/div/div[2]/div/div/a[2]/div/div/div")
	
	WebElement subquotab;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	
	WebElement subview;
	
	@FindBy(xpath = "//td[text()=' 5125213 ']")
	
	WebElement submtcode;
	
	@FindBy(xpath = "/html/body/app-root/div/app-vendor-quotations/div/div[1]/div/nav/ol/li[2]")
	
	WebElement subquohyp;
	
	@FindBy(xpath = "/html/body/app-root/div/app-open-quotations/div/div[1]/div/nav/ol/li[1]/a")
	
	WebElement dashhyp;
	
	//********Approved PO's************//
	
	@FindBy(xpath = "/html/body/app-root/div/app-vendor-dashboard/section/div/div[2]/div/div/div[2]/div/div/a[3]/div/div/div")
	
	WebElement apppotab;
	
	@FindBy(xpath = "(//span[text()=' New '])[1]")
	
	WebElement vendorappstatus;
	
	@FindBy(xpath = "//a[text()='Delivery Date Schedule']")
	
	WebElement deldateschyp;
	
	@FindBy(xpath = "//button[@class='close']")
	
	WebElement delsclose;
	
	@FindBy(xpath = "//button[text()=' Accept PO ']")
	
	WebElement acceptpo;
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	
	WebElement cancelpo;
	
	@FindBy(xpath = "//textarea[@formcontrolname='message']")
	
	WebElement messagetopur;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement vappfinalok;
	
	//************ASN***********//
	
	@FindBy(xpath = "/html/body/app-root/div/app-vendor-dashboard/section/div/div[2]/div/div/div[2]/div/div/a[4]/div/div/div")
	
	WebElement asntab;
	
	@FindBy(xpath = "//button[text()='Submit']")
	
	WebElement asnsubmit;
	
	@FindBy(xpath = "//input[@formcontrolname='invoiceDCNo']")
	
	WebElement invnumber;
	
	@FindBy(xpath = "//input[@formcontrolname='invoiceDate']")
	
	WebElement invdate;
	
	@FindBy(xpath = "//select[@formcontrolname='modeOfTransport_Id']")
	
	WebElement modeoftransport;
	
	@FindBy(xpath = "//option[text()='By Airway']")
	
	WebElement modeoftransel;
	
	//  //option[text()='By Rail'] and //option[text()='By Road']
	
	@FindBy(xpath = "//input[@formcontrolname='eWayBillNo']")
	
	WebElement ewaybillnumber;
	
	@FindBy(xpath = "//input[@formcontrolname='eWayBillDate']")
	
	WebElement ewaybilldate;
	
	@FindBy(xpath = "//select[@formcontrolname='billDocumentType_Id']")
	
	WebElement doctype;
	
	@FindBy(xpath = "//option[text()='Invoice Bill ']")
	
	WebElement doctypesel;
	
	// //option[text()='E-Way Bill ']
	
	@FindBy(xpath = "//input[@formcontrolname='attachments']")
	
	WebElement attachments;
	
	@FindBy(xpath = "//button[@class='btn xsBtn btn-primary']")
	
	WebElement doctypeview;
	
	@FindBy(xpath = "//button[@class='btn xsBtn btn-danger mx-1']")
	
	WebElement doctyperemove;
	
	@FindBy(xpath = "//button[text()='Add']")
	
	WebElement add;
	
	@FindBy(xpath = "//input[@formcontrolname='lRNo']")
	
	WebElement lrno;
	
	@FindBy(xpath = "//input[@formcontrolname='transporterName']")
	
	WebElement transporter;
	
	@FindBy(xpath = "//input[@formcontrolname='vehicleNo']")
	
	WebElement vehicleno;
	
	@FindBy(xpath = "//input[@formcontrolname='grossWeight']")
	
	WebElement grossweight;
	
	@FindBy(xpath = "//select[@formcontrolname='grossWeightUOM_Id']")
	
	WebElement grosswuom;
	
	@FindBy(xpath = "(//option[text()=' Kilogram'])[1]")
	
	WebElement grossuomsel;

	@FindBy(xpath = "//input[@formcontrolname='chargeableWeight']")
	
	WebElement chargeableweight;
	
	@FindBy(xpath = "//select[@formcontrolname='chargeableWeightUOM_Id']")
	
	WebElement charwuom;
	
    @FindBy(xpath = "(//option[text()=' Kilogram'])[2]")
	
	WebElement charwuomsel;
    
    @FindBy(xpath = "//input[@type='number']")
    
    WebElement invqty;
    
    @FindBy(xpath = "(//input[@type='text'])[15]")
	
    WebElement grossweight1;
    
    @FindBy(xpath = "/html/body/app-root/div/app-advance-shipment-notification/div/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[11]/select")
    
    WebElement grossuom1;
    
    @FindBy(xpath = "//textarea[@formcontrolname='comments']")
    
    WebElement comments;
	
    @FindBy(xpath = "/html/body/app-root/div/app-advance-shipment-notification/div/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[5]")
    
    WebElement poqty;
    
    @FindBy(xpath = "/html/body/app-root/div/app-advance-shipment-notification/div/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[16]")
    
    WebElement totalamount;
    
    @FindBy(xpath = "/html/body/app-root/div/app-advance-shipment-notification/div/div[2]/div/div/div/div/div/div[3]/div/table/tbody/tr/td[17]")
    
    WebElement invamount;
    
    @FindBy(xpath = "//input[@formcontrolname='asnNo']")
    
    WebElement asnnumber;
    
    //*************Approved Invoice*********//
    
    @FindBy(xpath = "/html/body/app-root/div/app-vendor-dashboard/section/div/div[2]/div/div/div[2]/div/div/a[5]/div" )
    
    WebElement apprinvtab;
    
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]")
    
    WebElement apinvnumber;
    
    //**********Advance Payment*********//
    
    @FindBy(xpath = "/html/body/app-root/div/app-vendor-dashboard/section/div/div[2]/div/div/div[2]/div/div/a[7]/div/div")
    
    WebElement advpaymenttab;
    
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[7]/a/img")
    
    WebElement advedit;
    
    @FindBy(xpath = "//input[@value='1']")
    
    WebElement singleadv;
    
    @FindBy(xpath = "//input[@value='2']")
    
    WebElement multyadv;
	
	@FindBy(xpath = "//input[@type='date']")
	
	WebElement advpaydate;
	
	@FindBy(xpath = "/html/body/app-root/div/app-edit-advance-payment/div/div[2]/div/div/div/div[1]/div/table/tbody/tr/td[10]/select")
	
	WebElement advpaypercentage;
	
	@FindBy(xpath = "//option[text()=' 10%']")
	
	WebElement advpaypersel;
	
	// //option[text()=' 20%']  //option[text()=' 30%']
	
	@FindBy(xpath = "/html/body/app-root/div/app-edit-advance-payment/div/div[2]/div/div/div/div[1]/div/table/tbody/tr/td[8]")
	
	WebElement vadvtotalamount;
	
	@FindBy(xpath = "/html/body/app-root/div/app-edit-advance-payment/div/div[2]/div/div/div/div[1]/div/table/tbody/tr/td[11]")
	
	WebElement vadvadvamount;
	
	@FindBy(xpath = "/html/body/app-root/div/app-edit-advance-payment/div/div[2]/div/div/div/div[1]/div/table/tbody/tr/td[12]")

	WebElement vadvremainingamount;
	
	//*********Return Goods*********//
	
	@FindBy(xpath = "/html/body/app-root/div/app-vendor-dashboard/section/div/div[2]/div/div/div[2]/div/div/a[8]/div/div")
	
	WebElement returngoodstab;
	
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[6]/button")
	
	WebElement returngoodsview;
	
	public VendorL(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
	}
	
	public void vendorlogin(String mail, String pass) throws InterruptedException {
		
		email.click();
		
		email.sendKeys(mail);
		
		Thread.sleep(2000);
		
		password.click();
		
		password.sendKeys(pass);
		
		Thread.sleep(2000);
		
		vlogin.click();
	}
	
	public void openrfqtab() throws InterruptedException {
		
		openrfqtab.click();
		
		Thread.sleep(2000);
		
		vpenrfqedit.click();
		
	}
	
	public void vsubmit() {
		
		vsubmit.click();
	}
	
	public void valistsubok() {
		
		valistsubok.click();
	}
	
	public void vchckbox() {
		
		vchckbox.click();
	}
	
	public void delleadtime(String leaddate) {
		
		delleadtime.sendKeys(leaddate);
		
	}
	
	public void quotedprice(String qprice) {
		
		quoprice.click();
		
		quoprice.sendKeys(qprice);

	}
	
	public void discountedprice(String dprice) {
		
		disprice.click();
		
		disprice.sendKeys(dprice);
	}
	
	public void packndfor(String pcfor) {
		
		packndfor.click();
		
		packndfor.sendKeys(pcfor);
	}
	
	public void freight(String fryt) {
		
		freight.click();
		
		freight.sendKeys(fryt);
	}
	
	public void vendorback() {
		
		vendorback.click();
	}
	
	public void vpaymentterms() {
		
		vpaymentterms.click();
		
		vpaymenttermsele.click();
	}
	
	public void paymentother(String payother) throws InterruptedException {
		
		paymentother.click();
		
		Thread.sleep(2000);
		
		paymentothinout.click();
		
		paymentothinout.sendKeys(payother);
	}
	
	public void warranty(String warr) {
		
		warranty.click();
		
		warranty.sendKeys(warr);
	}
	
	public void actionview() {
		
		actionview.click();
		
		pdfview.click();
		
	}
	
	public void vendorfinalsubmit() {
		
		vsubmit.click();
		
		vfsubok.click();
	}
	
	public void subquotab() {
		
		subquotab.click();
		
		subview.click();
		
		
	}
	
	public void mtcode() {
		
		if(rfqmtcode.equals(submtcode)) {
			
			System.out.println("Rfq material code is equals to submitted material code");
		}
		else {
			
			System.out.println("Rfq material code is  not equals to submitted material code");
		}
			
	}
	
	public void vendorsubquohyp() {
		
		subquohyp.click();
	}
	
	public void vendordashhyp() {
		
	  dashhyp.click();
	}
	
	public void vendorappstatus() {
		
		if(vendorappstatus.isDisplayed()) {
			
			System.out.println("po approved");
		}
		
		else {
			
			System.out.println("po not approved");
		}	
	}
	
	public void deldateschyp() {
		
		deldateschyp.click();
		
		delsclose.click();
	}
	
	public void acceptpoalert() {
		
		acceptpo.click();
	}
	
	public void cancelpo() {
		
		cancelpo.click();
	}
	
	public void msztopur(String msz) {
		
		messagetopur.click();
		
		messagetopur.sendKeys(msz);
	}
	
	public void acceptpo() {
		
		acceptpo();
		
		vappfinalok.click();
	}
	
	public void asntab() {
		
		asntab.click();
		
		vpenrfqedit.click();
	}
	
	public void asnsubmit() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click", asnsubmit);
	}
	
	public void invnumbernddate(String invno,String invdt) throws InterruptedException {
		
		invnumber.click();
		
		invnumber.sendKeys(invno);
		
		Thread.sleep(2000);
		
		invdate.sendKeys(invdt);
	}
	
	public void modeoftransport() {
		
		modeoftransport.click();
		
		modeoftransel.click();
	}
	
	public void ewaybill(String ewayno, String ewaydate) throws InterruptedException {
		
		ewaybillnumber.click();
		
		ewaybillnumber.sendKeys(ewayno);
		
		Thread.sleep(2000);
		
		ewaybilldate.click();
		
		ewaybilldate.sendKeys(ewaydate);
	
	}
	
	public void doctype() {
		
		doctype.click();
		
		doctypesel.click();
	}
	
	public void attachments(String asnfile) {
		
		attachments.sendKeys(asnfile);
	}
	
	public void doctypeview() {
		
		doctypeview.click();
	}
	
	public void doctyperemove() {
		
		doctyperemove.click();
	}
	
	public void asnadd() {
		
		add.click();
	}
	
	public void Trnsportdetails(String lr, String trans, String vehno,String grweight, String chrweight) throws InterruptedException {
		
		lrno.click();
		
		lrno.sendKeys(lr);
		
		Thread.sleep(2000);
		
		transporter.click();
		
		transporter.sendKeys(trans);
		
		Thread.sleep(2000);
		
		vehicleno.click();
		
		vehicleno.sendKeys(vehno);
		
		Thread.sleep(2000);
		
		grossweight.click();
		
		grossweight.sendKeys(grweight);
		
		Thread.sleep(2000);
		
		grosswuom.click();
		
		grossuomsel.click();
		
		Thread.sleep(2000);
		
		chargeableweight.click();
		
		chargeableweight.sendKeys(chrweight);
		
		Thread.sleep(2000);

		charwuom.click();
		
		charwuomsel.click();		
	}
	
	public void invqty(String inqty) {
		
		invqty.click();
		
		invqty.sendKeys(inqty);
	}
	
	public void grossweight1(String grweight1) {
		
		grossweight1.click();
		
		grossweight1.sendKeys(grweight1);
	}
	
	public void grossuom1() {
		
		grossuom1.click();
		
		grossuomsel.click();
	}
	
	public void asncomments(String asncomments) {
		
		comments.click();
		
		comments.sendKeys(asncomments);
	}
	
	public void Calcheck() throws InterruptedException {
		
		String invoiceqty = invqty.getText();
		
		Thread.sleep(2000);
		
		String poquantity = poqty.getText();
		
		Thread.sleep(2000);
		
		String totalpoamount = totalamount.getText();
		
		Thread.sleep(2000);
		
		String invoiceamount = "(invoiceqty*poquantity)/totalpoamoun";
		
		Thread.sleep(2000);
		
		if(invoiceamount.equals(invamount)) {
			
			System.out.println("invoice amount is correct");
		}
		
		else {
			
			System.out.println("invoice amount is not correct");
		}
	}
	
	public void apprinvtab() {
		
		apprinvtab.click();
		
	String ASNNO = asnnumber.getText();
	
	String ApprovedASNNO = apinvnumber.getText();
	
	if(ASNNO.equalsIgnoreCase(ApprovedASNNO)) {
		
		System.out.println("ASN No's are matched");
	}
	
	else {
		
		System.out.println("ASN No's are not matched");
	}
	}
	
	public void advpaymenttab() {
		
		advpaymenttab.click();
		
		advedit.click();
	}
	
	public void singleadv() {
		
		singleadv.click();
	}
	
	public void multyadv() {
		
		multyadv.click();
	}
	
	public void advpaydate(String advdate) {
		
		advpaydate.sendKeys(advdate);
	}
	
	public void advpaypercentage() {
		
		advpaypercentage.click();
		
		advpaypersel.click();
	}
	
	public void Vendoradvamount(String vadv) {
		
        String vadvamount = vadvadvamount.getText();
		
		String vadvremamount = vadvremainingamount.getText();
		
		String vtotalamount = vadvtotalamount.getText();
		
		String vendoradvper = advpaypersel.getText();
		
		vadv = "(vtotalamount*vendoradvper)/100";
		
		String vendoradvremamount = "vtotalamount-vendoradv";
		
		if(vtotalamount.equals(vadv)) {
			
			System.out.println(vadv);
			
			System.err.println(vendoradvremamount);
		}
		
		else {
			
			System.out.println("vendor advance amount is not correct");
		}
		
	}
	
	public void returngoodstab() {
		
		returngoodstab.click();
		
		returngoodsview.click();
	}
	
	public void vactionclose() {
		
		vactionclose.click();
		               
		}
		
	}
	
