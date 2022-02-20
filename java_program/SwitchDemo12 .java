import java.util.Scanner;
class SwitchDemo12
{
    public static void main(String[] args) 
 {
    System.out.println( "enter a no between 1 & 12");
    Scanner sc=new Scanner(System.in);
    int m =sc.nextInt();
    System.out.println(m++);
    System.out.println(++m);
    }
 }