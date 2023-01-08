package Logical_program;

public class Reverse_the_Numbers 
{
public static void main(String[] args) 
{
	int reminder = 0;
	int reverse = 0 ;
	int number = 54321;
	
	while(number != 0)
	 {
		reminder = number%10;   //provide reminder(lower)
		reverse = reverse*10+reminder; //  logic
		number = number/10;     // quecent (upper part)
	 }
	System.out.println(reverse);
}
}




