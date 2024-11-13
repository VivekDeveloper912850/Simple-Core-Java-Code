interface I1 {
    int a = 10;
    static int b = 20;

    /* {
         not allowed
     }
     static{
     }
     void m1(){
     }
     final void show(){
     }
     static void show(){
     }
     */
    void showAll();

    void showAll1();
}

abstract class Hello implements I1 {
    public void showAll() {
        System.out.println("show() in Hello");
    }

    abstract void HelloShow();
}

class Hai extends Hello {
    public void showAll1() {
        System.out.println("showAll1() in Hai");
    }

    void HelloShow() {
        System.out.println("HelloShow in Hai");
    }
}

public class Test74 {
    public static void main(String[] args) {
        I1 i1 = new Hai();
        i1.showAll();
        i1.showAll1();
        //i1.HelloShow();
        Hai hai = new Hai();
        hai.HelloShow();

    }
}

