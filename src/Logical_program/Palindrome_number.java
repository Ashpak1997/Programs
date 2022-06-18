package Logical_program;  //121 = 121 (After reverse)

public class Palindrome_number 
{
public static void main(String[] args) 
{
  int a = 122;
  int temp = a;  // fix the value
  int rev=0,rem;
  while(temp != 0)
    {
	  rem = temp%10;
	  rev=rev*10+rem;
	  temp=temp/10;
    }
  if(a==rev)
   {
	  System.out.println(a+ " Number is Palindrome number");
   }
  else
   {
	  System.out.println(a+" Number is Not Palindrome number");
   }
} 
}
