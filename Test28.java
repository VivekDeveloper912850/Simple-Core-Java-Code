// Java program to demonstrate that assignment operator
// only creates a new reference to same object
import java.io.*;
 
// A test class whose objects are cloned
class Test28 {
    int x, y;
    Test28()
    {
        x = 10;
        y = 20;
    }
}
 
// Driver Class
class Main {
    public static void main(String[] args)
    {
        Test28 ob1 = new Test28();
 
        System.out.println(ob1.x + " " + ob1.y);
 
        // Creating a new reference variable ob2
        // pointing to same address as ob1
        Test28 ob2 = ob1;
 
        // Any change made in ob2 will
        // be reflected in ob1
        ob2.x = 100;
 
        System.out.println(ob1.x + " " + ob1.y);
        System.out.println(ob2.x + " " + ob2.y);
    }
}