public class Test90{
public static void main(String [] args)
{
Hello hello=new Hello(10);
Hello hello1=new Hello(20);
//BankCustomer.a=20;
System.out.println(BankCustomer.a);
System.out.println(hello.a);
System.out.println(hello1.a);
BankCustomer.m1();

}

}
 

interface  BankCustomer{
int a=10; // public static final int a=10;
BankCustomer bankCustomer=null;//public static final int a=10;
public int withdraw();// abstract method

public void getBalance();// abstract method

public void getCheck();// abstract method
public static void m1()
{
	System.out.println("this is a static method ");
}
}

class  Hello{
final int a;

public Hello(int a){
this.a=a;
} 
}