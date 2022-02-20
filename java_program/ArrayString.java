import java.util.*;
class ArrayString
{
	public static  void main (String[] args)
	 {  
		System.out.println("Enter the size of the array:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr=new String[n];
		String[] arr1=new String[n];
        System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
         arr[i]=sc.next();
		}
		System.out.println("The array elements are :");
		for(int i=0;i<n;i++)
		{
         System.out.println(arr[i]);
		}
		int temp=n-1;
		for(int i=0;i<n;i++)
		{   
			arr1[temp]=arr[i];
			temp=temp-1;

		}
		System.out.print("The reverse array elements are :");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+ arr1[i]);
		}


    }
}