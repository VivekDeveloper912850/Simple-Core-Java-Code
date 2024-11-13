class Hello119
{
	static  int a=10;
	static 
	{
		System.out.println("Sb in Hello");
	}
	{
		System.out.println("Ib in Hello");
	}
}
class Test119
{
	public static void main(String arsg[])
	{
		//Hello119 t=new Hello119();	
		System.out.println(Hello119.a);
	}
}

