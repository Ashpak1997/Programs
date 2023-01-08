package Logical_program;

public class FindLargest_NoFromArray 
{
public static void main(String args[]){
  int temp, size;
  int array[] = {10, 20, 205, 63, 96, 57};
  size = array.length;

  for(int i = 0; i<size; i++ )
  {
    for(int j = i+1; j<size; j++)
    {
	  if(array[i]>array[j])
	    {
	      temp = array[i];
	      array[i] = array[j];
	      array[j] = temp;
	    }
	}
  }
System.out.println("largest No is:: "+array[size-1]);
}
}













