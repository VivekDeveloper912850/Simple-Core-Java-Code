class Airth
{
	void sum1(int a, int b)
	{
		System.out.println("Sum1(int a,int b)");
	}

	void sum1(int a)
	{
		System.out.println("Sum1(int a)");
	}

	void sum1(double a,double b)
	{
		System.out.println("Sum1(double a,double b)");
	}

	int sum1(double a)
	{
		System.out.println("Sum1(double a)");
		return 100;
	}

	float sum1(float f1)
	{
		System.out.println(f1);

		System.out.println("Sum1(float f1)");
		return 11.11f;
	}
	void sum1(byte b1)
	{
		System.out.println("Sum1(byte a)");
	}
}
class Test114
{
	public static void main(String args[])
	{
		Airth ar=new Airth();
		ar.sum1(11,22);
		ar.sum1(111);
		ar.sum1((byte)111);
		ar.sum1(11.11,22.22);
		ar.sum1(11.22f);
		ar.sum1(11.12);
		float res=ar.sum1((float)(double)(int)(byte)111);
		System.out.println(res);
	}
}


