package TestNG;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class JQueryToolTip {
    WebDriver driver;
  
	@Test
	public void toolTipCase() {
	List<WebElement> frame=driver.findElements(By.tagName("iframe"));
	System.out.println("Available frames:"+frame);
	WebElement framelocation =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(framelocation);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(driver.findElement(By.linkText("Tooltips")).isDisplayed()) {
		System.out.println("we are in frame");
		String toolTipElement= driver.findElement(By.linkText("Tooltips")).getAttribute("title");
		System.out.println(toolTipElement);
	}
		
	else {
		System.out.println("we are not in frame");
	}
		
		
		
		
	}
private WebElement findElements(By tagName) {
		// TODO Auto-generated method stub
		return null;
	}
@BeforeTest
public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://jqueryui.com/tooltip/");
	  driver.manage().window().maximize();
	  
}

}