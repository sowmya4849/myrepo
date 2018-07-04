import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_login {
	WebDriver driver;
	public void openURL() {
		driver=new FirefoxDriver();
		driver.get("http://www.yahoo.com");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
	}
	 public void Testcaselogin() {
		 driver.findElement(By.linkText("Sign in")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("login-username")).sendKeys("testengineer4selenium");
		  driver.findElement(By.id("login-signin")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("login-passwd")).sendKeys("selenium123");
		  driver.findElement(By.name("verifyPassword")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	 public void Testcaselogout() {
		 driver.findElement(By.xpath("//*[@id='uh-profile']/button")).click(); 
		//driver.findElement(By.partialLinkText("Test")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id='uh-signout']")).click();
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yahoo_login g=new Yahoo_login();
		g.openURL();
		g.Testcaselogin();
		g.Testcaselogout();
	}

}
