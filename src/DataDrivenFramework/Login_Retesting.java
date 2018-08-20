package DataDrivenFramework;


	

	import java.io.FileInputStream;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;

	public class Login_Retesting {

		public WebDriver driver;
		//public Selenium selenium;
		public FileInputStream fi;
		public Workbook w;
		public Sheet s;

		@Test
		public void f() throws Exception {
			fi = new FileInputStream("F:\\TestData\\hms.xls");
			w = Workbook.getWorkbook(fi);
			s = w.getSheet("Sheet1");

			for (int i = 1; i < s.getRows(); i++) {
				driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
				driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
				driver.findElement(By.name("submit")).click();
				Thread.sleep(5000);

				/*
				 * if(selenium.isElementPresent("link=Logout"))
				 * //if(driver.findElement(By.linkText("Logout")).isDisplayed()) {
				 * System.out.println("Valid Credential");
				 * driver.findElement(By.linkText("Logout")).click(); //
				 * selenium.click("link=Logout"); } else { System.out.println(
				 * "Invalid Credential"); }
				 */

				try {
					driver.findElement(By.linkText("Logout")).isDisplayed();
					System.out.println("Valid Credential");
					driver.findElement(By.linkText("Logout")).click();

				} catch (Exception e) {
					System.out.println("Invalid Credential");
					driver.switchTo().alert().accept();
				}

			}
		}

		@BeforeTest
		public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
			driver = new ChromeDriver();
			
		//	driver = new FirefoxDriver();
			driver.get("http://www.seleniumbymahesh.com/HMS");
		//	selenium = new WebDriverBackedSelenium(driver, "http://www.seleniumbymahesh.com/HMS");
			driver.manage().window().maximize();
		}

	}


