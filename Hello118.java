class Hello118
{
	int a=10;
	int b=20;
	static int c=30;

	{
		System.out.println("Ib1 in Hello");
		int a=11;
		int a1=12;
		{	
			System.out.println("Local in Ib1");
			//int a=33;
			int a12=44; 
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
			System.out.println(a12);
			System.out.println("Local in Ib1 ends");
		}
		//System.out.println(a12);
		System.out.println("Ib1 in Hello ends");
	}
	
	static 
	{
		System.out.println("sb1 in Hello");
		int a12=122;
		int a13;
		//System.out.println(a13);	// Not OK must initialise before access
		{
			System.out.println("Local in Sb1");
			//System.out.println(a);
			System.out.println(c);
			System.out.println(a12);
			{
				System.out.println("Local in Local ofSb1");
			}
			System.out.println("Local in Sb1 ends");
		}
		System.out.println("Ib1 in Hello ends");		
	}
	
	void m1()
	{
		System.out.println("m1 in Hello");
		int aa=111;
		{
			System.out.println("Local in m1()");
		}
	}
	static void m2()
	{
		System.out.println("m2 in Hello");
		{
			System.out.println("Local in m1()");
		}
	}
}
class Test51
{
	public static void main(String args[])
	{
		Hello118 h1=new Hello118();	
		h1.m1();
		h1.m2();
	}

}
