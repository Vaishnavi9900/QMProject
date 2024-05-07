package POFlowLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POHODL {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/a/img")
	
	WebElement pohodadvedit;
	
	@FindBy(xpath = "//a[text()=' Approve ']")
	
	WebElement pohodadvapprove;
	
	@FindBy(xpath = "//a[text()=' Reject ']")
	
	WebElement pohodadvreject;
	
	public POHODL(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
	}
	
	public void pohodadvedit() {
		
		pohodadvedit.click();
	}
	
	public void pohodadvapprove() {
		
		pohodadvapprove.click();
	}
	
	public void pohodadvreject() {
		
		pohodadvreject.click();
	}
 
}
