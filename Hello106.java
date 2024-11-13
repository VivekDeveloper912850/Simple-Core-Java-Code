class Hello106
{
	int a=10;
	int b=20;
	static int c=30;
	void show()
	{
		int a1=100;
		//static int b1=200;
		System.out.println("show in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void show1()
	{
		int a11=101;
		System.out.println("show1 in Hello");
		//System.out.println(b);
		System.out.println(c);
	}
}
public class Test106
{
	public static void main(String args[])
	{
		Hello106 h1=null;
		System.out.println(h1.c);
		//System.out.println(h1.a);
		System.out.println(Hello106.c);
		//System.out.println(Hello106.a);

		Hello106 h2=new Hello106();	
		System.out.println(h2.a);
		System.out.println(h2.c);
		h2.show();
		Hello106.show1();
	}
}
