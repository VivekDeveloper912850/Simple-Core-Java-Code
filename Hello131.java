class Hello131
{
	int a;
}
class Hai131
{
	void m1(int a1)
	{
		System.out.println("m1(int a1)");
		a1=a1+100;
		System.out.println(a1);
	}
	void m2(Hello131 h)
	{
		System.out.println("m2 in Hello131");
		h.a=h.a+100;
		System.out.println(h.a);
	}	
}
class Test131
{
	public static void main(String args[])
	{
		Hai131 h1=new Hai131();
		Hello131 h2=new Hello131();
		int x=101;
		System.out.println("Before calling methods");
		System.out.println(x);
		System.out.println(h2.a);
		System.out.println("calling methods");
		h1.m1(x);
		h1.m2(h2);
		System.out.println("After calling methods");
		System.out.println(x);
		System.out.println(h2.a);
	}
}
