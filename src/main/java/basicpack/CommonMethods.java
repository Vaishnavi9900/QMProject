package basicpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	
public static WebDriver driver;

String file = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\QMProject\\Resources\\QMData.xlsx";

protected String cell2,cell3,cell4,cell5,cell6,cell7,cell8,cell9; 

@BeforeMethod
public void browserlogin() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://172.16.5.89/QMSpectrum/Production/");
}
@AfterMethod
public void quit() {
	
	driver.quit();
}

	public void clickElement(WebElement element) {
		
		if(element.isDisplayed()) 
			element.click();
		else
			System.out.println("element is not displayed");
	}

	public void CheckBox(WebElement checkbox) {
	    
	    if(!checkbox.isSelected()) 
	     checkbox.click();
	    
	}

	public void javascript(WebElement element) {
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()", element);
	}

	public void scrolldown(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,350)", element);
	}

	public void scrollup(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(350,0)", element);
	}
	public void javascript() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	    js.executeScript("arguments[0].click()", "");
	}

	public void textbox(WebElement element,String text) {
		
		element.click();
		
		element.clear();
		
		element.sendKeys(text);
	}

	public void dropdown(WebElement dropdownElement) {

		   
		Select s = new Select(dropdownElement);
		
		    s.isMultiple();
		    s.selectByIndex(0);
		   // s.selectByValue("audi");
		  //  s.selectByVisibleText("Audi");

	}

	public void multiseldropdown(WebElement multiSelectDropdownElement) {
		   
		 Select s = new Select(multiSelectDropdownElement);
		    if(s.isMultiple()) {    
		     s.selectByIndex(0);
		  //   s.selectByValue("opel");
		  //   s.selectByVisibleText("Audi");     
		     
		     s.deselectByIndex(0);
		     s.deselectByValue("opel");
		     s.deselectByVisibleText("Audi");
		    }else {
		     s.selectByVisibleText("Audi");	    
	}
	}
		    
	public void buttonlabel(WebElement buttonElement) {

	    buttonElement.getAttribute("value");
	    
	    if(buttonElement.getAttribute("value").equals("ExpectedLabel")) {
	     System.out.println("Label is as Expected");
	    }else {
	     System.out.println("Label is not matching");
	    }
	}

	public void titlematch() {
		
	    driver.getTitle();
	    
	    if(driver.getTitle().equals("ExpectedTitle")) {
	     System.out.println("Title is as Expected");
	    }else {
	     System.out.println("Title is not matching");
	    }

	}

	public void presssinglekey() {
		
		Actions action = new Actions(driver);
	    action.sendKeys(Keys.ARROW_DOWN).perform();	
	}

	public void pressmultiplekeys() {
		
		Actions action = new Actions(driver);
	    action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    action.sendKeys(Keys.CONTROL.SHIFT.DELETE).perform();
	}

	public void rightclick(WebElement element) {
		
		Actions action = new Actions(driver);
	    action.contextClick(element).perform();

	}

	public void doubleclick(WebElement element) {
		
		Actions action = new Actions(driver);
	    action.doubleClick(element).perform();

	}

	public void mouseover(WebElement element) {
		
		Actions action = new Actions(driver);
	    action.moveToElement(element).perform();

	}
	public void radiobutton(WebElement radiobutton) {

		radiobutton.click();
	}

	public void image(WebElement imageElement) {	

	    imageElement.isDisplayed();

	}

	public void navigate(String url) {
		
		driver.navigate().to("url");

	}

	public void backtoprevious() {
		
		driver.navigate().back();

	}

	public void moveforwardtonext() {
		
		driver.navigate().forward();

	}

	public void refresh() {
		
		driver.navigate().refresh();

	}

	public void nexttab() {
		
		driver.switchTo().newWindow(WindowType.TAB);

	}

	public void nextwindow() {
		
		driver.switchTo().newWindow(WindowType.WINDOW);

	}

	public void windowsize() {
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height is : "+size.getHeight());
		System.out.println("Width is : "+size.getWidth());

	}

	public void javawait() throws InterruptedException {
		
		Thread.sleep(5000); 

	}

	public void implicitwait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	public void explicitwait(String xpath) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("xpath"), 0));
	}
	//
	//public void fluentwait(String xpath) {
	//	
	//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30).
	//.pollingEvery(4,TimeUnit.SECONDS);
	//wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("xpath"), 0));
	//
	//}

	public void frames() {
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame4");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

	}

	public void alertaccept() {
		
		Alert alert  = driver.switchTo().alert();
		alert.accept();
	}

	public void alertdismiss() {
		
		Alert alert  = driver.switchTo().alert();
		alert.dismiss();
	}

	public void alertgettext() {
		
		Alert alert  = driver.switchTo().alert();
		alert.getText();
	}

	public void alertsend() {
		
		Alert alert  = driver.switchTo().alert();
		alert.sendKeys("value");
	}

	public void switchtomultiplewindows() {
		
		List<String> windows = new ArrayList<String>(driver.getWindowHandles()); driver.switchTo().window(windows.get(1));  
		driver.switchTo().window(windows.get(0)); //  Switch to Main window"

	}
	
	public void cell0(String sheetName) throws IOException {
		
		FileInputStream fi = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum();
		
		XSSFCell cols = sheet.getRow(1).getCell(0);
		
		System.out.println(cols);
		
		String cell0 = cols.getStringCellValue();
		
	}
	
	public void cell1(String sheetName) throws IOException {
		
       FileInputStream fi = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum();
		
		XSSFCell cols = sheet.getRow(1).getCell(1);
		
		System.out.println(cols);
		
	    //cell1data1 = cols.getStringCellValue();
		
		
	}
	
	public void cell2(String sheetName) throws IOException {
		
        FileInputStream fi = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum();
		
		XSSFCell cols = sheet.getRow(1).getCell(2);
		
		System.out.println(cols);
		
		cell2 = cols.getStringCellValue();
		
	}
	
	public void cell3(String sheetName) throws IOException {
		
        FileInputStream fi = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum();
		
		XSSFCell cols = sheet.getRow(1).getCell(2);
		
		System.out.println(cols);
		
		String cell3 = cols.getStringCellValue();
		
	}
	
	

}
