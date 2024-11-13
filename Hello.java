class Hello
{
	byte b1=10;
	byte b2=20;
	final byte b3=10;
	final byte b4=20;
	int i1=10;
	int i2=20;
	int i3=Integer.MAX_VALUE;
	int i4=Integer.MAX_VALUE;
	int i7=Integer.MIN_VALUE;
	final int i5=10;
	final int i6=20;
	void show()
	{
		System.out.println("Show in Hello");
		//byte b11=b1+b2;
		//byte b22=i1+i2;
		//byte b23=b1+i1;
		byte b24=b3+b4;
		int i11=b1+b2;
		int i13=b2+i2;
		int i14=i3+i4;
		int i15=i4+i7;
		//System.out.println(b11);
		//System.out.println(b22);
		//System.out.println(b23);
		System.out.println(b24);
		System.out.println(i11);
		System.out.println(i13);
		System.out.println(i14);
		System.out.println(i15);
		
	}
}
class Test16
{
	public static void main(String args[])	
	{
		Hello h1=new Hello();
		h1.show();
	}
}

