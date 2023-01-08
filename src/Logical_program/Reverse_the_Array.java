package Logical_program;

public class Reverse_the_Array 
{
public static void main(String[] args) 
{
   int ary [] = {1,2,3,4,5,6,7,8,9};
   int a = ary.length;
   System.out.println("length of array: "+a);
   
   for(int i=a-1; i>=0; i--)
   {
	   System.out.print(ary[i]+" ");
   }
  System.out.println();
}  
}












