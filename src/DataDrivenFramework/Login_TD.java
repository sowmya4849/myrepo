package DataDrivenFramework;

	import java.io.FileInputStream;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;

	public class Login_TD {
		
		public WebDriver driver;
		
	  @Test
	  public void f() throws Exception {
		  FileInputStream fi=new FileInputStream("F:\\TestData\\hms.xls");
		  Workbook w=Workbook.getWorkbook(fi);
		  Sheet s=w.getSheet("Sheet1");
		  
			driver.findElement(By.name("username")).sendKeys(s.getCell(0, 1).getContents());
			driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
			driver.findElement(By.name("submit")).click();
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
		  driver.get("http://www.seleniumbymahesh.com/HMS");
		  driver.manage().window().maximize();
	  }

	}


