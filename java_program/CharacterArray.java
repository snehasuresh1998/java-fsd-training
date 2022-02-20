/*Write a program to take input of a String and convert it into a character array and reverse the array,
and to again make that reversed character array as a String and display it.*/
import java.util.*;
import java.lang.*;
 class CharacterArray
{
	
public static void main(String[] args)
 {
 	Scanner sc = new Scanner(System.in);
 	String s1;
 	System.out.println("Enter the string value :");
 	s1=sc.nextLine();
 	int n=s1.length();
 	char[] ch =new char[n];
 	char[] arr =new char[n];
 	for( int i=0;i<n;i++)
 	{
 		ch[i]=s1.charAt(i);
 	}
 	System.out.println("The character array:");
 	for( int i=0;i<n;i++)
 	{
 		System.out.println(ch[i]);
 	}
 	int temp=n-1;
    for(int i=0;i<n;i++)
    {   
		arr[temp]=ch[i];
		temp=temp-1;
	}
	System.out.println("The  reverse character array:");
	for(int i=0;i<n;i++)
    {   
	System.out.println(arr[i]);
	
	}
	System.out.println("");
	String str = String.valueOf(arr);
    System.out.println("The reverse String: "+str);
}
}


