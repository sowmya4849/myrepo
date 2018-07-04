package TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class AssLocators {
	WebDriver driver;

  @Test
  public void f() {
	  
	  List<WebElement>loc=  driver.findElements(By.xpath("//input[@type='radio']"));
	  
       System.out.println(loc.size());
     
       for(int i=0;i<loc.size();i++) {
    	   System.out.println("optionButtonlocator:"+loc.get(i).getAttribute("name"));
       }
       List<WebElement>ch=  driver.findElements(By.xpath("//input[@type='checkbox']"));
 	  
       System.out.println(ch.size());
       for(int i=0;i<ch.size();i++) {
    	   System.out.println("checkBoxlocator:"+ch.get(i).getAttribute("name"));
       }
  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.spicejet.com");
	  driver.manage().window().maximize();

  }

}
