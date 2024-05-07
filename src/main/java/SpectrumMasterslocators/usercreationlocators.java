package SpectrumMasterslocators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usercreationlocators {

	WebDriver driver;

	@FindBy(xpath = "(//a[@role='button'])[1]")

	WebElement spmenu;

	@FindBy(xpath = "//a[text()='User Creation']")

	WebElement usercr;

	@FindBy(xpath = "//button[text()='Create']")

	WebElement uscreate;

	@FindBy(xpath = "//input[@minlength='6']")

	WebElement userid;

	@FindBy(xpath = "//button[text()='Go']")

	WebElement go;

	@FindBy(xpath = "(//button[text()='Create'])[2]")

	WebElement uscr;

	@FindBy(xpath = "//select[@formcontrolname='SalutationId']")

	WebElement salta;

	@FindBy(xpath = "//option[text()=' Mr. ']")

	WebElement saloption;

	@FindBy(xpath = "//input[@formcontrolname='FirstName']")

	WebElement frstname;

	@FindBy(xpath = "//input[@formcontrolname='LastName']")

	WebElement lastname;

	@FindBy(xpath = "//select[@formcontrolname='DepartmentId']")

	WebElement dept;

	@FindBy(xpath = "//option[text()=' Quality Assurance ']")

	WebElement deptoption;

	@FindBy(xpath = "//select[@formcontrolname='SelectedPlantIds']")

	WebElement plant;

	@FindBy(xpath = "//option[text()=' Aspiro2 ']")

	WebElement plantoption;

	@FindBy(xpath = "//select[@formcontrolname='SelectedApplicationIds']")

	WebElement app;

	@FindBy(xpath = "//option[text()=' QMASPIRO ']")

	WebElement appoption;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[4]")

	WebElement role;

	@FindBy(xpath = "//div[text()='Analytical Approver']")

	WebElement roleoption;
	
	@FindBy(xpath = "//span[@class='dropdown-btn']")
	
	WebElement roleclick;

	@FindBy(xpath =  "//button[@class='btn btn-sm btn-success mt22']")

	WebElement add;
	
	@FindBy(xpath = "//input[@name='i.baseplant']")

	WebElement base;

	@FindBy(xpath = "//button[@class='close']")
	
	WebElement closeusercr;
	
	public usercreationlocators(WebDriver d) {

		driver = d;

		PageFactory.initElements(d, this);
	}

	public void spmenu() {

		spmenu.click();

	}

	public void usercr() {

		usercr.click();

	}

	public void uscreate() {

		uscreate.click();

	}

	public void userid(String id) {

		userid.sendKeys(id);

	}

	public void go() {

		go.click();

	}
	
	public void salta() {
		
		salta.click();
	}

	
public void saloption() {
		
	saloption.click();
	
	}

public void frstname(String fname) {
	
	frstname.click();
	
	frstname.sendKeys(fname);
	}

public void lastname(String lname) {
	
	lastname.click();
	
	lastname.sendKeys(lname);
	
	}

public void dept() {
	
	dept.click();
	
	}

public void deptoption() {
	
	deptoption.click();
	
	}

public void plant() {
	
	plant.click();
}

public void plantoption() {
	
	plantoption.click();
}

public void app() {
	
	app.click();
}

public void appoption() {
	
	appoption.click();
}

public void role() {
	
	role.click();
}

public void roleoption() {
	
	roleoption.click();
}

public void roleclick() {
	Actions action = new Actions(driver);
	
	action.moveToElement(role).perform();
}

public void add() {
	
	add.click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,250)", "base");
	
}

public void base() {
	
Actions action = new Actions(driver);
	
	action.moveToElement(base).perform();
}

public void uscr() {
	
	uscr.click();
}

public void closeusercr() {
	
	closeusercr.click();
}
}
