class Hai
{
	void m1()
	{
		System.out.println("m1() in Hai");
	}
	void m2()
	{
		System.out.println("m2() in Hai");
	}
	void m3()
	{
		System.out.println("m3() in Hai");
	}
}
class Hello extends Hai
{
	void m2()
	{
		System.out.println("m2() in Hello");
		super.m2();
	}
	void m3()
	{
		System.out.println("m3() in Hello");
	}
}
class Test66
{
	public static void main(String args[])
	{
		Hello h1=new Hello();
		h1.m1();
		h1.m2();
		h1.m3();	
	}
}
