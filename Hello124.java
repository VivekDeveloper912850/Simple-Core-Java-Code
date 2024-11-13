class Hello124
{
	int a;
	Hello124(int a1)
	{
		a=a1;
	}
	Hello124()
	{
		System.out.println("default constructor");
		
	}
}
class Test124
{
	public static void main(String args[])
	{
          Hello124 h1=new Hello124();	//parameter not passedso give compile time error
		  Hello124 h2=new Hello124(11);
		  System.out.println(h2.a);
		
	}
}	
