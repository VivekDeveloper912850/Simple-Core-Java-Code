class Hello130
{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("Ib in Hello");
		int a11=101;
		//static int b11=202;
		{
			//int a11=303;
			int a33=404;
			System.out.println("Local in Ib in Hello");
			System.out.println(a11);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(a33);
	}
	static
	{
		System.out.println("Sb in Hello");
		//int a22=101;
		//static int b22=202;
		{
			int a22=303;
			int a33=404;
			System.out.println("Local in Sb in Hello");
			System.out.println(a22);
			System.out.println(a33);
		}
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		//System.out.println(a33);
	}
	Hello130()
	{
		System.out.println("Default constructor in Hello");
	}
	Hello130(int a1)
	{
		System.out.println("1 parameterised constructor in Hello");
		a=a1;
	}
	Hello130(int a1,int b1)
	{
		System.out.println("2 parameterised constructor in Hello");
		a=a1;
		b=b1;
	}
	void show1()
	{
		System.out.println("Show1 in Hello");
		int a11=33;
		System.out.println(a11);
		System.out.println(a);	
		System.out.println(b);
		System.out.println(c);
	}
	static void show2()
	{
		System.out.println("Show1 in Hello");
		int a11=33;
		System.out.println(a11);
		//System.out.println(a);	
		//System.out.println(b);
		System.out.println(c);
	}
}
class Test130
{
	int aaa=111;
	static int bbb=222;
	{
		System.out.println("Ib in Test");
	}
	static
	{
		int ab=333;
		System.out.println("Sb in Test");
		System.out.println(ab);
	}
	public static void main(String args[])
	{
		Hello130 h1=new Hello130();
		Hello130 h2=new Hello130(888);
		Hello130 h3=new Hello130(777,666);
		/*h1.show1();
		h2.show1();
		h3.show1();*/
	}
}
