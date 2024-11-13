class Hello138
{
	int a;
	Hello138(int a)
	{
		this.a=a;
	}
	void m1()
	{
		System.out.println("m1 in Hello138");
		System.out.println(a);
	}
}
class Hai138 extends Hello138
{
	Hai138()
	{
		super(40);
	}

}
class Test138
{
	public static void main(String args[])
	{
		Hai138 hai=new Hai138();
		hai.m1();
	}
}
