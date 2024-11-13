class Test2
{
	//static int b;
	int a;
	public static void main(String[] args) {
		Test2 t=new Test2();
		//t.a=10;
		new Test2().main();
		t.main();
		//System.out.println("REFERRENCE:" +t.a);
		System.out.println("REFERRENCE:" +t);
		System.out.println("NEW TEST2()");
		
	}
	public void main()
	{
		//System.out.println("this:" +this.a);
		System.out.println("this:" +this);
		//System.out.println("static:" +this.b);
	}
}
class BankCustomer
{
	   String name;
	//public BankCustomer()
	//{

	//}
	public BankCustomer(String CustomerName)
	{
		
		System.out.println("CustomerName:" + name);
		this.name=CustomerName;
	}
} 
