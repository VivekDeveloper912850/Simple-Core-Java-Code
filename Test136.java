class Hello136
{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("IB in Hello136");
	}
	static
	{
		System.out.println("SB in Hello136");
	}
	Hello136()
	{
		System.out.println("Default constructor in Hello136");
	}
	Hello136(int a)
	{
		System.out.println("1 parameter constructor in Hello136");
		this.a=a;
	}	
	Hello136(int a,int b)
	{
		System.out.println("2 parameter constructor in Hello136");
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("Show in Hello136");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class Hai136 extends Hello136
{
	int a;
	int b;
	static int c=60;
	{
		System.out.println("IB in Hai136");
	}
	static
	{
		System.out.println("SB in Hai136");
	}
	Hai136()
	{
		System.out.println("Default constructor in Hai136");
	}
	Hai136(int a)
	{
		super(33);
		System.out.println("1 parameter constructor in Hai136");
		this.a=a;
	}	
	Hai136(int a,int b)
	{
		super(555,444);
		System.out.println("2 parameter constructor in HaiHello136");
		this.a=a;
		this.b=b;
	}
}
class HaiHello136 extends Hai136
{
	int a;
	int b;
	static int c=60;
	{
		System.out.println("IB in HaiHello136");
	}
	static
	{
		System.out.println("SB in HaiHello136");
	}
	HaiHello136()
	{
		System.out.println("Default constructor in HaiHello136");
	}
	HaiHello136(int a)
	{
		super(222);
		System.out.println("1 parameter constructor in HaiHello136");
		this.a=a;
	}	
	HaiHello136(int a,int b)
	{
		super(777,666);
		System.out.println("2 parameter constructor in HaiHello136");
		this.a=a;
		this.b=b;
		//System.out.println(super);
	}
	void showAll(Hello136 h1)
	{
		int a=1010;
		int b=2020;
		int c=3030;
		System.out.println("ShowAll in HaiHello136");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
		System.out.println(h1.a);
		System.out.println(h1.b);
	}
}
class Test136
{
	{
		System.out.println("IB in Test136");
	}
	static 
	{
		System.out.println("SB in Test136");
	}
	public static void main(String args[])
	{
		HaiHello136 haihello=new HaiHello136();
		System.out.println("******\n");
		HaiHello136 haihello1=new HaiHello136(111);
		System.out.println("*********");
		HaiHello136 haihello2=new HaiHello136(999,888);
		haihello.showAll(new Hello136());
	}
}
