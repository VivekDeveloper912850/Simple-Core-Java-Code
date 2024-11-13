class Hello109
{
	static int c=30;

	{
		System.out.println("Ib1 in Hello");//3
	}
	static 
	{
		System.out.println("sb1 in Hello");//2
	}
	
}
class Test46
{
	
	{
		System.out.println("Ib1 in Test");//4
	}
	static 
	{
		System.out.println("sb1 in Test");//1
	}
	public static void main(String args[])
	{
		Hello109 h1=new Hello109();	
		Test46 h2=new Test46();
		System.out.println(Hello109.c);//5
	}
}
