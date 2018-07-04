import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Spicejetonewaysearch {
	public WebDriver driver;
	
  public void onewaysearch(String a, String c, String i) throws Exception{
	  driver.get("http://www.spicejet.com");
	  driver.get(a);
	  driver.get(c);
	  driver.get(i);
	  
  }
  
  
  @Test(description="this test case is to verify one way search with 1A 0C 0I")
  public void Test01() throws Exception{
	  onewaysearch("1","0","0");
  }
  @Test(description="this test case is to verify one way search with 2A 1C 0I")
  public void Test02() throws Exception{
	  onewaysearch("2","1","0");
  }
  @Test(description="this test case is to verify one way search with 3A 2C 1I")
  public void Test03() throws Exception{
	  onewaysearch("3","2","1");
  }
  @BeforeTest
  public void beforetest() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
  }
  
  
}
