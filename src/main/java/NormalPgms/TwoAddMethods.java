package NormalPgms;

public class TwoAddMethods {
    public static void main(String[] args) {
        Add add = new Add();
        add.add(10L, 10);
    }


}

class Add{
    public void add(Integer A, Long B){
        System.out.println("1");
    }

    public void add(Long B, Integer A){
        System.out.println("2");
    }
}
