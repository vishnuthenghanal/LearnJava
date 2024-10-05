package java8;

public class functionalInterface  {
}

@FunctionalInterface
interface A{
    void m1();
}

@FunctionalInterface
interface B {
    void m2();
}

//@FunctionalInterface
interface c extends  A, B {
    void m2();
}


//
