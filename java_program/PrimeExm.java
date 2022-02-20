import java.util.Scanner;
import java.io.*;
class PrimeExm
{ 
static int flag,i;
public static void primeNo(int n)
{
 for (i = 2; i <= n / 2; ++i) 
{

    if (n % i == 0) 
    {
      flag = 1;
      break;
    }
  }
  if (n == 0 || n == 1) {
    System.out.println("This is neither prime nor composite:"+n);
  } 
  else 
   {
    if (flag == 0)
      System.out.println("you entered a prime number:"+ n);
    else
      System.out.println("You entered a non  prime number:"+ n);
    }
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Positive Integer");
int n= sc.nextInt();
primeNo(n);
}
}
