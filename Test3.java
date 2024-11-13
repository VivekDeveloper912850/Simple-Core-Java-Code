class Test3
{
	public static void main(String[] args) {
		BankCustomer bankCustomer=new BankCustomer();
		//bankCustomer.getName();
		
	}
	public void main(){

	}
}
class BankCustomer
{
	   String name;
	public BankCustomer()
	{
		this("deepak");

	}
	public BankCustomer(String name)
	{
		//this();+
		
		System.out.println("CustomerName:" +name);
		this.name=name;
	}
	public void getName()
	{
		//this("deepak");
		//System.out.println("String name:" +name);

	}


} 
 
