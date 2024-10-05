package java8;


interface ParentA {

    void get();

    default void display() {
        System.out.println("i am Parent A");
    }
    default void display1() {
        System.out.println("i am Parent A 2");
    }

    static void printA() {
        System.out.println("i am Parent A Static Method");
    }
}

interface ParentB {
    default void display() {
        System.out.println("i am Parent B");
    }

    static void printA() {
        System.out.println("i am Parent B Static Method");
    }
}

 class AbstractD implements ParentA {
     @Override
     public void get() {

     }
 }

 class AbstractF implements ParentA {
     @Override
     public void get() {

     }
 }

class Child implements ParentB, ParentA {
    @Override
    public void get() {
        System.out.println("i am Child Get Method");
    }

    @Override
    public void display() {

        ParentB.super.display();
    }

}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        //ParentA.printA();
    }
}
