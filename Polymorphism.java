class Polymorphism
{
	public static void main(String [] args)
	{
		Calculator t=new Calculator();
		Object o=null;
		String s=null;
		Object o1=new String("Vivek");
		String s1=(String)o1;
		//t.m(s1);
		//t.m(o1);
		//t.m(null);
		t.m('A'); //Auto-boxing new Character('A')
		t.m(23,'A');
			
		

	}
}
class Calculator
{
	public void m(Object o)
	{
		System.out.println("M Object 0:"  + o);
	}
	public void m(String s)
	{
		System.out.println("m string s");
	}
	public void m(char c){
		System.out.println("m char c");
	}
	public void m(int a,Object o)
	{
		System.out.println("int a value:" + a + " " + o);
	}
}