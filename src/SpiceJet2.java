import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SpiceJet2 {

	WebDriver driver;
	
	public void openURL() {
		driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
	}
	public void oneDaySearch() throws Exception {
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Hyderabad");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Bengaluru");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[7]/a")).click();
		Select se=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		se.selectByValue("1");
		Select ch=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		ch.selectByValue("2");
		Select in=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		in.selectByValue("3");
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(5000);
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SpiceJet2 sj=new SpiceJet2();
		sj.openURL();
		sj.oneDaySearch();
	}

}
