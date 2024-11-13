import java.lang.*;
class Hai111
{
	void m11()
	{
		System.out.println("m11 in Hai");
	}
}
class Hello111
{
	int a=10;
	int b=20;
	static int c=30;

	{
		System.out.println("Ib in Hello");
	}
	static 
	{
		System.out.println("sb1 in Hello");
	}
	
	void m1()
	{
		System.out.println("m1 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		return;		
	}

	static void m2()
	{
		System.out.println("m2 in Hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		;		
	}	
	
	int m3()
	{
		System.out.println("m3 in Hello");
		return 0;
	}

	byte m4(byte a,byte b)
	{
		System.out.println("m4 in Hello");
		return(byte)(a+b);
	}

	float m5()
	{
		System.out.println("m5 in Hello");	
		return(float)100.22;//100.22f;
	}
	
	Hai111 m6(Hai111 h)
	{
		System.out.println("m6 in Hello");
		return h;
	}

	/*m7()
	{
	}*/		 
	
}
class Test48
{
	public static void main(String args[])
	{
		System.out.println("main in Hello");
		Hello111 h1=new Hello111();
		h1.m1();
		Hello111.m2();
		int i11=h1.m3();
		System.out.println(i11);
		byte b11=h1.m4((byte)11,(byte)22);
		System.out.println(b11);
		Hai111 hai1=h1.m6(new Hai111());
		System.out.println(hai1);
		hai1.m11();
		float f11=h1.m5();
		System.out.println(f11);
	}
}

