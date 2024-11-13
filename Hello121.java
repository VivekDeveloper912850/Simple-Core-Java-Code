class Hello121
{
	private int a;
	private int b;	
	private static int c;
	Hello121()
	{
		System.out.println("Default constructor in Hello");
	}
	Hello121(int a,int b,int c)
	{
		System.out.println("Hello(int a,int b,int c)");
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void show()
	{
		System.out.println("Show in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class Test121
{
	public static void main(String args[])
	{
		Hello121 h1=new Hello121();
		h1.show();
		Hello121 h2=new Hello121(111,222,333);
		h2.show();
	}
}
