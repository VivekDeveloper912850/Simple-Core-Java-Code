class Hello113
{
	int m1()
	{
		System.out.println("m1 in Hello");
		return 10;
	}
	int m2()
	{
		System.out.println("m2 in Hello");
		return 20;
	}
	public void m3()
	{
		System.out.println("m3 in Hello");
		
	}
}
class Test50
{
	public static void main(String args[])
	{
		Hello113 h1=new Hello113();
		int i1=h1.m1();
		int i2=h1.m2();	
		Hello113 h2=h1.m3();
		System.out.println(h1.m1());
		System.out.println(h1.m2());
		//System.out.println(h1.m3());
		System.out.println(i1+"*******"+i2);
	}
}
