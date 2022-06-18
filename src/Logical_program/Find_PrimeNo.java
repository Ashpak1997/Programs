package Logical_program;

public class Find_PrimeNo
{
public static void main(String[] args)   
{
  int i = 0;
  int b = 0;
  
  String PrimeNumber = " ";
  
  for (i = 1; i <= 100; i++)         
  { 		  	  
     int counter=0; 	  
     for(b =i; b>=1; b--)
    {
        if(i%b==0)
    {
	counter = counter + 1;
    }
 }
 if (counter ==2)
 {
    //Appended the Prime number to the String
	 PrimeNumber = PrimeNumber + i + " ";
 }	
  }	
  System.out.println("Prime numbers from 1 to 100 are :");
  System.out.println(PrimeNumber);
		  
}
}
