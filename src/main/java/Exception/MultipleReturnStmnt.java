package Exception;

public class MultipleReturnStmnt {
    public static void main(String[] args) {
        System.out.println(MultipleReturnStmnt.getIn());
    }

    public static  int getIn() {
        try {
            System.out.println("in try");
            return 1;
        } catch (Exception e) {
            System.out.println("in catch");
            return 2;
        } finally {
            System.out.println("in finally");
            return 3;
        }
    }
}
