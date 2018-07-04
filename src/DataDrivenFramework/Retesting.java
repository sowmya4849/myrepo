package DataDrivenFramework;

	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;

	import java.io.FileInputStream;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.BeforeTest;

	public class Retesting {
		public WebDriver driver;
		public FileInputStream fi;
		public Workbook w;
		public Sheet s;

		@Test
		public void f() throws Exception {
			fi = new FileInputStream("D:\\WORKSPACE_10NOV_6AM\\SeleniumAutomation\\testdata\\driverscript.xls");
			w = Workbook.getWorkbook(fi);
			s = w.getSheet("Sheet1");

			for(int c=3;c<s.getColumns();c++)
			{
			for (int i = 1; i < s.getRows(); i++) {

				
					if (s.getCell(2, i).getContents().equalsIgnoreCase("textbox")) {
						driver.findElement(By.xpath(s.getCell(0, i).getContents())).sendKeys(s.getCell(c, i).getContents());
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("dropdown")) {
						new Select(driver.findElement(By.xpath(s.getCell(0, i).getContents())))
								.selectByVisibleText(s.getCell(c, i).getContents());
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("button")) {
						driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("radiobutton")) {
						driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("checkbox")) {
						driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("link")) {
						driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("image")) {
						driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("url")) {
						driver.get(s.getCell(0, i).getContents());
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("wait")) {
						Thread.sleep(6000);
					}
					
					else if(s.getCell(2, i).getContents().equalsIgnoreCase("alert"))
					{
					if (s.getCell(3, i).getContents().equalsIgnoreCase("ok"))
						{
							driver.switchTo().alert().accept();
						}
							else
							{
								driver.switchTo().alert().dismiss();
							}
						}
					}
			}

			}
		

		@BeforeTest
		public void beforeTest() {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}