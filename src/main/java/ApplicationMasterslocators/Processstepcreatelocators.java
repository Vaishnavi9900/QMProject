package ApplicationMasterslocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Processstepcreatelocators{
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Process Step']")
	
	WebElement prstepmaster;
	
	@FindBy(xpath = "//input[@formcontrolname='ProcessstepDescription']")
	
	WebElement prstep;
	
	public Processstepcreatelocators(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
		
	}
	
	public void prstep() {
		
		prstep.click();
	}
	
public void prstepdesc(String step) {
	
	prstep.click();
		
	prstep.sendKeys(step);
	
}
	

}
