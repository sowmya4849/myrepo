import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingWebtable {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  String str=driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_originStation1_CTNR']")).getText();
	  System.out.println(str);
	  String s[]=str.split("\n");
	  System.out.println(s.length);
	  for(int i=0;i<s.length;i++) {
		  if(s[i].equalsIgnoreCase("Bengaluru (BLR)")) {
			  System.out.println(s[i]);
		  }
		  else if(s[i].equalsIgnoreCase("Chennai (MAA)")){
			  System.out.println(s[i]);
		  }
		  else if(s[i].equalsIgnoreCase("Hyderabad (HYD)")){
			  System.out.println(s[i]);
		  }
	  }
  }
  @BeforeTest
  public void beforetest() {
	   System.setProperty("webdriver.gecko.driver", "E:\\mindq\\geckodriver.exe");
	     driver=new FirefoxDriver();
	  driver.get("http://www.spicejet.com");
	  driver.manage().window().maximize();
  }
}
