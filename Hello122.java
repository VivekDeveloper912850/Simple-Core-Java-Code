class Hello122
{
	final int a;
	final int b;	
	static final int c;
	
	{
		System.out.println("Ib1 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static 
	{
		c=100;
		System.out.println("sb1 in Hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}

	Hello122()
	{
		System.out.println("Default constructor in Hello");
	}
	
	/*Hello122(int a1)
	{
		System.out.println("1 parameterised constructor in Hello");
	}*/

	//Hello122(int a1)
	//{
		//System.out.println("1 parameterised constructor in Hello");
		//a=a1;
	//}

	Hello122(int a1,int b1)
	{
		System.out.println("2 parameterised constructor in Hello");
		a=a1;
		b=b1;
		//c=c1;
	}
		
	void show()
	{
		System.out.println("Show in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void show1()
	{
		System.out.println("Show1 in Hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
}
class Test122
{
	public static void main(String args[])
	{
		Hello122 h1=new Hello122();
		//Hello122 h2=new Hello122(999);
		//h2.show();
		Hello122 h3=new Hello122(888,777);
		Hello122.show1();
		h3.show();
		System.out.println(h1.a+"h1 a,b		: "+h1.b);
		//System.out.println(h2.a+"h2 a,b		: "+h2.b);
		System.out.println(h3.a+"h3 a,b		: "+h3.b);
	}
}
