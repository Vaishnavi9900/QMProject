package GRNFlowLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class GRNL {
	
	WebDriver driver;
	
	//***********GRN Process**********//
	
	@FindBy(xpath = "(//button[@title='Edit'])[1]")

	WebElement grnedit;
	
	@FindBy(xpath = "//select[@formcontrolname='doctype']")
	
	WebElement grnmissingdoc;
	
	@FindBy(xpath = "//option[text()=' Invoice Bill']")
	
	WebElement grnmissinginv;
	
	@FindBy(xpath = "//option[text()=' E-Way Bill']")
	
	WebElement grnmissingeway;
	
	@FindBy(xpath = "//input[@type='file']")
	
	WebElement grnuploadfile;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")
	
	WebElement grnreceivedqty;
	
	@FindBy(xpath = "//a[text()='Add Batch Details']")
	
	WebElement grnbatchdetails;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	
	WebElement batchno;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	
	WebElement vendorbatch;
	
	@FindBy(xpath = "(//input[@type='date'])[2]")
	
	WebElement dateofmanufacture;
	
	@FindBy(xpath = "(//input[@type='date'])[3]")
	
	WebElement sledorbbd;
	
	@FindBy(xpath = "(//input[@type='date'])[4]")
	
	WebElement retestdate;
	
	@FindBy(xpath = "//button[text()='Save']")
	
	WebElement batchdeatilssave;
	
	@FindBy(xpath = "//button[@class='close']")
	
	WebElement batchdetailsclose;
	
	@FindBy(xpath = "(//input[@type='number'])[3]")
	
	WebElement grnnoofcontainers;
	
	@FindBy(xpath = "//select[@class='form-control w100']")
	
	WebElement grnstoragelocation;
	
	@FindBy(xpath = "//option[text()=' 100200A']")
	
	WebElement grnstoragesel;
	
	@FindBy(xpath = "//a[text()='Vendor Documents']")
	
	WebElement grnvendordoc;
	
	@FindBy(xpath = "//i[@title='Click to view']")
	
	WebElement vendordocview;
	
	@FindBy(xpath = "//button[text()='Submit']")
	
	WebElement grnsubmit;
	
	@FindBy(xpath = "//button[text()='Ok']")
	
	WebElement grnsubmitok;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-goods-receipt/div/div[1]/div/nav/ol/li[1]/a")
	
	WebElement grndashboardhyp;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-grnprocess/div/div[1]/div/nav/ol/li[2]")
	
	WebElement grnprocesshyp;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-goods-receipt/div/div[1]/div/nav/ol/li[1]/a")
	
	WebElement grndashhyp;
	
	//**********GRN Report*********//
	
	@FindBy(xpath = "//a[text()='GRN Report']")
	
	WebElement grnreporttab;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	
	WebElement grnreportview;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-grn-report-details-screen/div/div[1]/div/nav/ol/li[2]")
	
	WebElement grnreporthyp;
	
	@FindBy(xpath = "//a[text()='Goods Return Report']")
	
	WebElement goodsreturnreporttab;
	
	@FindBy(xpath = "//button[text()=' Back']")
	
	WebElement goodsreturnreportback;
	
	@FindBy(xpath = "//a[text()='Add Batch Details']")
	
	WebElement grnreportaddbatch;
	
	//**********Goods Return***********//
	
	@FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
	
	WebElement goodsreturnedit;
	
	@FindBy(xpath = "//button[text()=' Submit ']")
	
	WebElement goodsreturnsubmit;
	
	@FindBy(xpath = "//select[@formcontrolname='reasonForReturnId']")
	
	WebElement reasonforreturn;
	
	@FindBy(xpath = "//option[text()='001-Poor Quality ']")
	
	WebElement reasonforresel;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")
	
	WebElement returnqty;
	
	@FindBy(xpath = "(//input[@type='number'])[3]")
	
	WebElement returnnoofcontainers;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-return-goods/div/div[2]/div/div/div/div[1]/div/table/tbody/tr/td[10]/select")
	
	WebElement returnstorageloc;
	
	@FindBy(xpath = "//option[text()=' SR-100']")
	
	WebElement returnstolocsel;
	
	@FindBy(xpath = "//textarea[@formcontrolname='comment']")
	
	WebElement goodsreturncomments;
	
	public GRNL(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
	}
	
	public void grnedit() {
		
		grnedit.click();
	}
	
	public void grnmissingdoc() {
		
		grnmissingdoc.click();
		
		grnmissinginv.click();
		
		// grnmissingeway.sendKeys(invfile);
	}
	
	public void grnuploadfile(String grnfile) {
		
		grnuploadfile.click();
		
		grnuploadfile.sendKeys(grnfile);
	}
	
	public void grnreceivedqty(String grnrecqty) {
		
		grnreceivedqty.click();
		
		grnreceivedqty.sendKeys(grnrecqty);
	}
	
	public void grnbatchdetails(String batch, String vendbatch, String manufdate , String sledordate,String retest) throws InterruptedException {
		
		grnbatchdetails.click();
		
		Thread.sleep(2000);
		
		batchno.click();
		
		batchno.sendKeys(batch);
		
		Thread.sleep(2000);	
		
		vendorbatch.click();
		
		vendorbatch.sendKeys(vendbatch);
		
		Thread.sleep(2000);		
		
		dateofmanufacture.sendKeys(manufdate);
		
		Thread.sleep(2000);	
		
		sledorbbd.sendKeys(sledordate);
		
		Thread.sleep(2000);		
			
		retestdate.sendKeys(retest);
		
		Thread.sleep(2000);
		
		batchdeatilssave.click();
		
		Thread.sleep(2000);
		
		batchdetailsclose.click();
		
	}
	
	public void grnnoofcontainers(String containers) {
		
		
		grnnoofcontainers.click();
		
		grnnoofcontainers.sendKeys(containers);
		
	}
	
	public void grnstoragelocation(String storagel) {
		
		grnstoragelocation.click();
		
		grnstoragesel.click();
	}
	
	public void grnvendordoc() {
		
		grnvendordoc.click();
		
		vendordocview.click();
		
		driver.close();
		
	    batchdetailsclose.click();

	}
	
	public void grnsubmit() {
		
		grnsubmit.click();
		
	}
	
	public void grnsubmitok() {
		
		grnsubmitok.click();
		
		grndashboardhyp.click();
	}
	
	public void grnreport() throws InterruptedException {
		
		grnreporttab.click();
		
		Thread.sleep(2000);
		
		grnreportview.click();
		
		Thread.sleep(2000);
		
		grnbatchdetails.click();
		
		Thread.sleep(2000);
		
	    batchdetailsclose.click();
	    
        grnvendordoc.click();
        
        Thread.sleep(2000);
		
		vendordocview.click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	    batchdetailsclose.click();
	    
	    grnreporthyp.click();
	    
	    Thread.sleep(2000);
	    
	    grndashboardhyp.click();

	}
	
	public void goodsreturnedit() {
		
		goodsreturnedit.click();
		
	}
	
	public void goodsreturnsubmit() {
		
		goodsreturnsubmit.click();
	}
	
	public void reasonforreturn() {
		
		reasonforreturn.click();
		
		reasonforresel.click();
		
	}
	
	public void returnqty(String retqty) {
		
		returnqty.click();
		
		returnqty.sendKeys(retqty);
	}
	
	public void returnnoofcontainers(String retcontainers) {
		
		returnnoofcontainers.click();
		
		returnnoofcontainers.sendKeys(retcontainers);
	}
	
	public void returnstorageloc() {
		
		returnstorageloc.click();
		
		returnstolocsel.click();
	}
	
	public void goodsreturncomments(String grnretcomments) {
		
		goodsreturncomments.click();
		
		goodsreturncomments.sendKeys(grnretcomments);
	}
	
	public void goodsreturnreporttab() throws InterruptedException {
		
		goodsreturnreporttab.click();
		
		grnreportview.click();
		
		Thread.sleep(2000);
		
        vendordocview.click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	    batchdetailsclose.click();
	    
	    Thread.sleep(2000);
	    
	    goodsreturnreportback.click();
	    
	    Thread.sleep(2000);
	    
	    grndashboardhyp.click();
	}
	
	public void grndashhyp() {
		
		grndashhyp.click();
	}
	
	public void grnreportaddbatch() {
		
		grnreportaddbatch.click();
	
	}
	
}
