package locatorspack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillDoc {

	WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='User ID']")
	
	WebElement userid;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	
	WebElement password;
   
	@FindBy(xpath = "//button[text()='Login']")
	
	WebElement login;
	
   @FindBy(xpath = "//p[text()='Termination']")

   
   WebElement term;
   
   @FindBy(xpath = "//button[text()='Terminate Other Login']")

   
   WebElement termother;
   
   @FindBy(xpath = "//p[text()='VendorPortal - HETERO LABS LTD [UNIT-V (B)]']")
   
   WebElement vptab;
   
   @FindBy(xpath = "//a[text()='Bill Document Type']")
   
   WebElement billdoc;
   
   @FindBy(xpath = "//button[@class='btn outLineBtn1 ml-3']")
   
   WebElement create;
   
   @FindBy(xpath = "//button[text()='Create']")
   
   WebElement create1;
   
   @FindBy(xpath = "//input[@formcontrolname='billDocumentTypeName']")
   
   WebElement bdtype;
   
   
   
   public BillDoc(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
		
	}
	
   public void userid(String id) {
	   
	   userid.sendKeys(id);
   }
   
 public void password(String pass) {
	   
	 password.sendKeys(pass);
   }
 
 public void login() {
	   
	 login.click();
   }
 
 public void term() {
	   
	if(term.isDisplayed()) {
		
		termother.click();
	}
	
	else {
		vptab.click();
	}
 
 }
 public void billdoc() {
	 
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	 js.executeScript("arguments[0].click();",billdoc );
    
	 billdoc.click();
   }

}
