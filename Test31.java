// Java program to illustrate
// working of toString() method
class Test31 {
    String name;
    int age;
    String college;
    String course;
    String address;
    Test31
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
        Test31 b = 
        new Test31("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu");
        System.out.println(b);
        System.out.println(b.toString());
    }
}