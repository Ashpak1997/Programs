package Logical_program;

public class Armstrong_3digit 
{
public static void main(String[] args) 
 {
	int a = 153;
	int b = a;
	int sum = 0;
	int c;
	
	while (a>0) 
	{
	  c = a%10;
	  sum = sum + c*c*c;
	  a = a/10;
	}
	if (b==sum)
	{
		System.out.println(b +" is Armstrong Number");
	}
	else
	{
		System.out.println(b +" is Not Armstrong Number");
	}
 }	
}

// Armstrong Number = 0,1,153,370,407,1634,8208,9474
// 153 = (1*1*1)+(5*5*5)+(3*3*3)
// 1634 = (1*1*1*1)+(6*6*6*6)+(3*3*3*3)+(4*4*4*4)
// power of number of digits
