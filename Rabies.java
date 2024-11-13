public class Rabies{
	public static void main(String[] args) {
		Calculator t=new Calculator();
		Object o=null;
		String s=null;
		Object o1=new String("Rahul");
		t.m(s);
		t.m(o1);
	}
}
class Calculator{
	public void m(Object o){
		System.out.println("m(Object method);" + o);
	}
	public void m(String s){
		System.out.println("m(String method)");
	}
}