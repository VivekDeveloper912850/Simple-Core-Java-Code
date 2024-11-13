class Hello127
{
int a;
	int b;	
	static int c=30;
	{
		System.out.println("IB in Hello");
		int a1=101;
		int b1=202;
		int c1=303;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println("Ib ends in Hello");
	}

	static
	{
		System.out.println("SB in Hello");
		int a=101;
		int b=202;
		int c=303;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(this.a);
		//System.out.println(this.b);
		//System.out.println(this.c);
		System.out.println(Hello127.c);
		System.out.println("Sb ends in Hello");
	}
	Hello127(int a,int b,int c)
	{
		
		System.out.println("3 parameterised constructor in Hello");
		this.a=a;
		this.b=b;
		this.c=c;
	}
	Hello127(int a,int b)
	{
		this(606,505,404);
		System.out.println("2 parameterised constructor in Hello");
		this.a=a;
		this.b=b;
	}
	
	Hello127(int a)
	{
		this(808,707);
		System.out.println("1 parameterised constructor in Hello");
		this.a=a;
	}	
	
	Hello127()
	{
		this(909);
		System.out.println("Default constructor in Hello");
	}
void show()
	{
		System.out.println("Show in Hello");
		int a=111;
		int b=222;
		int c=333;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println("End of show in Hello");
	}
	static void show1()
	{
		System.out.println("Show1 in Hello");
		int a=201;
		int b=302;
		int c=403;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(this.a);
		//System.out.println(this.b);
		//System.out.println(this.c);
		System.out.println("End of show1 in Hello");
	}
}
class Test127
{
	int aa=999;
	static int bb=888;
	{
		System.out.println("IB in Test127");
		System.out.println(aa);
		System.out.println(bb);
	}
	static
	{
		System.out.println("SB in Test127");
		//System.out.println(aa);
		System.out.println(bb);
	}
	public static void main(String args[])
	{
		Hello127 h1=new Hello127();
		h1.show();
		Hello127.show1();
		
		
	}
}
