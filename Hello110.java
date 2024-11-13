class Hello110
{
	static int c=30;

	{
		System.out.println("Ib1 in Hello");
	}
	static 
	{
		System.out.println("sb1 in Hello");
		Test47 t7=new Test47();
	}
	public static void main(String args[])
	{
		System.out.println("main in Hello");
	}
	
}
class Test47
{
	{
		System.out.println("Ib1 in Test");
	}
	static 
	{
		System.out.println("sb1 in Test");
		Hello110 h1=new Hello110();
	}
	public static void main(String args[])
	{
		System.out.println("main in Test");
	}
}

