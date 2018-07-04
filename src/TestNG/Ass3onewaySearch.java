package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Ass3onewaySearch {
	WebDriver driver;
  @Test
  public void f() {
	  
	  if(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected()){
         WebElement en=(driver.findElement(By.id("ctl00_mainContent_view_date2")));	 
    	System.out.println(en);
    	
         Assert.assertEquals(true, en.isEnabled());
         System.out.println(en.isEnabled());
        	 System.out.println("yes");
           
	   
	  } 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.spicejet.com");
	  driver.manage().window().maximize();
  }

}
