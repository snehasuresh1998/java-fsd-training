import java.util.Scanner;
import java.io.*;
class Company
{ 
public static double EmployeeBonus(double s)
{
 double bonus=s*5/100;
 return bonus;
}
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your salary");
 double s1= sc.nextDouble();
 System.out.println("year of service");
 int y1= sc.nextInt();
if(y1>5)
{
  
  double b=EmployeeBonus(s1);
  System.out.println("your bonus amount is "+ b);
  System.out.println("Bonus amount "+ b);
  double salarynew=b+s1;
  System.out.println("New salary "+ salarynew);
}
else
 System.out.println("No bonus aplicable ");
 System.out.println("salary "+ s1);
}
}
