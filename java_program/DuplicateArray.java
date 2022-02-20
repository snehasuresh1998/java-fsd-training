import java.util.*;
public class DuplicateArray
{
	public static  void main (String[] args)
	 {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<=n;i++)
		{
         arr[i]=sc.nextInt();
		}
       for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
		{
          if(arr[i]==arr[j])
          {  
          	System.out.print("The duplicate element is "+ arr[i]);
          }
		}
       
       
		}
       
	}
}