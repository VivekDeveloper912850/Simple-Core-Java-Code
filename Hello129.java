 class Hello129
{
	int a;
	int b;	
	Hello129()
	{
		this(100);
		System.out.println("Default constructor");
	}
	Hello129(int a)
	{
		//this(new Hello129());
		System.out.println("Hello129(int a)");
	}
		
	Hello129(Hello129 h1)
	{
		//System.out.println(h1);
		//this(new Hello129(),new Hello129());
	}
	//Hello129(Hello129 h1,Hello129 h2)
	//{
	//}
	
			
}
  class Test129
{	
	public static void main(String args[])
	{
		//this();
		Hello129 t=new Hello129();
		
		
	}
}
