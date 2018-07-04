package TestNG;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Ass1SpiceJet {
	WebDriver driver;
  @Test
  public void f() {
	  
	Select se=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	  String selectedValue = se.getFirstSelectedOption().getText();	 
	  System.out.println(selectedValue);
	   		  
	  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.spicejet.com");
	  driver.manage().window().maximize();
  }

}
