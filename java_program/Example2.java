interface Exam
{
void Marks();
void Result();
}
class Detail implements Exam
{
public void Marks()
{
System.out.println("Marks for  all subjects");
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