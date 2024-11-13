class Hai
{
void m11()
{
System.out.println("In m11() in Hai");
}
}
class Hello extends Hai
{ }
class TestAll
{
void m1()
{
System.out.println("In m1() in TestAll");
}
int m2()
{
System.out.println("In m2() in TestAll");
return 10;
}
Hai m3(Hai142 hai)
{
System.out.println("In m3(Hai hai) in TestAll");
return hai;
}
Hai m4()
{
System.out.println("In m4() in TestAll");
return new Hello();
}
Hello m5(Haihai)
{
System.out.println("In m5() in TestAll");
return (Hello)hai;
}
Hello m6(Hello h)
{
System.out.println("In m6() in TestAll");
return h;
}
}
class Test65
{
public static void main(String args[])
{
TestAll tal=new TestAll();
tal.m1();
Hello h1=null;
int p1=tal.m2();
System.out.println(p1);
Hai hai1=tal.m3(new Hai());
System.out.println(hai1);
//h1=(Hello)tal.m3(new Hai());
h1=(Hello)tal.m3(new Hello());
h1.m11();
Hello h2=(Hello)tal.m4();
//Hello h3=tal.m5(new Hai());
Hello h4=tal.m5(new Hello());
tal.m6(h1);
//tal.m6((Hello)new Hai());
}
public class Singleton{
	public static void main(String[] args) {
		Test t = new Test();
		
	}
}

class Test{
	private Test(){

	}
}