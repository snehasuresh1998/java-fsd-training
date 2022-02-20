import java.util.Scanner;
class CollegeClass1
{ 
public static double attence(double n1,double n2)
{
 double a=n2*100/n1;
 return a;
}
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter number of classes held");
 double s1= sc.nextDouble();
 System.out.println("Enter number of classes attended.");
 double y1= sc.nextDouble();
 double p=attence(s1,y1);
if(p>75)
{
  
  System.out.println("You are allowed to sit in exam ");
  
}
else
 System.out.println("You are not allowed to sit in exam");
}
}
