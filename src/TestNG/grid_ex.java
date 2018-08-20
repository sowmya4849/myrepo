package TestNG;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class grid_ex {
	@Parameters({"browser"})
	@Test
    public void mailTest(String browser) throws Exception{
		WebDriver driver=null;
             DesiredCapabilities dr=null;
             if(browser.equalsIgnoreCase("firefox")){
            	 System.setProperty("webdriver.gecko.driver","E:\\mindq\\geckodriver.exe");
        		 driver=new FirefoxDriver();        
        		 dr=DesiredCapabilities.firefox();
             dr.setBrowserName("firefox");
             dr.setPlatform(Platform.WINDOWS);
             }else   if(browser.equalsIgnoreCase("ie")) {
            	 System.setProperty("webdriver.ie.driver","E:\\mindq\\IEDriverServer.exe");
           		 driver=new InternetExplorerDriver();
                      dr=DesiredCapabilities.internetExplorer();
                      dr.setBrowserName("iexplore");
                      dr.setPlatform(Platform.WINDOWS);
             } else if (browser.equalsIgnoreCase("chrome")) {
            	 System.setProperty("webdriver.chrome.driver","E:\\mindq\\chromedriver.exe");
        		 driver=new ChromeDriver();
        		 dr=DesiredCapabilities.chrome();
        		 dr.setBrowserName("chrome");
        		 dr.setPlatform(Platform.WINDOWS);
             }
             String huburl="http://192.168.0.7:4444/wd/hub";
              driver=new RemoteWebDriver(new URL(huburl),dr);
             driver.navigate().to("seleniumbymahesh.com/HMS");
             driver.findElement(By.name("username")) .sendKeys("admin");
             driver.findElement(By.name("password")) .sendKeys("admin");
             driver.close();
	
	}
}
