package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class paralleltesting_using_grid {
	public DesiredCapabilities cap;
	public  WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.linkText("HMS")).click();
	  
	  
  }
  @Parameters("browser")
  @BeforeTest
  public void beforeTest(String str) throws Exception {
	if(str.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver", "‪E:\\Selenium\\geckodriver.exe");
		 driver=new FirefoxDriver();
		  /* cap=new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			FirefoxOptions opt=new FirefoxOptions();
			opt.merge(cap);*/
		   }
		   else if(str.equalsIgnoreCase("chrome")) {
			   System.setProperty("webdriver.chrome.driver", "‪E:\\Selenium\\chromedriver.exe");
				 driver=new ChromeDriver();
			  /*  cap=new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				ChromeOptions opt=new ChromeOptions();
				opt.merge(cap);*/
	  }
		   else if(str.equalsIgnoreCase("ie")) {
			   System.setProperty("webdriver.chrome.driver", "‪‪E:\\Selenium\\IEDriverServer.exe");
				 driver=new InternetExplorerDriver();
			   	/*cap=new DesiredCapabilities();
				cap.setBrowserName("ie");
				cap.setPlatform(Platform.WINDOWS);
				InternetExplorerOptions opt=new InternetExplorerOptions();
				opt.merge(cap);*/
	 }
	/*  String huburl="http://192.168.0.4:4444/wd/hub";
	     driver=new RemoteWebDriver(new URL(huburl), cap);*/
		driver.get("http://www.seleniumbymahesh.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
