package NormalPgms;

public class InterfaceExample {
    public static void main(String[] args) {
        InterfaceEx1 interfaceEx1 =  new InterfaceEx1();
        interfaceEx1.print();
    }
}

class InterfaceEx1 implements InterfaceEx{
    @Override
    public void print() {
        System.out.println("Test");
    }

    @Override
    public void print(String s) {

    }

    @Override
    public void print(int x) {
        InterfaceEx.super.print(x);
    }

    @Override
    public void print(int x, int y) {
        InterfaceEx.super.print(x, y);
    }

}

interface InterfaceEx{
    void print() ;
    void print(String s) ;

    default void print(int x) {
        System.out.println("In default method 1");
    }

    default void print(int x, int y) {
        System.out.println("In default method");
    }

    static void print(Long l) {

    }

    static void print(Long l, String s) {

    }
}


interface Interface1 {

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void print(String str){
        System.out.println("I1 logging::"+str);
    }
}
interface Interface2 {

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }
    static void print(String str){
        System.out.println("I2 logging::"+str);
    }
}

class MyClass implements Interface1, Interface2 {
    /**
     * @param str
     */
    @Override
    public void log(String str) {
        Interface1.super.log(str);
    }


    static void print(String str){
        Interface1.print("print");
    }

   /* @Override
    public void log(String str){
        Interface1.super.log(str);
    }*/
   public static void main(String[] args) {
       MyClass myClass = new MyClass();
       myClass.log("test");
       MyClass.print("");

   }

}
