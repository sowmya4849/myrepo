package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Login_DP {
	WebDriver driver;
	
	
  @Test(dataProvider = "Authentication")
 
  public void login(String username, String password) {
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("submit")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Logout")).click();
  }
  @DataProvider(name="Authentication")
  public Object[][] dp() {
    return new Object[][] {{"user1","user1"},{"mahesh","mahesh"},{"admin","admin"}
     
    };
  }
 
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
