import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_login {
	WebDriver driver;
	public void openURL() {
		driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
	}
	 public void Testcaselogin() {
		  driver.findElement(By.id("identifierId")).sendKeys("acetesting001");
		  driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("talentsprint2017");
		  driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	 public void Testcaselogout() {
		 driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click(); 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id='gb_71']")).click();
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail_login g=new Gmail_login();
		g.openURL();
		g.Testcaselogin();
		g.Testcaselogout();
	}

}
