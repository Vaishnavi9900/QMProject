package ApplicationMasterslocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessTypecreatelocators {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Process Type']")
	
	WebElement processtypemaster;
	
	@FindBy(xpath = "//input[@formcontrolname='ProcesstypeDesc']")
	
	WebElement processtype;

	
	public ProcessTypecreatelocators(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
	}
	
	public void prtype() {
		
		processtypemaster.click();
	}
	
public void prtypedesc(String prtype) {
	
	processtype.click();
		
	processtype.sendKeys(prtype);
	}
	


}
