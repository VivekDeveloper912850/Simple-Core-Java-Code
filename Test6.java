public class Test6
{
	public static void main(String [] args)
	{
		int i= 10;
		Object o1= new Object();
		//Test6 t=new Object();
		Object o=new Test6();//BROADENING.
		//Test6 t1=(Test6)o1; //Narrowing t1=(Test6)new Object();
		//Object t2=(Test6)o1;// t2=(Test6)new Object();
		Object t3=(Test6)o; // t3=(Test6)new Test6();
		Test6 t4=(Test6)o;  // t4=(Test6)new Test6();
		Object o4=(Test6)new Test6();
	}
}
class Calculator
{
	public void m(Object o)
	{
		System.out.println("m(Object o) :" + o);
	}
	public void m(int a,long l)
	{

	}
	public void m(long l,int a)
	{

	}
}