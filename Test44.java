class Hello108
{
	int a=10;
	int b=20;
	static int c=30;

	{
		int a1=111;
		//static int b1=30;
		System.out.println("Ib1 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a1);
	}
	static 
	{
		System.out.println("sb1 in Hello");
		int a11=111;
		//static int b11=222;
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(a11);		
	}
	
	void m1()
	{
		System.out.println("m1 in Hello");
	}
	static void m2()
	{
		System.out.println("m2 in Hello");
	}
	
	{
		System.out.println("Ib2 in Hello");
	}
	
	static 
	{
		System.out.println("sb2 in Hello");
	}
}
class Test44
{
	public static void main(String args[])
	{
		Hello108 h1=new Hello108();
		h1.m1();	
		Hello108 h2=new Hello108();
		
		System.out.println(Hello108.c);
		Hello108 h3=null;
		System.out.println(h3.c);
		Hello108.m2();
	}

}
