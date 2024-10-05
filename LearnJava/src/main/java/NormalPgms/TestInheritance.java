package NormalPgms;

// Capgemny
public class TestInheritance {
    public static void main(String[] args) {
       Parent p = new Child();
       p.test();

    }
}

class Parent{
     static  void test(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
     static void test(){
        System.out.println("Child");
    }
}
