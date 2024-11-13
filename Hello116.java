class Hello116
{
	void m1(int a,int b)
	{
		System.out.println("m1(int a,int b) in Hello");
	}
	void m1(int ...a)
	{
		System.out.println(a.length);
		for(int i:a)
		{
			System.out.println(a[i]);
		}
	}
}
class Test116
{
	public static void main(String ...args)
	{
		Hello116 h1=new Hello116();
		h1.m1(11,22,33,44.5,55.6,66.7,77.8);
		h1.m1();
		h1.m1(11,22);
	}
}
