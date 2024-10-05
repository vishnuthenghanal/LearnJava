package NormalPgms;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCDE";
        char[] charArray = str.toCharArray();
        String revString = "";
        for (int i = charArray.length-1; i >= 0; i--) {
            revString = revString + charArray[i];
        }
        System.out.println(revString);
    }
}
