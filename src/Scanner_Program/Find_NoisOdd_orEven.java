package Scanner_Program;

import java.util.Scanner;

public class Find_NoisOdd_orEven 
{
public static void main(String[] args) 
 {	
  int num;
  System.out.println("Number is:");
  Scanner r = new Scanner(System.in);
  num = r.nextInt();
  
  if (num%2 == 0)
  {
	System.out.println("Numer is even");
  }
 else
  {
	System.out.println("Number is odd");
  }
 }
}


