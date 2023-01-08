package Logical_program;

public class FindLargestNo_from4numbers 
{
public static void main(String[] args) 
{
 int n1 = 10;
 int n2 = 200;
 int n3 = 30;
 int n4 = 400;
 
 if(n1>n2)
 {
    if(n1>n3)
	 {
		if(n1>n4)
		{
			System.out.println(n1 + " is grater");
		}
		else
		{
			System.out.println(n4 + " is grater");
		}
	 }
	else
	{
		if(n3>n4)
		{
		  System.out.println(n3 + " is greater");	
		}
		else
		{
			System.out.println(n4 + " is grater");
		}	 
     }
 }
 else
 {
	 if(n2>n3)
	 {
		 if(n2>n4)
		 {
			 System.out.println(n2 + " is greater");
		 }
		 else
		 {
			 System.out.println(n4 + " is greater");
		 }
	 }
	 else
		 if(n3>n4)
		 {
			 System.out.println(n3 + " is greater");
		 }
		 else
		 {
			 System.out.println(n4+" is greater");
		 }
	 
 }
}
}


