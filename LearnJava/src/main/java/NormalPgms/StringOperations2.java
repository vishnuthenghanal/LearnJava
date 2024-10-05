package NormalPgms;

public class StringOperations2 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");
        StringBuilder str4 = new StringBuilder("ABC");
        StringBuffer str5 = new StringBuffer("ABC");

        System.out.println("CASE 1 : str1.equals(str2) : " + str1.equals(str2));
        System.out.println("CASE 2 : str1 == str2 : " + str1==str2);
        System.out.println(str1.equals(str4));
        //System.out.println(str1==str4);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
