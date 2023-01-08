package Scanner_Program;

import java.util.Scanner;

public class factorial 
{
public static void main(String[] args) 
{   
	
	int num;
	int fact = 1;	 
	
	System.out.println("Number is :");	

	Scanner r = new Scanner(System.in);
	num = r.nextInt();
	
		
	for (int i=1; i<=num; i++)
	 {
	   fact = fact*i;
	 }
    System.out.println("factorial is "+fact);
  }
}


