package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMSLogin {
	public static WebDriver driver;

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumbymahesh.com/HMS");
		driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin");
		  driver.findElement(By.name("submit")).click();

	}

}
