interface I1 {
    void m1();
}

interface I2 extends I1 {
    void m2();

    void m3();
}

class Hello implements I2 {
    public void m1() {
        System.out.println("m1() in Hello");
    }

    public void m2() {
        System.out.println("m2() in Hello");
    }

    public void m3() {
        System.out.println("m3() in Hello");
    }

    public void m4() {
        System.out.println("m4() in Hello");
    }
}

interface I3 {
    I1 m11();

    I2 m22(I1 i1);

    I2 m33(Hello h);
}

class INTER_Test implements I3 {
 /*   public I1 m11() {
        System.out.println("m11() in INTER_Test");
        return new Hello();
    }*/

    public I2 m11() {
        System.out.println("m11 in Inter_Test");
        return new Hello();
    }

    public I2 m22(I1 i1) {
        System.out.println("m22(I1 i1) in Inter_Test");
        return (I2) i1;
    }

    public I2 m33(Hello h) {
        System.out.println("m33(Hello h) in Inter_Test");
        return h;
    }
}

public class Test75 {
    public static void main(String[] args) {
        I3 i3 = null;
        i3 = new INTER_Test();
        I1 i1 = i3.m11();
        i1.m1();
        //  i1.m2();
        // i1.m3();
        I2 i2 = i3.m22(new Hello());
        i2.m1();
        i2.m2();
        i2.m3();
        //i2.m4();
    }
}
