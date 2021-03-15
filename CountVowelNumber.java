package CSE215_labtask_05;

import java.util.Scanner;

public class CountVowelNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String arg = input.nextLine();
		
		System.out.print("The number of vowels: " + countVowels( arg));
		
		input.close();
	}
	
	public static int countVowels(String arg) {
		int count = 0;
        for (int i = 0; i < arg.length(); i++)
        {
            if (arg.charAt(i) == 'a' || arg.charAt(i) == 'e' || arg.charAt(i) == 'i'
                    || arg.charAt(i) == 'o' || arg.charAt(i) == 'u' || arg.charAt(i) == 'A' || arg.charAt(i) == 'E' || arg.charAt(i) == 'I'
                    || arg.charAt(i) == 'O' || arg.charAt(i) == 'U')
            {
                count++;
            }
        }
        return count;
	}

}
