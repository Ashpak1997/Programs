package Scanner_Program;

import java.util.Scanner;

public class LargestNo_3 
{
public static void main(String[] args) 
{
 int n1, n2, n3;
 System.out.println("n1 is");
 Scanner r = new Scanner(System.in);n1 = r.nextInt();
 
 System.out.println("n2 is");
 Scanner t = new Scanner(System.in);n2 = t.nextInt();
 
 System.out.println("n3 is");
 Scanner s = new Scanner(System.in);n3 = s.nextInt();
 
 System.err.println("Greater number is");
 
 if (n1>n2)     // true
	 {
		if (n1>n3)
		 {
			System.out.println(n1);
		 } 
		else
		 {
			System.out.println(n3);
		 }
	  }
else          // false
	  {
		if (n2>n3)
		 {
			System.out.println(n2);
		 }
		else
		 {
		   System.out.println(n3);	
		}
	  }
 }
}