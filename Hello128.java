class Hello128
{
	int a;
	int b;	

	Hello128()
	{
		System.out.println("Default constructor in Hello");
		System.out.println(new Hello128(this));
		System.out.println("end of default constructor");
	}
	Hello128(Hello128 h1)
	{
		System.out.println("Hello128(Hello h1)");
		System.out.println(h1);
		System.out.println(this);
		System.out.println("Hello128(Hello h1)");
	}	
	
	
}
class Test128
{	
	public static void main(String args[])
	{
		Hello128 h1=new Hello128();
		System.out.println("after object creation");
		System.out.println(h1);
		
		
	}
}	
