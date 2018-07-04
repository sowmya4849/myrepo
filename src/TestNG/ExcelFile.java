package TestNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.relation.Role;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelFile  {
	public Workbook w;

	public static void main(String[] args) throws IOException {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com"); 
        driver.manage().window().maximize(); 

      /*      FileInputStream file = new FileInputStream("C:\\Dhiman\\Automation\\seleniumtest.xls"); 
             w = new Workbook(file);
             sheet = w.getSheetAt(0);
            int noOfColumns = sheet.getRow(0).getLastCellNum();
            //System.out.println(noOfColumns);
            String[] Headers = new String[noOfColumns];
            for (int j=0;j<noOfColumns;j++){
                Headers[j] = sheet.getRow(0).getCell(j).getStringCellValue();
            }
                for (int a=0;a<noOfColumns;a++){
                    if(Headers[a].equals("Address")){
                        driver.findElement(By.id("lst-ib")).sendKeys(sheet.getRow(1).getCell(a).getStringCellValue());
                        break;
                        }
}
      workbook.close();
      file.close();
      driver.close();
      System.exit(0);*/
            }
}
/*	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	public Sheet s;
	
  @Test
  public void f() throws Exception {
	  
		
	 
		  fo=new FileOutputStream("C:\\Users\\DELL\\Documents\\Java Eclipse\\Data\\exceldata.xls");
		  wb=Workbook.createWorkbook(fo);
		  ws=wb.createSheet("results",0);
		  
		  Label un=new Label(0, 0, "User Name");
		  Label pw=new Label(1, 0, "Password");
		  Label rs=new Label(2, 0, "Results");
		  ws.addCell(un);
		  ws.addCell(pw);
		  ws.addCell(rs);
		  

  
		 // String[] headers = new String[] { "Header1", "Header2", "Header3" };

		 // Workbook workbook = new HSSFWorkbook();
		//  Sheet sheet = workbook.createSheet("EDR Raw Data");

		//  for (int rn=0; rn<headers.length; rn++) {
		   //  Row r = Sheet.
		    		 //createRow(rn);
			 
			//  Sheet.createRow(0).createCell(0).setCellValue("header1"); 
		   //  r.createCell(0).setCellValue(headers[rn]);
	//	  }
		  wb.write();
		  wb.close();
		  
	  }
}
	

	  
	 // sheet.createRow(0).createCell(0).setCellValue("header1");
	  /*  sheet.createRow(1).createCell(0).setCellValue("header2");
	  sheet.createRow(2).createCell(0).setCellValue("header3");
	  sheet.createRow(3).createCell(0).setCellValue("header4");
	  
	  String[] headers = new String[] { "Header1", "Header2", "Header3" };

	  Workbook workbook = new HSSFWorkbook();
	  Sheet sheet = workbook.createSheet("EDR Raw Data");

	  for (int rn=0; rn<headers.length; rn++) {
	     Row r = sheet.createRow(rn);
	     r.createCell(0).setCellValue(headers[rn]);
	  }
  }*/

