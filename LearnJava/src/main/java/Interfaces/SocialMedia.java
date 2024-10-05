package Interfaces;

public interface SocialMedia {
    default void print() {
        System.out.println("Print");
    }

    default void print(String a) {
        System.out.println("Print");
    }

    static void sing(){

    }

    static void sing(String a){
    }

    void delete();


}
