// Write a java program to evaluate two statements each using Logical OR and Logical And operator.
import java.util.Scanner;
class MainClass1
{
public static void main(String[] args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter four  values "); 
 int a= sc.nextInt();
 int b= sc.nextInt();
 int c= sc.nextInt();
 int d= sc.nextInt();
 if(a>b&&c>d)
{
System.out.println("the locial AND statement is valid"); 
}
else
{
System.out.println("the AND statement in if  is invalid"); 
}
if(a>b||c>d)
{
System.out.println("the locial OR statement is valid");
}
else
{
 System.out.println("the OR statement in if  is invalid");
}
}
}