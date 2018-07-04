import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;

public class Facebook_Login_Logout {

	WebDriver driver;
	public Screen s;
	public void openURL() {
		driver=new FirefoxDriver();
		s=new Screen();
		driver.get("http://www.facebook.com");
	}
	
	public void Login()throws Exception {
		driver.findElement(By.id("email")).sendKeys("testengineer4selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selenium123");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);
      //  s.click("E:\\sikuliImages.sikuli\\1521621829684.png");
		//Thread.sleep(5000);
		//s.click("E:\\sikuliImages.sikuli\\1521622039502.png");
		//Thread.sleep(5000);
		//s.click("E:\\sikuliImages.sikuli\\1521622322936.png");
		//Thread.sleep(5000);
		s.click("E:\\sikuliImages.sikuli\\1521646935699.png");
	}
	public void Logout() {
		driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	    driver.findElement(By.partialLinkText("Log out")).click();
	}
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Facebook_Login_Logout fb=new Facebook_Login_Logout();
		fb.openURL();
		fb.Login();
		fb.Logout();
	}

}
