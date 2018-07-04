package TestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryResizeable {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable");
	    Thread.sleep(5000);
		driver.switchTo().frame(0);
			//	WebElement e1=driver.findElement(By.id("resizable"));
				Actions a=new Actions(driver);
				WebElement e2=	driver.findElement(By.xpath("(//*[@class='ui-resizable-handle ui-resizable-s']/following::*)"));
				a.dragAndDropBy(e2, 100,20).build().perform();
				//or 
			//	a.clickAndHold(e2).moveByOffset(100, 30).build().perform();
	}

}
