class Hello115
{
	void m1()
	{
		System.out.println("m1 in Hello");
	}
	void m1(int a)
	{
		System.out.println("m1(int a)");
	}
	void m1(int a,double d)
	{
		System.out.println("m1(int a,double d)");
	}
	int m1(double d,int a)
	{
		System.out.println("m1(double d,int a)");
		return 10;
	}
	void show(Object o)
	{
		System.out.println("show(object o)");
	}
	void show(String str)
	{
		System.out.println("show(String str)");
	}
	void show(int a[])
	{
		System.out.println("show in Hello");
	}
	int[] show()
	{
		System.out.println("show() in Hello");
		int a[]={11,22,33,44};
		for(int i=0;i<=3;i++)
		{
			//System.out.println(a[i]);
		}
		return a;
	}
	void dispaly(int a)
	{
		System.out.println("display(int a)");
	}
	void display(short s)
	{
		System.out.println("display(short s)");
	}
	void display(byte b)
	{
		System.out.println("display(byte b)");
	}
}
class Test115
{
	public static void main(String args[])
	{
		Hello115 h1=new Hello115();
		h1.m1();
		h1.m1(10);
		h1.m1(0,0.0);
		h1.m1(22.22,11);
		//h1.show(null);
		h1.show("PGM");
		h1.display((byte)100);
		int a[]=h1.show();
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]);
		System.out.println(" ");
	    }
	}
}
