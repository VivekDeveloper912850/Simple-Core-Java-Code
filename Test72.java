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

class Hai
{
	void m1() {
		System.out.println("m1() in Hai");
	}
}

class Hello extends Hai
{
	void m1() {
		System.out.println("m1() in Hello");
	}
	void m11() {
		System.out.println("m11 in Hello");
	}
}

abstract class AbTestr
{
	public abstract Hai m12();
	public abstract Hello m13(Hai hai);
}

abstract class Testr extends AbTestr
{
	/*public Hai m12() {
		return new Hello();
	}*/
	public Hello m12() {
		System.out.println("m12() in Testr");
		return new Hello();
	}
	void m22() {
		System.out.println("m22() in Testr");
	}
}

class Testr2 extends Testr
{
	public Hello m13(Hai hai) {
		System.out.println("m13() in Testr2");
		return (Hello)hai;
	}
	void m22() {
		System.out.println("m22() in Testr2");
	}
}
	
public class Test72 
{

	public static void main(String[] args)
	{
		AbTestr abtr=null;
		abtr=new Testr2();
		Hai h1=abtr.m12();
		Hello h2=abtr.m13(new Hello());
		//abtr.m22();
		Testr tr=new Testr2();
		tr.m22();
	}
}


