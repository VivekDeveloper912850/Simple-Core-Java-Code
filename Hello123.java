class Hello123
{
	final int a;
	final int b=20;	//1. method
	 final  int c;
	//2. Method
	/*{
		c=30;
	}*/
	//3. method
	Hello123()
	{	c=30;
		a=500;
		//b=400;
	}
	Hello123(int a1,int c1)
	{
		a=a1;
		c=c1;
	}
	void m1()
	{
		final int d=100;
		System.out.println("m1 in Hello");	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class Test123
{
	public static void main(String args[])
	{
		Hello123 h=new Hello123();
		Hello123 h1=new Hello123(11,22);
		Hello123 h2=new Hello123(11,2222);
		h.m1();
		h1.m1();
		h2.m1();
		System.out.println(h.c);
	}
}
