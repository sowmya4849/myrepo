package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchRegistration {
	public WebDriver driver;
	  String Name;
	  public WebElement element;

  @Test
  public void f() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Registration")).click();
		 driver.findElement(By.linkText("Registration List")).click();
		  element=  driver.findElement(By.xpath("//table//tr//td[2][contains(text(),'PR1562584677')]"));
		 String st= element.getText();
		 System.out.println(st);
		  element.click();
		  List<WebElement> rows = driver.findElements(By.tagName("tr"));
	//	  System.out.println("total rows"+rows.size());

	       
	        /*    if (cells.Count > 0)
	            {
	                String s = cells[i].Text;
	                if (s.Equals(filter))
	                {
	                    return row;
	                }
	            }
	        }
	        return null;*/
	       
		    for (WebElement row : rows)
		    {
		        List<WebElement> cells = row.findElements(By.tagName("td"));
		      //  System.out.println("totalcols"+cells.size());
		        
		        
		        for (WebElement cell: cells)
		        	//for(int i=0;i<cells.size();i++) {
		        		//if(cell.getText().equals(st))
		        	//	if(cell.getText().contains(element.getText())) {
		        	if (cell.getText().equals(element.getText())) {
			            cell.findElement(By.xpath("(//*[text()='Edit'])[3]")).click();

		        		System.out.println("hi");
		            System.out.println(cell.getText());
		        }
		    }
		        	//while(true) {
		       /* if (cells.get(1).getText().equals(element))
		        	System.out.println(cells.get(1).getText());
		        {
		        	
		            cells.get(9).findElement(By.linkText("Edit")).click();
		            return;
		        }*/
		   // }
		    }
		    
		/*WebElement element=  driver.findElement(By.xpath("//table//tr//td[2][contains(text(),'PR1897030282')]"));
			  String search=driver.findElement(By.name("search")).getText();
		if(element.equals(search)) {
			System.out.println(search);
			
		}

		  int rowCount = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/form/div/table")).size();

		    for (int i = 1; i <= rowCount; i++) 
		    {
		        String sCellValue = driver.findElement(By.xpath("XPATH Of Name row")).getText();
		        if (sCellValue.equalsIgnoreCase(Name)) 
		        {
		             driver.findElement(By.xpath("xpath of add")).click();
		        }
		    }
		  
		   // Get the table name
		    WebElement table = driver.findElement(By.xpath("//table//tr//td"));

		            // Get all the Table headers and look for one the element called quantity.
		            List<WebElement> allHeaders = table.findElements(By.tagName("th"));
		            System.out.println("This is the total numbers of headers" + allHeaders.size());
		            int quantityHead = 0;

		            // Get the column where the quantity is listed
		            for(WebElement header : allHeaders)
		            {
		                quantityHead++;
		                if(header.getText().equalsIgnoreCase("Quantity"))
		                {
		                    System.out.println(header.getText());
		                    System.out.println(quantityHead + " is the column number for the quantity");
		                }
		            }

		            // Now get all the TR elements from the table
		            List<WebElement> allRows = table.findElements(By.tagName("tr"));
		            System.out.println("This is how many allRows: " + allRows.size());

		            // This is how many items are in the order item table. number of rows - 1 coz top row is the headings
		            int z = allRows.size() - 1;
		            System.out.println("This is how many items are in the table : " + z );

		            // Work out the cells we need to get by
		            //  iterate over all the td
		            for (WebElement row : allRows) {

		                // now we have all the td
		                List<WebElement> cells = row.findElements(By.tagName("td"));

		                for (WebElement cell : cells) {

		                 for(int x=0; x <= allHeaders.size(); x++)
		                 {
		                     int y = x;

		                     // if y = the value where the qty header is then output the text of that cell
		                     if(y == quantityHead )
		                     {
		                         System.out.println();
		                         System.out.println("The quanity is: " + cell.getText());
		                     }
		                 }
		                 }
  }*/

  
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
