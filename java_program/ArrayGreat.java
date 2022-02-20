import java.util.*;
class ArrayGreat
{


public static  void main (String[] args)
	 {  
		System.out.println("Enter the size of the array:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
        System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
         arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
         if(arr[0]<arr[i])
         {
         	arr[0]=arr[i];
         }

		}
		System.out.println(" Array  largest element is:"+ arr[0]);
	}
}


