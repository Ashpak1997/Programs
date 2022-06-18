package Logical_program;

public class Factorial 
{
public static void main(String[] args) 
{

   int n = 5;
   int fact  = 1;
  
//   for (int i=1; i<=5; i++)   // 1st way
//   {
// 	  fact = fact*i;
//   }
   
   for (int i=5; i>=1; i--)    // 2nd way
   {
 	  fact = fact*i;
   }
  System.out.println(fact);
 }
}
