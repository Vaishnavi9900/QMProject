package ApplicationMasterslocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BMRlocators {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='BMR No']")WebElement bmrnomaster;

	@FindBy(xpath = "//button[@class='btn btn-success mt22']")WebElement addbmr;
	
	@FindBy(how = How.XPATH, using ="//div[text()=' Please Add Atleast one BMR No ']") WebElement alert;

	@FindBy(how = How.XPATH, using ="//select[@formcontrolname='CategoryId']") WebElement category;
	
	@FindBy(how = How.XPATH, using ="//select[@formcontrolname='productNameId']") WebElement productname;
	
	@FindBy(how = How.XPATH, using ="//select[@formcontrolname='productCodeId']") WebElement productcode;

	@FindBy(xpath = "(//span[@tabindex='-1'])[1]")WebElement area;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[6]") WebElement areasel;

	@FindBy(how = How.XPATH, using ="//select[@formcontrolname='processtype']") WebElement processtype;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[2]")WebElement processstep;

	@FindBy(xpath = "//input[@placeholder='BMR No']")WebElement bmrnumber;
	
	@FindBy(how = How.XPATH, using ="//span[@class='fa fa-minus-circle']") WebElement remove;
	
	@FindBy(how = How.XPATH, using ="//textarea[@formcontrolname='Comments']") WebElement comments;

	public BMRlocators(WebDriver d) {

		driver = d;

		PageFactory.initElements(d, this);

	}
	
public void bmr() {
	
	bmrnomaster.click();
	
}

public void bmrcreate(String cat, String name, String code, String type, String bmrno) {
	
	String addbmractual = "Please Add Atleast one BMR No";
	
	Assert.assertEquals(addbmractual, alert);
	
	addbmr.click();
	
	category.click();
	
	category.sendKeys(cat);
	
	productname.click();
	
	productname.sendKeys(name);
	
	productcode.click();
	
	productcode.sendKeys(code);
	
	area.click();
	
	areasel.click();
	

}


	
}
