package DataDrivenFramework;




	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;

	import java.io.FileInputStream;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;

	public class Login_OR {

		public WebDriver driver;
		public FileInputStream fi;
		public Workbook w;
		public Sheet s, s1;

		@Test
		public void verifyLogin() throws Exception {
			fi = new FileInputStream("F:\\TestData\\gmail.xls");
			w = Workbook.getWorkbook(fi);
			s = w.getSheet("Sheet1");

			driver.findElement(By.id(s.getCell(0, 1).getContents())).sendKeys("chsowmya62");
			driver.findElement(By.xpath(s.getCell(1, 1).getContents())).click();
			Thread.sleep(3000);
			driver.findElement(By.name(s.getCell(2, 1).getContents())).sendKeys("rishitsai");
			driver.findElement(By.xpath(s.getCell(3, 1).getContents())).click();
			Thread.sleep(8000);
		}

		@Test
		public void verifyLogout() {
			s1 = w.getSheet("Sheet2");
			driver.findElement(By.xpath(s1.getCell(0, 1).getContents())).click();
			driver.findElement(By.id(s1.getCell(1, 1).getContents())).click();
		}

		@BeforeTest
		public void beforeTest() {
			driver = new FirefoxDriver();
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
		}

	}


