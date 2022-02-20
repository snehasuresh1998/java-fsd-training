import java.util.Scanner;
class Smallest
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int a,b,c,temp,smallest;
System.out.println("Enter three no");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
temp=a<b?a:b;
smallest=c<temp?c:temp;
System.out.println("The Smallest is "+smallest);
}
}

