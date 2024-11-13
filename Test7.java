public class Test7
{
	public static void main(String[] args) {
		Hello t=new Hello();
		Integer i=new Integer(20);
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println(t.m());
		System.out.println(i.t);
		
	}
}
class Hai
{
	public int m()
	{
		return 10;
	}
}
class Hello extends Hai
{
	public String toString(){
		return "Hello";
	}

}