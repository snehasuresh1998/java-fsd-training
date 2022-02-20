//Write a java program to implement an interface with two methods.
interface Exam
{
void Marks();
void Result();
}
class Detail implements Exam
{
public void Marks()
{
System.out.println("Mark scored");
}
public void Result()
{
System.out.println("Results are Published");
}
}
class MainClass
{
public static void main(String[] args)
{
   Exam a=new Detail();
   a.Marks();
   a.Result();
}
}