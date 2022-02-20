import java.util.*;
class ArrayEx
{
	public static void main(String[] args)
	{
		int[] arr=new int[20];
		System.out.println("Enter 20 integer values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<20;i++)
		{
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+",");
		}
	}
}