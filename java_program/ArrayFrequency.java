import java.util.*;
class ArrayFrequency
{
	public static  void main (String[] args)
	 {  
	 	int count=0;
		System.out.println("Enter the size of the array:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
        System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
         arr[i]=sc.nextInt();
		}
		 System.out.println("Enter a search element in the array:");
		 int element =sc.nextInt();
		 for(int i=0;i<n;i++)
		{
         if (arr[i]==element)
         {
         	 count = count + 1;
         }
		}
		System.out.println("The frequency of the element  " + element + " is " + count);
}
}