package NormalPgms;
//Capgemny
public class StringOperation {
    public static void main(String[] args) {
        String input = "hello my name is (rita mishra(ritaz)";
        String output = input.replaceFirst("\\(([^()]*).*", "($1");
        System.out.println(output);
    }
}
