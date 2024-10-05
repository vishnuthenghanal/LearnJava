package NormalPgms;

public class ImmutableDemo {
    public static void main(String ar[]) {
        Immutable e = new Immutable("ABC123");
        String s1 = e.getValue();
        System.out.println("Pancard Number: " + s1);
    }
}
