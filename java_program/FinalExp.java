class FinalExp
{


	final int a=5;
	void test()
	{
		a=350;
		System.out.println("a value after changing="+a);
	}
	public static void main(String[] args)
	{
		FinalExp a=new FinalExp();
		System.out.println("a ="+a);
		a.test();
	}
}
