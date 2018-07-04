package TestNG;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airindia {
	
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.airindia.in/contact-details.htm");
		List<WebElement> email=driver.findElements(By.xpath("//*[@class='linkText']"));
		System.out.println(email.size());
		for(int i=0;i<email.size();i++) {
			System.out.println(email.get(i).getText());
		}
		driver.close();
	}

}
