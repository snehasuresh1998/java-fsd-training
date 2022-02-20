import java.util.Scanner;
import java.io.*;
class MultipleExm
{ 
static int i;
public static void multipleNo(int n)
{
 System.out.println("multiplication table for"+ n);
 for (i = 1; i <= 10 ; i++) 
  {
   int mul=n*i;
   System.out.println(mul);
 }
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Positive Integer");
int n= sc.nextInt();
multipleNo(n);
}
}
