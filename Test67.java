class Hai
{
	private void m1()
	{
		System.out.println("m1() in Hai");
	}
	int m2(int a,int b)
	{
		System.out.println("m2(int a,int b) in Hai");
		return a+b;
	}
	int m3()
	{
		System.out.println("m3() in Hai");
		return 10;
	}
	public void m4()
	{
		System.out.println("m4() in Hai");
	}
}
class Hello extends Hai	
{
	protected void m1()
	{
		System.out.println("m()1 in Hello");
	}
	/*void m2(int a,int b)
	{
		System.out.println("m2(int a,int b) in Hello");
	}*/
	/*int m2(int a,int b)
	{
		System.out.println("m2(int a,int b) in Hello");
	}*/
	public int m2(int a,int b)
	{
		System.out.println("m2(int a,int b) in Hello");
		return 0;
	}
	protected int m3()
	{
		System.out.println("m3() in Hello");
		return 10;
	}
	void m4()
	{
		System.out.pritnln("m4() in Hello not allow");
	}
	public void m4()
	{
		System.out.println("m4() in Hello");
	}
}
class Test67
{
	public static void main(String args[])
	{
		Hello h1=new Hello();
		h1.m1();
		h1.m2(11,22);
		h1.m3();	
		h1.m4();
	}
}
