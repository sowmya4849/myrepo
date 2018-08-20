import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class fb_login_Friendslist {
	WebDriver driver;
	Screen s;
	public void openURL() {
		s=new Screen();
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}
	
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("chsowmya59@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sowmya26@rishit");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} 
	public void Friendslist() throws Exception  {
		s.click("E:\\sikuliImages.sikuli\\1521646935699.png");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='navItem_100000919980751']/a/div")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, 20);

	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-tab-key='friends']"))));

		driver.findElement(By.xpath("//*[@data-tab-key='friends']")).click();
  
		  List<WebElement> listoffriends = driver.findElements(By.xpath("//div[@id='pagelet_timeline_medley_friends']/div[2]/div/ul/li/div/div/div[2]/div/div[2]/div/a"));
          System.out.println(listoffriends.size());

          int newfriends = listoffriends.size();
         
           int oldfriends = 0;
           Actions act = new Actions(driver);
           while(oldfriends != newfriends){
               oldfriends = newfriends ;
               WebElement lastfriend = listoffriends.get(newfriends-1);
               act.moveToElement(lastfriend).build().perform();
       		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
               listoffriends = driver.findElements(By.xpath("//div[@id='pagelet_timeline_medley_friends']/div[2]/div/ul/li/div/div/div[2]/div/div[2]/div/a"));             
               newfriends = listoffriends.size();
               System.out.println("New friends list : " + newfriends);
               System.out.println("Old friends list : " + oldfriends);
           }

           for (int i =0 ; i< newfriends ; i++){

               System.out.println("Friend name : " + listoffriends.get(i).getText());
           }
 }
		
	public void Logout() {
		driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.partialLinkText("Log Out")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	    driver.quit();
	}
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		fb_login_Friendslist fb=new fb_login_Friendslist();
		fb.openURL();
		fb.Login();
		fb.Friendslist();
		fb.Logout();
		
	}

}
