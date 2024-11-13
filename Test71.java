abstract class Hello {
	int a,b;
	static int c;
	static {
		System.out.println("SB in Hello");
	}
	{
		System.out.println("IB in Hello");
	}
	public Hello() {
		System.out.println("Default Constructor in Hello");
	}
	Hello(int a,int b){
		this();
		System.out.println("In two Paramerised constructor");
		this.a=a;
		this.b=b;
	}
	abstract void m1();
	public abstract void m2();
	protected abstract void m3();
	//private abstract void m4();
	//static abstract void m5();
	//final abstract void m6();
	void show() {
		System.out.println("Show() in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	abstract void m11();
}


class Hai extends Hello
{
	int a,b;
	static int c;
	static {
		System.out.println("SB in Hai");
	}
	{
		System.out.println("IB in Hai");
	}
	public Hai() {
		System.out.println("Default constructor in Hai");
	}
	Hai(int a,int b){
		super(181,191);
		System.out.println("Two parameter constructor in Hai");
		this.a=a;
		this.b=b;
		super.a=this.a;
		super.b=super.c;
	}
	void m1() {
		System.out.println("m1 in Hai");
	}
	public void m2() {
		System.out.println("m2 in Hai");
	}
	public void m3() {
		System.out.println("m3 in Hai");
	}
	void m11() {
		int a=191,b=292,c=393;
		System.out.println("m11 in Hai");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
	}
}


class Test71
{
	public static void main(String args[]) {
		//Hai hai=new Hai();
		Hello h1=null;
		h1=new Hai(999,888);
		h1.m11();
		h1.show();
		Hai hai=new Hai();
		hai.m11();
	}
}
