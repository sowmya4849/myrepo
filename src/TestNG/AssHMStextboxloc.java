package TestNG;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class AssHMStextboxloc {
	public WebDriver driver;

  public void verifylogin_Pr() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Registration")).click();
		 
  }
  @Test
  public void displaytext() {
	  verifylogin_Pr() ;
	  List<WebElement>text=  driver.findElements(By.xpath("//input[@type='text']"));
	  
      System.out.println(text.size());
    
      for(int i=0;i<text.size();i++) {
   	   System.out.println("textboxloc:"+text.get(i).getAttribute("name"));
   	   
      }
List<WebElement>button=  driver.findElements(By.xpath("//input[@class='log']"));
	  
      System.out.println(button.size());
    
      for(int i=0;i<button.size();i++) {
   	   System.out.println("button:"+button.get(i).getAttribute("value"));
   	   
      }
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
