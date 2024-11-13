import java.util.*;
import java.util.ArrayList;
class Test33 {
    String name;
    int age;
    String college;
    String course;
    String address;
    Test33
    (String name, int age, String college, String course, String address)
    {
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.address = address;
    }
public static void main(String[] args)
    {
        Test33 b = 
        new Test33("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu");
        System.out.println(b);
        String s = new String("Gulpreet Kaur");
        System.out.println(s);
        Integer i = new Integer(21);
        System.out.println(i);
        ArrayList l = new ArrayList();
        l.add("BIT");
        l.add("M.TECH");
        System.out.println(l);
    }
}