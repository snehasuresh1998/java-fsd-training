//Write a java program to implement an abstract class with two abstract methods and one non-abstract method.

abstract class ExampleA
{
abstract void count();
abstract void sum();
void display()
{
System.out.println("This is abstract class");
}
}
class Exmp extends ExampleA
{
void count()
{ 
System.out.println("I am counting");
}
void sum()
{
int a=10,b=20,s;
s=a+b;
System.out.println("Sum "+s);
}
public static void main(String[] args)
{
ExampleA e=new Exmp();
e.sum();
e.count();
e.display();
}
}

