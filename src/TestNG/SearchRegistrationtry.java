package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchRegistrationtry {
	public WebDriver driver;
	  String Name;
	  public WebElement element;

  @Test
  public void f() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Registration")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Registration List")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  element=  driver.findElement(By.xpath("//table//tr//td[2][contains(text(),'PR1562584677')]"));
		 String st= element.getText();
		 System.out.println(st);
		  element.click();
		  List<WebElement> rows = driver.findElements(By.tagName("tr"));
		  System.out.println("total rows"+rows.size());
		   int rowCount = driver.findElements(By.xpath("html/body/div[2]/div/div[2]")).size();//table

	      for (int i = 1; i <= rowCount; i++) 
	      {
	          String sCellValue = driver.findElement(By.xpath("//table//tr//td[2][contains(text(),'PR1562584677')]")).getText();
               System.out.println(sCellValue);
	          if (sCellValue.equalsIgnoreCase(element.getText())) 
	          {
	               driver.findElement(By.linkText("Edit")).click();
	          }
	      }
  }
		

  
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
