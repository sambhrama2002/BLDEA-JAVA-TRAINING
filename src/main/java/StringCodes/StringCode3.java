package StringCodes;

import java.util.Scanner;

public class StringCode3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
    		  System.out.println("Enter the String-1:");
    		  String str1 = sc.next();
    		  System.out.println("Enter the string-2:");
    		  String str2 = sc.next();
    		  
    		  if(str1.equalsIgnoreCase(str2)==true) {
    			  System.out.println("Strings are Equal");
    		  }
    		  else {
    			  System.out.println("Strings are not Equal");
    		  }
	}

}
