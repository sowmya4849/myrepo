package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDraggable {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable");
	    Thread.sleep(5000);
		driver.switchTo().frame(0);
				WebElement e1=driver.findElement(By.id("draggable"));
				Actions a=new Actions(driver);
				a.clickAndHold(e1).dragAndDropBy(e1, 100, 100).build().perform();
				//a.dragAndDropBy(e1, 500, 500).build().perform();
	}

}
