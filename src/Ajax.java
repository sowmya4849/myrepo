import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ajax {
	public WebDriver driver;


  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  Thread.sleep(5000);
	  String str=driver.findElement(By.xpath("//*[@role='listbox']")).getText();
	  System.out.println(str);
	  String s[]=str.split("\n");
	  System.out.println(s.length);
	  for(int i=0;i<s.length;i++) {
		  if(s[i].equalsIgnoreCase("selenium tutorial")) {
			  driver.findElement(By.id("lst-ib")).clear();
			  driver.findElement(By.id("lst-ib")).sendKeys(s[i]);
			  driver.findElement(By.cssSelector("input.lsb")).click();
		  }
	  }  
	  
  }
  @BeforeTest
  public void beforetest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
}
}