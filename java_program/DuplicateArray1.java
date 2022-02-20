import java.util.*;
public class DuplicateArray1
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
			for(int j=i+1;j<n;j++)
		       {
                if(arr[i]==arr[j])
                {  
          	        System.out.println("The duplicate element is "+ arr[i]);
                }
		 }
       
       
		}
       
	}
}