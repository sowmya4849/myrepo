import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class youtube {
	WebDriver driver;
	public void openURL() {
		driver=new FirefoxDriver();
		driver.get("http://www.youtube.com"+"/results?search_query=selenium");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		
	}
	public void search() {
		
		/*WebElement ele=driver.findElement(By.xpath("//input[@id='search']"));
				ele.clear();
		ele.sendKeys("selenium");
		//driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		System.out.println("selenium");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ele.sendKeys(Keys.ENTER);
		System.out.println("enters");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver = new FirefoxDriver();
		String baseUrl = "http://www.youtube.com/";
		driver.get(baseUrl + "/results?search_query=selenium");*/
		driver.findElement(By.cssSelector("h3.style-scope.ytd-playlist-renderer > #video-title")).click();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		youtube u=new youtube();
		u.openURL();
		u.search();
	}

}
