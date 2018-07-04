package TestNG;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMSapp {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Registration")).click();
		 List<WebElement>names=driver.findElements(By.xpath(".//*[@id='form1']/div[1]/table/tbody/tr/td[1]"));
	//System.out.println(names.size());
	int labels=names.size();
	  for (int i =0 ; i< labels ; i++){
             if(names.get(i).getText().contentEquals("Last Name*"))
      		   System.out.println( "labelname:"+names.get(i).getText());

            	 if(names.get(i).getText().contentEquals("Gender*"))

        		   System.out.println("labelname:"+ names.get(i).getText());
      }

  }

  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
	  
  }

}
