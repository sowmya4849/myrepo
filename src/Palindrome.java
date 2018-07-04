import org.testng.annotations.Test;

public class Palindrome {
	
  @Test
  public void f() {
	  String str,reverse="";
	  str="madam";
	  System.out.println(str.length());
	  for(int i=str.length()-1;i>=0;i--) {
		  reverse=reverse+str.charAt(i);
		  
	  }
	  System.out.println(reverse);
	  if(str.equals(reverse))
	  {
		  System.out.println("it is  a palindrome");
	  }
	  else {
		  System.out.println("it is not a palindrome");
	  }
	}
}
