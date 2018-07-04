import org.testng.annotations.Test;

public class split {
  @Test
  public void f() {
	  String str;
	  str="one,two,three,four,five,six";
	  String s[]=str.split(",");
	  System.out.println(s.length);
	  for(int i=0;i<s.length;i++) {
		  if(s[i].equalsIgnoreCase("three")) {
			  System.out.println(s[i]);
		  }
		  else if(s[i].equalsIgnoreCase("six")) {
			  System.out.println(s[i]);
		  }
		  
	  }
  }
}
