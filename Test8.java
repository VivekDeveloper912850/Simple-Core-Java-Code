public class Test8{
	public static void main(String[] args) {
		BankCustomer bankCustomer=new BankCustomer();
		BankEmployee bankEmployee=new BankEmployee();
		BankCustomer bankCustomer1=new BankEmployee();
		System.out.println("bankCustomer: " + bankCustomer.loan(new Dog()));//10
		System.out.println("bankEmployee: " + bankEmployee.loan(new Animal()));//5
		System.out.println("bankCustomer1: " + bankCustomer1.loan(new Dog()));//5
		
	}
}
class BankCustomer{
	 Animal loan(Animal a){//Static 
		System.out.println("in BankCustomer loan()");
		return new Dog();
	}
}
class BankEmployee extends BankCustomer{
	 Dog loan(Dog d){//Static
		System.out.println("in BankEmployee loan()");
		return new Dog();
	}
}
//class Hello
//class Hai extends Hello{}
class Animal{}
class Dog extends Animal{}