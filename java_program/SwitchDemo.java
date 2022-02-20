import java.util.Scanner;
class SwitchDemo {
    public static void main(String[] args)
    {
    System.out.println("1.add,2,substract,3.product");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=30,b=10;
    switch(n)
       {
        case 1:
             int sum=a+b;
             System.out.println("sum=",sum); 
             break;
        case 2:
             int sub=a-b;
             System.out.println("difference=",sum); 
             break;
            
        case 3:
             int product=a*b;
             System.out.println("product=",product); 
             break;
            
       default:
           System.out.println("invalid entry"); 
}
}
}
            