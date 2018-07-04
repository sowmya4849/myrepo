package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class HtmlDragandDrop {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/html/html5_draganddrop.asp");
	    Thread.sleep(5000);
	    WebElement e=  driver.findElement(By.xpath("(//*[@class='w3-clear nextprev'])[1]/following::div[1]"));
	    e.click();
	  // driver.findElement(By.xpath("//*[contains(text(),'Drag the W3Schools ')]/preceding-sibling::div[2]")).click();
	  //  WebElement e1=driver.findElement(By.xpath("(//*[@class='w3-clear nextprev'])[1]/following::img[1]"));
	   // WebElement e2=driver.findElement(By.xpath("(//*[@class='w3-clear nextprev'])[1]/following::div[2]"));
	 //   Actions a =new Actions(driver);
	  //  a.dragAndDrop(e1, e2).build().perform();
	    Screen s =new Screen();
	    Match e1=s.find("C:\\Users\\DELL\\Documents\\JavaEclipse\\MindQ\\drag.png");
	    Match e2=s.find("C:\\Users\\DELL\\Documents\\JavaEclipse\\MindQ\\drop.png");
	    s.dragDrop(e1,e2);
	 //   s.dragDrop(e, arg1)
	//    a.click(e).dragAndDrop(e1, e2).build().perform();
	     
	    
	}
}	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /*(String x=  driver.findElement(By.xpath("(//*[@class='w3-btn w3-margin-bottom w3-margin-top'])")).getText();
	    System.out.println(x);

	   WebElement e=driver.findElement(By.xpath("//*[@src='tryhtml5_draganddrop_ifr.htm']"));
			//   ("(//*[@class='w3-white w3-padding notranslate'])/iframe"));
	    driver.switchTo().frame(e);
	   WebElement e1=driver.findElement(By.xpath("//div[@id='div1']/child::img"));
	  // 		+ "(//*[@src='img_w3slogo.gif'])[1]"));
	 //  WebElement e1=driver.findElement(By.xpath("//*[@id='drag1']"));

		  WebElement e2=driver.findElement(By.xpath("//*[@id='div2']"));
	  //  WebElement e1=driver.findElement(By.xpath("//*[@id='mainLeaderboard']/following::div[2]"));
	 //   WebElement e2=driver.findElement(By.xpath("//*[@id='mainLeaderboard']/following::div[3]"));
	    Actions a =new Actions(driver);
	 //   a.clickAndHold(e1).dragAndDrop(e1, e2).build().perform();
	  a.dragAndDrop(e1, e2).build().perform();
	
	    
	}

}*/
