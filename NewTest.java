import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	  
	  //to launch browser
	  WebDriverManager.chromedriver().setup();
	  
	  //browser as chrome
	  
	  WebDriver driver = new ChromeDriver();
	  
	  //open url/site
	  
	  driver.get("url");
	  
	  //maximize the window
	  
	  driver.manage().window().maximize();
	  
	  //delete all cookies
	  
	  driver.manage().deleteAllCookies();
	  
	  //navigate to diff url
	  
	  driver.navigate().to("url");
	  
	  //back to previous url
	  
	  driver.navigate().back();
	  
	  //forward to url
	  
	  driver.navigate().forward();
	  
	  //refresh the url
	  
	  driver.navigate().refresh();
	  
	  //switch to diff url in diff tab
	  
	  driver.switchTo().newWindow(WindowType.TAB);
	  
	  //switch to new window
	  
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  
	 //close all tabs(window)
	  
	  driver.quit();
	  
	  //close current tab
	  
	  driver.close();
	  
	  //click method
	 
	  driver.findElement(By.xpath("")).click();
	  
	  WebElement e1 = driver.findElement(By.id("")).click();
	  
	  WebElement e2 = driver.findElement(By.id(""));
	  
	  e2.isDisplayed();
	  
	  e2.isEnabled();
	  
	  e2.click();
	  
	  //checkbox selection
	  
     driver.findElement(By.xpath("")).click();
	  
	  WebElement e1 = driver.findElement(By.id("")).click();
	  
	  WebElement e2 = driver.findElement(By.id(""));
	  
	  e2.isDisplayed();
	  
	  e2.isEnabled();
	  
	  e2.isSelected();
	  
	  e2.click();
	  
     if(!e2.isSelected()) {
		  
		  e2.click();
	  }
	  
	  //Single dropdown selection
	  
	  Select se = (Select) driver;
	  
	  se.selectByIndex(0);
	  
	  se.selectByValue("128872");
	  
	  se.selectByVisibleText("ysh");
	  
	  //multiple dropdown selection
	  
	  Select se =(Select) driver;
	 
	  if(se.isMultiple()) {
		  
		 se.selectByIndex(0);
		 
		  se.selectByValue("128872");
		  
		  se.selectByVisibleText("ysh");
		  
		  se.deselectAll();
		  
		  se.deselectByIndex(0);
		  
		  se.deselectByValue("876");
		  
		  se.deselectByVisibleText("ysh");
		  
	  }else
		  
	  {
		  
		  se.selectByVisibleText("ysh");
	  }
	  
	  //image click
	  
      driver.findElement(By.xpath("")).click();
	  
	  WebElement e1 = driver.findElement(By.id("")).click();
	  
	  WebElement e2 = driver.findElement(By.id(""));
	  
	  e2.isDisplayed();
	  
	  if(e2.isDisplayed()) {
		  
		  e2.click();
	  }
	  
	  //Radio Button selection
	  
     driver.findElement(By.xpath("")).click();
	  
	  WebElement e1 = driver.findElement(By.id("")).click();
	  
	  WebElement e2 = driver.findElement(By.id(""));
	  
	  e2.isDisplayed();
	  
	  if(!e2.isSelected()) {
		  
		  e2.click();
	  }
	  
	  //Javascript executor to identify the hiddeen elements
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  js.executeScript("arguments[0].click()", element);
	  
	  //To scrolldown
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  js.executeScript("window.scrollBy(0,350)", element);
	  
	  // To ScrollUp
	  
      JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  js.executeScript("window.scrollBy(350,0)", element);
	  
	  //To pass the text
	  
	  WebElement ele = driver.findElement(By.xpath(""));
	  
	  ele.click();
	  
	  ele.sendKeys("text");
	  
	  //Mouse Actions
	 
	 //Right Click 
	 Actions action = new Actions(driver);
	 
	 action.contextClick();
	 
	 action.contextClick(element).perform();
	 
	 //Double click
	 
     Actions action = new Actions(driver);
	 
	 action.doubleClick();
	 
	 action.doubleClick(ele).perform();
	 
	 //press single key
	 
     Actions action = new Actions(driver);
	 
	 action.sendKeys(Keys.ARROW_DOWN).perform();
	 
	 //press multiple keys
     Actions action = new Actions(driver);
	 
	 action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	 
	 action.sendKeys(Keys.CONTROL.SHIFT.DELETE);
	 
	 //scroll to particulr element
	 
     Actions action = new Actions(driver);
	 
	 action.moveToElement(ele).
	 
	 
	  
		
	  }
  
  //
	  
	  
	  
}
