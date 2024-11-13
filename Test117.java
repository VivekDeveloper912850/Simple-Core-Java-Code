class Test117
{
	static
	{
		System.out.println("sb in Test");
	}
	public static void main(String args[])
	{
		System.out.println("Main(String args[]) in Tset");
		main("abc");
	}
	public static void main(int a)
	{
		System.out.println("main(int a) in Test");
		String str[]={"AA"};
		//main(str);
	}
	static void main()
	{
		main(20);
		System.out.println("main() in Test");
	}
	static void main(String str)
	{
		System.out.println("main(String str) in Test");
		main();
	}
}	
