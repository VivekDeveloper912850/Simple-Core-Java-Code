public class Test89{
public static void main(String [] args)
{

//BankCustomerImpl bankCustomerImpl=new BankCustomerImpl();
//BankCustomer bankCustomerImpl=new BankCustomer();
	BankCustomerAndEmployeeImpl bankCustomerImpl=new BankCustomerAndEmployeeImpl();

bankCustomerImpl.withdraw();
bankCustomerImpl.getBalance();
bankCustomerImpl.getCheck();
bankCustomerImpl.getSpecialLoan();

}

}
 

interface  BankCustomer{
public int withdraw();// abstract method

public void getBalance();// abstract method

public void getCheck();// abstract method
}

interface  BankEmployee{

public void getSpecialLoan();// abstract method
}


class BankCustomerAndEmployeeImpl implements BankCustomer,BankEmployee{

public int withdraw(){
System.out.println("BankCustomerImpl withdraw()");
return 0;
}

public void getBalance(){
System.out.println("BankCustomerImpl getBalance()");

}

public void getSpecialLoan(){
System.out.println("BankCustomerImpl getSpecialLoan()");

}

public void getCheck(){
System.out.println("BankCustomerImpl getCheck()");
}
}