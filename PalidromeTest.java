package CSE215_labtask_05;

import java.util.Scanner;

public class PalidromeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String arg = input.nextLine();
		
		if(isPalidrome(arg)) {
			System.out.println(arg + " " + "is a Palindrome.");
		}
		else {
			System.out.println(arg + " " + "is not a Palindrome.");
		}
		
		input.close();
	}
	public static boolean isPalidrome(String arg) {
		String reverse = reverse(arg);
	       if(arg.equalsIgnoreCase(reverse)){
	           return true;
	       }
	       else {
	    	   return false;
	       }
	}
	public static String reverse(String arg) {
		if(arg == null || arg.isEmpty()) {
			return arg;
		}
		else {
			return arg.charAt(arg.length()- 1) 
	                + reverse(arg.substring(0, arg.length() - 1));
		}
	}

}
