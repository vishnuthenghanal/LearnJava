package NormalPgms;

public class WhichMethodGetCalled {

    public void test(Integer i){
        System.out.println("Integer Method Called");
    }

    public void test(String s){
        System.out.println("String Method Called");
    }

    public void test(Object o){
        System.out.println("Object Method Called");
    }

    public static void main(String[] args) {

        WhichMethodGetCalled whichMethodGetCalled = new WhichMethodGetCalled();
        whichMethodGetCalled.test((Object) null);

    }
}
