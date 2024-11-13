class Animal
{
	void eating()
	{
		System.out.println("Animal is eating");
	}
	 int sleeping(int a)
	{
		System.out.println("Animal is sleeping");
		return 10;
	}
	void ConnectingToAnimal()
	{
		System.out.println("Animal is Connecting");
	}
	public void walking()
	{
		System.out.println("Animal is Walking");
	}
	static void talking()
	{
		System.out.println("Animal is talking");
	}
	final void thinking()
	{
		System.out.println("Animal is thinking");
	}
}
class Dog extends Animal
{
	void eating()
	{
		System.out.println("Dog is eating");
	}
	 int sleeping(int a)
	{
		System.out.println("Dog is sleeping(int a)");
		return a;
	}
	public void walking()
	{
		System.out.println("Dog is Walking");
	}
	/* void talking()
	{
		System.out.println("Dog is talking");
	}*/
	/*final void thinking()
	{
		
	}*/
	void barking()
	{
		System.out.println("Dog is barking");
	}
}
class Test68
{
	public static void main(String args[])
	{
		Animal ani=new Animal();
		ani.eating();
		ani.sleeping(18);
		ani.talking();
		ani.thinking();
		System.out.println("*************");
		Animal ani1=new Animal();
		ani1=new Dog();
		ani1.eating();
		ani1.sleeping(18);
		ani1.ConnectingToAnimal();
		ani1.talking();
		ani1.barking();
		ani1.walking();
		Dog dog1=new Dog();
		dog1.barking();
		
	}
}
