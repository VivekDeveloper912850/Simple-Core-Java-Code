class Hello125
{
	private int a;
	private int b;
	private Hello125()
	{
	}
	static Hello125 h1=null;
	static 
	{
		h1=new Hello125();
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	public int getA()
	{
		return a;
	}
	public int getB()
	{
		return b;
	}
	public static Hello125 getHello()
	{
		return h1;
	}
}
class Test125
{
	public static void main(String args[])
	{
		Hello125 h1=null;	
		h1=Hello125.getHello();
		System.out.println(h1);
		h1.setA(100);
		h1.setB(200);
		int a11=h1.getA();
		int b11=h1.getB();
		System.out.println(a11);
		System.out.println(b11);	
	}
}
