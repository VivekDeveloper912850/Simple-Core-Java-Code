class Animal1// super class or parent class
{
protected int a=30;

public void m(){

} 

public Animal(Test t){
System.out.println("in Animal(int a) parameterized constructor: 	" + t);// 4
}

public Animal(){
System.out.println("in Animal() default constructor");// 4
}

}


class Dog extends Animal{ // subclass or child class

public void m(){
System.out.println(a);// 4 super=new Animal();
} 

public Dog(Dog dog){
super(new Test());
}


public Dog(){}

}


 class Test{

public static void main(String [] args)
{
System.out.println("in Test class");//1
Dog dog=new Dog(new Dog());
dog.m();
} 


}