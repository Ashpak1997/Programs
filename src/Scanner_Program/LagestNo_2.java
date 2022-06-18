package Scanner_Program;

import java.util.Scanner;

public class LagestNo_2 
{
	public static void main(String[] args) 
	  {
		int Number1, Number2;
		System.out.println("Number 1 is :");
		Scanner r = new Scanner(System.in);
		Number1 = r.nextInt();

		System.out.println("Number 2 is :");
		Scanner t = new Scanner(System.in);
		Number2 = t.nextInt();
		
		System.err.println("Grater number is");
		
		if(Number1>Number2)
		 {
		   System.out.println(Number1);
		 }
		else
		 {
		   System.out.println(Number2);
		 }
	  }
}
