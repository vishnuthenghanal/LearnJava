package StringOperationsInTraditional;

class parent1{
    void get(){
        System.out.println("1");
    }
}

class parent2{
    void get(){
        System.out.println("2");
    }
}

class cild2 extends parent1{

}


public class ReverseString {
    public static void main(String[] args) {
        String str = "ABC";

        char [] charArray = str.toCharArray();
        String revString = "";
        for(int i = charArray.length-1; i >= 0; i--){
            revString = revString + charArray[i];
        }
        System.out.println(revString);
    }
}
