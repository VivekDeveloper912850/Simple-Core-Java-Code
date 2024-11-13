class Hello126
{
	int a;
	int b;	
	static int c=30;
	
	Hello126()
	{
		System.out.println("Default constructor in Hello");
	}

	Hello126(int a,int b)
	{
		System.out.println("2 parameterised constructor in Hello");
		this.a=a;
		this.b=b;
		System.out.println(this);
	}
		
	void show()
	{
		System.out.println("Show in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this);
	}
}
class Test126
{
	public static void main(String args[])
	{
		Hello126 h1=new Hello126();
		System.out.println(h1);
		h1.show();
		Hello126 h2=new Hello126(11,22);
		System.out.println(h2);
		h2.show();
		
	}
}

