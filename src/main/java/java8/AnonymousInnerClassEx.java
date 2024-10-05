package java8;

interface Operations {
    public void doSurgery();
}

class AbcHospital implements Operations{

    @Override
    public void doSurgery() {
        System.out.println("Doing Abc Hospital Surgery !!");
    }
}

public class AnonymousInnerClassEx {
    public static void main(String[] args) {
        Operations operations = new AbcHospital();
        operations.doSurgery();

        Operations operations1 = new Operations() {
            @Override
            public void doSurgery() {

            }
        };
    }
}
