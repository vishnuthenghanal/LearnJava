package NormalPgms;

public class AbstractClass {
    public static void main(String[] args) {
    }
}

abstract class Test extends  absClass {

    @Override
    void print() {
        System.out.println("Abstract Method");
    }
}

abstract class absClass{
    abstract void print();
    abstract void run2();

    void print(int x, int y) {
        System.out.println("In default method");
    }

    static void print(Long l) {

    }
}

abstract class absClass1{
    abstract void print();

    void print(int x, int y) {
        System.out.println("In default method");
    }

    static void print(Long l) {

    }
}
