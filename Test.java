class Test
{
	int a;
	static int b;
	public void main()
	{
		System.out.println("in main() method");
		System.out.println("value of a method:" +a);
		System.out.println("value of a method:" +b);

	}
	public static void main(String[] args) {
		System.out.println("in main method ");
		System.out.println("value of b :" +b);
		Test t=new Test();
		t.a=10;
		//t.main();
		//t.m1();
		System.out.println("value of is:" +t.a);
		Test t1=new Test();
		System.out.println("value of a:" +t1.a);

	}
	{
		System.out.println("value of a instance block:" +a);
		System.out.println("value of a instance block:" +b);
		System.out.println("in instance block");
	}
	static
	{
		System.out.println("in static block");
		//System.out.println("value of a static block:" +a);
	}
	public static void m1()
	{
		System.out.println("in static m1 method");
		//System.out.println("value of a static method:" +a);
		System.out.println("value of a static method:" +b);
	}
}