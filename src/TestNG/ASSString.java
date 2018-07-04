package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class ASSString {
  @Test
  public void f() {
	  String str="mahesh";
	  if(str.contains("mahe")) {
		  System.out.println(str);
	  }else {
		  System.out.println("not matching");
	  }
		  
  }
 
}
