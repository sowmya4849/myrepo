package DataDrivenFramework;


	import java.io.FileInputStream;
	import java.io.FileOutputStream;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.write.Label;
	import jxl.write.WritableSheet;
	import jxl.write.WritableWorkbook;
	
	public class Login_Results {


		public WebDriver driver;
		public FileInputStream fi;
		public Workbook w;
		public Sheet s;
		public FileOutputStream fo;
		public WritableWorkbook wb;
		public WritableSheet ws;
		public String str;

		@Test
		public void Step03() throws Exception {
			fi = new FileInputStream("F:\\TestData\\hms.xls");
			w = Workbook.getWorkbook(fi);
			s = w.getSheet("Sheet1");

			fo = new FileOutputStream("F:\\results\\results.xls");
			wb = Workbook.createWorkbook(fo);
			ws = wb.createSheet("results", 0);

			for (int i = 1; i < s.getRows(); i++) {
				driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
				driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
				driver.findElement(By.name("submit")).click();
				Thread.sleep(5000);

				try {
					driver.findElement(By.linkText("Logout")).isDisplayed();
					System.out.println("Valid Credential");
					str = "PASS";
					driver.findElement(By.linkText("Logout")).click();

				} catch (Exception e) {
					System.out.println("Invalid Credential");
					str = "FAIL";
				}
				for (int j = 0; j < s.getColumns(); j++) {
					System.out.println(s.getCell(j, i).getContents());
					Label a = new Label(j, i, s.getCell(j, i).getContents());
					ws.addCell(a);
				}
				Label results = new Label(2, i, str);
				ws.addCell(results);

			}
			Label un = new Label(0, 0, "User Name");
			Label pw = new Label(1, 0, "Password");
			Label rs = new Label(2, 0, "Results");
			ws.addCell(un);
			ws.addCell(pw);
			ws.addCell(rs);
			
			wb.write();
			wb.close();
		}

		@BeforeTest
		public void beforeTest() {
			driver = new FirefoxDriver();
			driver.get("http://www.seleniumbymahesh.com/HMS");
			driver.manage().window().maximize();
		}

	}


