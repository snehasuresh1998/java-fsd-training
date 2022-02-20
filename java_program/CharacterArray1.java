import java.util.*;
import java.lang.*;
class CharacterArray1
{
 public static void main(String[] args)
 {
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the size of array :");
 	int size=sc.nextInt();
 	char[] s1=new char[size];
 	int[] asc=new int[size];
 	System.out.println("Enter the Character array elements :");
 	for(int i=0;i<size;i++)
 	{
 		s1[i]=sc.next().charAt(0);
 	}
 	
 	for(int i=0;i<size;i++)
 	{
 		asc[i]=s1[i];
 	}
    System.out.println("The ASCII values are :");
    for(int i=0;i<size;i++)
 	{
 		System.out.print(" "+ asc[i] +" ");
 	}

}
}