package Logical_program;

public class Armstrong_3digit 
{
public static void main(String[] args) 
 {
	int reminder = 0;
	int reverse = 0;
	int number = 153;
	int ans = number;
	
	while (number>0) 
	{
		reminder = number%10;   
		reverse = reverse + (reminder*reminder*reminder);
		number = number/10; 
	}
	if (ans==reverse)
	{
		System.out.println(ans +" is Armstrong Number");
	}
	else
	{
		System.out.println(ans +" is Not Armstrong Number");
	}
 }	
}

// Armstrong Number = 0,1,153,370,407,1634,8208,9474
// 153 = (1*1*1)+(5*5*5)+(3*3*3)
// 1634 = (1*1*1*1)+(6*6*6*6)+(3*3*3*3)+(4*4*4*4)
// power of number of digits


