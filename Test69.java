class A
{
	public void m11()
	{
		System.out.println("m11 in A");
	}
}
class B extends A
{
	public void m11()
	{
		System.out.println("m11 in B");
	}
	void m22()
	{
		System.out.println("m22 in B");
	}
}
class Hai
{
	void m1()
	{
		System.out.println("m1 in Hai");
	}
	A m2(A a1)
	{
		System.out.println("m2(A al) in Hai");
		return a1;
	}
	public A m3(B b1)
	{	
		System.out.println("m3(B b1) in Hai");
		return b1;
	}
}
class Hello extends Hai
{
	void m1()
	{
		System.out.println("m1 in Hello");
	}
	B m2(B b)
	{
		System.out.println("m2(B b1) in Hello");
		return b1;
	}
	A m2(B b1)
	{
		System.out.println("m2(B b1)in Hello");
		return(B)b1;
	}
	A m2(A a1)
	{
		System.out.println("m2(A a1)in Hello");
		return a1;
	}
	B m4()
	{
		A a1=new B();
		System.out.println("m4 in Hello");
		return (B)a1;
	}
}
class Test69
{
	public static void main(String args[])
	{
		Hai hai=null;
		hai=new Hello();
		A a1=hai.m2(new B());
		B b1=(B) hai.m2(new B());
		A a2=hai.m2(new A());
		B b11=(B) hai.m3(new B());
		a1.m11();
		//a1.m22();
		b11.m22();
	}
}
