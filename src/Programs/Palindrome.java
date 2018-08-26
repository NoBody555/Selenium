package Programs;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPal(String s){
		// if length is 0 or 1 then String is palindrome
		if(s.length() ==0 || s.length() ==1)
			return true;
	           //madam
			if(s.charAt(0) == s.charAt(s.length()-1))
				  /* check for first and last char of String:
		         * if they are same then do the same thing for a substring
		         * with first and last char removed. and carry on this
		         * until you string completes or condition fails
		         * Function calling itself: Recursion
		         */
				return isPal(s.substring(1, s.length()-1));
				/* If program control reaches to this statement it means
		         * the String is not palindrome hence return false.
		         */
				return false;
			
		
	}public static void main(String[] args) {
		
		
		Scanner user = new Scanner(System.in);
		System.out.println("Enter the strng to find out if its palindrome or not");
		
		 String text = user.nextLine();
		 
		 if(isPal(text))
			 System.out.println("it is palindrome ");
		 else{
			 System.out.println("it is not palindrome");
		 }
	}
	
	
	
	
}
