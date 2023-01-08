package Scanner_Program;

import java.util.Scanner;

public class Do_White
{
	public static void main(String[] args) {

		int balance = 0;
		int minBalance = 500;
		int depositAmt = 0;

		Scanner amount = new Scanner(System.in);

		do {
			System.out.println("Enter the depsot amount");
			depositAmt = amount.nextInt();
		}
		while(depositAmt<minBalance);
		balance = depositAmt;
		System.out.println("Deposit succesful");
	}

}
