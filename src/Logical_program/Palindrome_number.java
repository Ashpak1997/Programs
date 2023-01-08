package Logical_program;  //121 = 121 (After reverse)

public class Palindrome_number 
{
public static void main(String[] args) 
	 {
		int reminder = 0;
		int reverse = 0;
		int number = 121;
		int ans = number;
		
		while (number>0) 
		{
			reminder = number%10;   
			reverse = reverse*10+reminder;
			number = number/10; 
		}
		if (ans==reverse)
		{
			System.out.println(ans +" is Palindrome_number");
		}
		else
		{
			System.out.println(ans +" is Not Palindrome_number");
		}
	 }	 
}




