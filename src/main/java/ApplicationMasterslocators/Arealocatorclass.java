package ApplicationMasterslocators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import basicpack.CommonMethods;


public class Arealocatorclass extends CommonMethods{
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement login;

	@FindBy(xpath = "(//button[text()='Login'])[2]")
	WebElement login1;

	@FindBy(xpath = "//input[@name='UserName']")
	WebElement username;

	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;

	@FindBy(xpath = "//p[text()='Termination']")
	WebElement term;

	@FindBy(xpath = "//button[text()='Terminate Other Login']")
	WebElement termother;

	@FindBy(xpath = "//a[@class='form-inline clearfix']")
	WebElement dashboard;

	@FindBy(xpath = "(//a[@aria-haspopup='true'])[1]")
	WebElement menu;

	@FindBy(xpath = "//a[text()='Area']")

	WebElement areamaster;

	@FindBy(xpath = "//button[@title='Click to Create']")

	WebElement create;

	@FindBy(xpath = "//input[@type='text']")
	WebElement areadata;

	@FindBy(xpath = "(//button[@title='Click to Create'])[2]")

	WebElement create1;

	@FindBy(xpath = "//button[text()='Yes']")

	WebElement yes;
	
	@FindBy(xpath = "//button[@aria-label='Close']")

	WebElement close;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancel;

	@FindBy(xpath = "//input[@type='password']")

	WebElement esign;

	@FindBy(xpath = "//button[@type='submit']")

	WebElement submit;

	@FindBy(xpath = "//button[text()='OK']")

	WebElement ok;

	@FindBy(xpath = "(//button[@title='Click to Edit'])[1]")

	WebElement edit1;

	@FindBy(xpath = "(//button[@title='Click to Edit'])[5]")

	WebElement edit5;

	@FindBy(xpath = "//button[@title='Click to Update']")

	WebElement update;

	@FindBy(xpath = "//a[@data-dt-idx='3']")

	WebElement nexttable;

	@FindBy(xpath = "//textarea[@formcontrolname='Comments']")

	WebElement comments;

	@FindBy(xpath = "//input[@type='checkbox']")

	WebElement checkbox;

	@FindBy(how = How.XPATH, using = "//span[text()='Export']")
	WebElement exp;

	@FindBy(how = How.XPATH, using = "//div[text()=' Already Exists ']")
	WebElement alert;

	@FindBy(how = How.XPATH, using = "//div[text()='No Changes Done']")
	WebElement nochanges;
	
	@FindBy(how = How.XPATH, using = "//span[@class='avatarIcon']")
	WebElement profile;
	
	@FindBy(how = How.XPATH, using = "(//a[@class='dropdown-item'])[2]")
	WebElement quit;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	WebElement quityes;
	
	@FindBy(how = How.XPATH, using = "(//a[@class='dropdown-item'])[3]")
	WebElement logout;
	
	@FindBy(how = How.XPATH, using = "(//a[text()='Yes'])[1]")
	WebElement logoutyes;

	public Arealocatorclass(WebDriver d) {
		
		driver = d;
		
		PageFactory.initElements(d, this);
	}

	public void login(String userid, String pass) {

		login.click();
		
		implicitwait();
		
		login1.click();
		
		username.click();

		username.sendKeys(userid,Keys.TAB);

		password.sendKeys(pass,Keys.ENTER);
	}

	public void termination() throws InterruptedException {
		
		 implicitwait();

		if (term.isDisplayed()) {

			termother.click();

			dashboard.click();
		} else {

			dashboard.click();
		}
	}

	public void menu() throws InterruptedException {
	
	    javawait();

		menu.click();
	}
	
public void create() {
	
	create.click();
}

public void createbutton() {
	
	create1.click();
}

public void submityes(String pass) {
	
	cancel.click();
	
	create1.click();
	
	yes.click();
	
	esign.click();

	esign.sendKeys(pass, Keys.ENTER);

}

public void areamaster() {
	
	areamaster.click();
}

public void areaexisted(String cell1data1) {
	
	areadata.click();
	
	areadata.sendKeys(cell1data1);
	
}

public void close() {
	
  clickElement(close);
}

	public void areacreate(String area, String pass) {

		areamaster.click();

		create.click();

		areadata.click();

		areadata.sendKeys(area);

		create1.click();

		cancel.click();

		create1.click();

		yes.click();

		esign.click();

		esign.sendKeys(pass, Keys.ENTER);
	}

	public void export() {

		exp.click();
	}

	public void exist() {

		String actualalert = "//div[text()=' Already Exists ']";

		Assert.assertEquals(actualalert, alert, "alert is matched");

	}

	public void submit() {

		submit.click();
	}

	public void subok() {

		ok.click();
	}
	
	public void update() {
		
		update.click();
	}

	public void areaupdate(String comm, String area1, String pass) {

		edit1.click();

		comments.click();

		comments.sendKeys(comm);

		update.click();

		areadata.click();

		areadata.sendKeys(area1);

		update.click();

		yes.click();

		esign.click();

		esign.sendKeys(pass, Keys.ENTER);

	}
	
public void edit() {
	
	edit1.click();
}
	
public void updateyes(String pass) {
	
	update.click();

	yes.click();

	esign.click();

	esign.sendKeys(pass, Keys.ENTER);

	
}

	public void disableEnable(String comm, String pass) {

		edit1.click();

		update.click();

		String nochangesactual = "No Changes Done";

		Assert.assertEquals(nochangesactual, nochanges);

		comments.click();

		comments.sendKeys(comm);

		checkbox.click();

		update.click();

		yes.click();

		esign.click();

		esign.sendKeys(pass, Keys.ENTER);

	}
	
public void quit() {
	
	clickElement(profile);

	implicitwait();
	
	clickElement(quit);
	
	implicitwait();
	
	clickElement(quityes);
	
	clickElement(profile);
	
	implicitwait();
	
	clickElement(logout);
	
	clickElement(logoutyes);
}

}
