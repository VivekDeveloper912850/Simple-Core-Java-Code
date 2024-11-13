class Animal //super class or parent class.
{
	int a=30;
	public void m()
	{

	}
	public Animal(int a)
	{
		System.out.println("parametrized constructor:" +a);

	}
	//public Animal()
	//{
		//System.out.println("in animal() default constructor");
	//}
}
class Dog extends Animal //Sub class or child class.
{
	public Dog(int a)
	{
		super(30);
		System.out.println("dog parametrized constructor:" +a);

	}
	//Dog()
	//{
		//super();
		//System.out.println("IN DOG () IN CONSTRUCTOR");

	//}
	
	public void m()
	{
		System.out.println(super.a);//super=new Animal();
	}
}
class Test
{
	public static void main(String[] args) {
		Dog t=new Dog(10);
		t.m();

	}
	
	
}