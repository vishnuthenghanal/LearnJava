package NormalPgms;


// Capgemny
public class NormalPgms {
    public static void main(String[] args) throws Exception {
        A.method();
        // Output will be :
        // block 1
        //block 3
    }
}

class A {
    public static void method() throws Exception {
        Integer a = 20, b = 10;
        Integer c = 200, d = 100;
        try {
            System.out.println("block 1");
            if (a > b) // 20 > 10
                throw new Exception();
            System.out.println("block 2");
        } catch (Exception e) {
        }

        try {
            System.out.println("block 3");
            if (c > d) // 200>100
                throw new Exception();
            System.out.println("block 4");
        } catch (Exception e) {
        }
    }
}



