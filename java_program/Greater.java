import java.util.Scanner;
class Greater
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int a,b,c,temp,great;
System.out.println("Enter three no");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
temp=a>b?a:b;
great=c>temp?c:temp;
System.out.println("The greater is ="+great);
}
}

