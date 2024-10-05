package Exception;

public class TestException {
    public static void main(String[] args) throws Exception {
        //TestException.method();
        StringBuffer sf = new StringBuffer("abcd");
        StringBuffer sf1= sf.append("efg");
        System.out.println(sf.equals(sf1));

        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);

        s2 = s1.intern();
        String s = new String("5");
        System.out.println(1 + 10 + s + 2 + 10 + 34 );
    }

    public static void method() throws Exception {
        Integer a = 20, b = 10;
        Integer c = 200, d = 100;
        try {
            System.out.println("block 1");
            if (a > b)
                throw new Exception();
            System.out.println("block 2");
        } catch (Exception e) {
        }

        try {
            System.out.println("block 3");
            if (c > d)
                throw new Exception();
            System.out.println("block 4");
        } catch (Exception e) {
        }
    }

}
