package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JquerySelectable {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable");
	    Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.xpath("(//*[@id='selectable']/descendant::*)[1]"));
		WebElement e2=driver.findElement(By.xpath("(//*[@id='selectable']/descendant::*)[2]"));
		WebElement e3=driver.findElement(By.xpath("(//*[@id='selectable']/descendant::*)[3]"));
		Actions a=new Actions(driver);
		a.clickAndHold(e1).clickAndHold(e2).clickAndHold(e3).build().perform();
	}

}
