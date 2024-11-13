class Test4
{
	public static void main(String[] args) {
		Hello hello=new Hello(19);
		hello.m(10);

		
	}
}
class Hello
{
	private int a;
	public Hello()
	{
		 a=10;

	}
	public int  m(int a)
	{
		return a;
	}
	public Hello(int b)
	{
		this.a=b;
		System.out.println("in hello(int BiPredicate) ");
		System.out.println(a);
	}
}