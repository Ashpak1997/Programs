package Logical_program;

public class Reverse_the_string 
{
	public static void main(String[] args) 
	{	
	    String name = "I am Ashpak";
	  
	    int leng = name.length();
	    System.out.println(leng);
	  
	    String riv = "";
	  
	    for (int i=leng-1; i>=0; i--)
	      {
		    riv=riv+name.charAt(i);
	      }
	    System.out.println(riv);  
	    
	    
	    
	    
	    
	    
System.out.println("================================================");
	    
	    StringBuffer name1 = new StringBuffer("Maharashtra");
	    System.out.println(name1.reverse());

System.out.println("================================================");    
	    
	    StringBuilder name2 = new StringBuilder("Samsherpur");
	    System.out.println(name2.reverse());
    
}
}
