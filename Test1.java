class Test1
{
	public static void main(String[] args) {
		System.out.println("in main method in Test");
		BankCustomer[] bankCustomerArray=new BankCustomer[args.length];
		for(int i=0;i<args.length;i++)
		{
			bankCustomerArray[i]=new BankCustomer(args[i]);
		}
		for(int i=0;i<bankCustomerArray.length;i++){
			System.out.println("bank customer name:" +bankCustomerArray[i].name);
		}
	}
}
class BankCustomer
{
	   String name;
	//public BankCustomer()
	//{

	//}
	public BankCustomer(String CustomerName)
	{
		name=CustomerName;
		System.out.println("CustomerName:" + name);
		//name=CustomerName;
	}
} 
	
