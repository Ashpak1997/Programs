package Logical_program;

public class FindDuplicateString_FromArray 
{
public static void main(String[] args) 
{
   String str = "Ashpak Alimahmad Shaikh";
   
   char[] count = str.toCharArray(); // A s h p ...
  
   System.err.println("The string is:" + str);
   
   System.out.print("Duplicate Characters in string: ");
   for (int i = 0; i < str.length(); i++) 
   {
      for (int j = i + 1; j < str.length(); j++) 
      {
         if (count[i] == count[j]) 
         {
            System.out.print(count[j] + " ");
            break;
         }
      }
   }
}  
}



