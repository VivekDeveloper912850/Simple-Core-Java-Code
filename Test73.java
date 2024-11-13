interface I1 {
    public static final int a = 10;

    public abstract void m1();
}

interface I2 {
    int b = 20;

    void m2();
}

interface I3 extends I1, I2 {
    public final int x = 88;

    abstract void m3();

    // int m11();
}

interface I4 {
    public int c = 30;

    void m4();
}

interface I5 {
    static int d = 40;

    void m5();
}

interface I6 extends I4, I5 {
    public final int x = 99;

    abstract void m3();

    // void m11();
}

class Hello implements I3, I6 {
    public void m1() {
        System.out.println("m1() in Hello");
    }

    public void m2() {
        System.out.println("m2() in Hello");
    }

    public void m4() {
        System.out.println("m4() in Hello");
    }

    public void m5() {
        System.out.println("m5() in Hello");
    }

    public void m3() {
        System.out.println("m3() in Hello");
    }

   /* public void m11() {
        //not allowed
    }*/

    void show() {
        System.out.println("show() in Hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // System.out.println(x);//The field x is anbiguous
        System.out.println(I3.x);
        System.out.println(I6.x);

    }


}

public class Test73 {
    public static void main(String[] args) {
        I3 i3 = null;
        I6 i6 = null;
        i3 = new Hello();
        i6 = new Hello();
        i3.m1();
        i3.m2();
        i3.m3();
        // i3.m4();
        //i6.m1();
        i6.m4();
        i6.m5();
        i6.m3();
        Hello h2 = new Hello();
        h2.show();
    }
}
