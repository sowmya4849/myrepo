package DataDrivenFramework;


	

	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.write.Label;
	import jxl.write.WritableSheet;
	import jxl.write.WritableWorkbook;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.BeforeTest;

	public class DriverScript {

		public WebDriver driver;
		public FileInputStream fi;
		public Workbook w;
		public Sheet s;
		public FileOutputStream fo;
		public WritableWorkbook wb;
		public WritableSheet ws;
		public String str;

		@Test
		public void f() throws Exception {
			fi = new FileInputStream("D:\\WORKSPACE_10NOV_6AM\\SeleniumAutomation\\testdata\\driverscript.xls");
			w = Workbook.getWorkbook(fi);
			s = w.getSheet("Sheet3");

			fo = new FileOutputStream("D:\\WORKSPACE_10NOV_6AM\\SeleniumAutomation\\results\\driverscriptresults.xls");
			wb = Workbook.createWorkbook(fo);
			ws = wb.createSheet("results", 0);

			for (int i = 1; i < s.getRows(); i++) {

				try {

					if (s.getCell(2, i).getContents().equalsIgnoreCase("textbox")) {
						driver.findElement(By.xpath(s.getCell(0, i).getContents())).sendKeys(s.getCell(3, i).getContents());
					}

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("dropdown")) {
						new Select(driver.findElement(By.xpath(s.getCell(0, i).getContents())))
								.selectByVisibleText(s.getCell(3, i).getContents());
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

					else if (s.getCell(2, i).getContents().equalsIgnoreCase("alert")) {
						if (s.getCell(3, i).getContents().equalsIgnoreCase("ok")) {
							driver.switchTo().alert().accept();
						} else {
							driver.switchTo().alert().dismiss();
						}
					}
					str = "PASS";
				} catch (Exception e) {
					str = "FAIL";
				}
				Label rsult=new Label(4, i, str);
				ws.addCell(rsult);
				
				for (int j = 0; j < s.getColumns(); j++) {
					System.out.println(s.getCell(j, i).getContents());
					Label a = new Label(j, i, s.getCell(j, i).getContents());
					ws.addCell(a);
				}

			}
			Label or=new Label(0, 0, "Object Repository");
			Label dn=new Label(1, 0, "Display Name");
			Label ot=new Label(2, 0, "Object Type");
			Label td=new Label(3, 0, "Test Data");
			Label rs=new Label(4, 0, "Results");
			ws.addCell(or);
			ws.addCell(dn);
			ws.addCell(ot);
			ws.addCell(td);
			ws.addCell(rs);
			
			wb.write();
			wb.close();

		}

		@BeforeTest
		public void beforeTest() {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}

	


