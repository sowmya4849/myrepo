package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_ex {
	
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//*[@class='row1 adult-infant-child']/div[2]")).click();
         //Select se=new Select(driver.findElement(By.xpath("//*[@class='row1 adult-infant-child']/div[2]")));
		WebElement adult = 	driver.findElement(By.xpath("//*[@id='spanAudlt']/following::span[1]"));
		WebElement child = 	driver.findElement(By.xpath("//*[@id='spanChild']/following::span[1]"));
		WebElement infant = 	driver.findElement(By.xpath("//*[@id='spanInfant']/following::span[1]"));

	    int adult1=5;
        for(int i=0;i<adult1-1;i++) {
        	adult.click();
	   }
        int child1=2;
        for(int i=0;i<child1;i++) {
        	child.click();
	   }
        int infant1=2;
        for(int i=0;i<infant1;i++) {
        	infant.click();
	   }
        driver.findElement(By.xpath("(//*[@class='buttonN'])[1]")).click();
        
	}
}