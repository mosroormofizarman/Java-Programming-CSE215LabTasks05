package CSE215_labtask_05;

import java.util.Scanner;

public class StaticVariableBalance {
	static double balance = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		do{
			num = input.nextInt();
			
			switch(num) {
			case 1:{
				double depo = input.nextDouble();
				deposit(depo);
				break;
			}
			case 2:{
				double with = input.nextDouble();
				withdraw(with);
				break;
			}
			case 3:{
				System.out.println(balance);
			}
			default:{
				
			}
		}
			
	  }while(num != 4);
		
		input.close();
	}
	
	public static double deposit(double amount) {
        balance+=amount;
        return balance;
    }
    public static double withdraw(double amount) {
        balance-=amount;
        return balance;
    }
}