class Test77
{
     public static void main(String [] args)
      {
        BankCustomer hello=new BankCustomer(10);
        BankCustomer hello1=new BankCustomer(10);

        String s=new String("Hello world");
        Object o=new BankCustomer();
        //System.out.println(hello.getClass());//class Hello
        //System.out.println(o.getClass());//class Hello
        System.out.println(hello.hashCode());//10
        System.out.println(hello1.hashCode());//10
        System.out.println(hello.hashCode());//

        System.out.println(o.hashCode());//class Hello
        //System.out.println(hello.equals(s));//false
        
        System.out.println("hello: " + hello + " hello1: " + hello1);
        System.out.println(hello.equals(hello1));//true
      } 
}
 

class BankCustomer{//extends Object
int id;

BankCustomer(){}

BankCustomer(int id){
this.id=id;
} 

public boolean equals(Object obj) {
BankCustomer bankCustomer =(BankCustomer)obj;
return (this.id == bankCustomer.id);// false 10==20
}

public int hashCode(){
if(this.hashCode(hello) == this.hashCode(hello))
{
return 1;
}else{
return super.hashCode();
}
} 

}