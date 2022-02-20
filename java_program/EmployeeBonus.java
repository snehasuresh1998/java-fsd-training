import java.util.*;
class EmployeeBonus
{ 
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your Name :");
 String name=sc.next();
 System.out.println("Enter your salary");
 double s1= sc.nextDouble();
 System.out.println("Enter the year of joining : ");
 int y1= sc.nextInt();
if(y1<=2017 && s1>30000)
{
  
  double b=s1*22/100;
  System.out.println(" Name :"+ name);
  System.out.println("your bonus amount is "+ b);
  double salarynew=b+s1;
  System.out.println("New salary "+ salarynew);
}
else if (y1<=2017 && s1<30000) {
  double b=s1*33/100;
  System.out.println(" Name :"+ name);
  System.out.println("your bonus amount is "+ b);
  double salarynew=b+s1;
  System.out.println("New salary "+ salarynew);
	
}
else if(y1>=2012)
{
  double b=s1*40/100;
  System.out.println(" Name :"+ name);
  System.out.println("your bonus amount is "+ b);
  double salarynew=b+s1;
  System.out.println("New salary "+ salarynew);	
}
else if(y1>=2017 && s1<30000)
{
  double b=s1*15/100;
  System.out.println(" Name :"+ name);
  System.out.println("your bonus amount is "+ b);
  double salarynew=b+s1;
  System.out.println("New salary "+ salarynew);	
}
else if(y1>=2017 && s1>30000 )
{
  double b=s1*10/100;
  System.out.println(" Name :"+ name);
  System.out.println("your bonus amount is "+ b);
  double salarynew=b+s1;
  System.out.println("New salary "+ salarynew);
}
else
{
	System.out.println("You are not belong to any of the case");
}
}
}