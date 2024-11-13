class Hello135
{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("IB in Hello135");
	}
	static
	{
		System.out.println("SB in Hello135");
	}
	Hello135()
	{
		System.out.println("Default constructor in Hello135");
	}
	Hello135(int a,int b)
	{
		System.out.println("2 parameter constructor in Hello135");
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("Show in Hello135");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class Hai135 extends Hello135
{
	int a;
	int b;
	static int c=60;
	{
		System.out.println("IB in Hai135");
	}
	static
	{
		System.out.println("SB in Hai135");
	}
	Hai135()
	{
		System.out.println("Default constructor in Hai135");
	}
	Hai135(int a,int b)
	{
		System.out.println("2 parameter constructor in Hai135");
		this.a=a;
		this.b=b;
	}
	void show()
	{
		int a=11;
		int b=22;
		int c=33;
		System.out.println("Show in Hai135");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
	}
}
class Test135
{
	{
		System.out.println("IB in Test");
	}
	static 
	{
		System.out.println("SB in Test");
	}
	public static void main(String args[])
	{
		Hai135 hai=new Hai135();
		Hai135 hai1=new Hai135(11,22);
		hai.show();
		hai1.show();
	}
}

