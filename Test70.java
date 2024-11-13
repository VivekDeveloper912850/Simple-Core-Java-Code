abstract class Animal {
    abstract public void eating();

    abstract public void sleeping();
}

abstract class Dog extends Animal {
    public void eating() {
        System.out.println("Dog is eating");
    }
}

class MyDog extends Dog {
    public void sleeping() {
        System.out.println("MyDog is sleeping");
    }
}

abstract class Cat extends Animal {
    public void eating() {
        System.out.println("Cat is eating");
    }

    public void sleeping() {
        System.out.println("Cat is sleeping");
    }
}

class MyCat extends Cat {

}

class AnimalFactory {
    public static final int dog = 1;
    public static final int cat = 2;

    static Animal getAnimal(int a) {
        Animal ani = null;
        if (a == 1) {
            ani = new MyDog();
        } else if (a == 2) {
            ani = new MyCat();
        }
        return ani;
    }
}

class Test70 {
    public static void main(String[] args) {
        //Animal ani=new Animal();
       // Animal ani1 = null;
       Animal ani1 = AnimalFactory.getAnimal(1);
        show(ani1);
        Animal ani2 = AnimalFactory.getAnimal(2);
        show(ani2);
    }

    static void show(Animal ani) {
        ani.eating();
        ani.sleeping();
    }
}

