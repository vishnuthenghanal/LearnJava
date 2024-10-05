package DesignPatterns;

public class SingleTonDesignPattern {

    public static void main(String[] args) {
        Runnable t1 = () -> {
            Singleton firstInstance = Singleton.getInstance();
            System.out.println("FIRST : " + firstInstance.hashCode());
        };

        Runnable t2 = new Runnable() {
            public void run() {
                Singleton secondInstance = Singleton.getInstance();
                System.out.println("SECOND : " + secondInstance.hashCode());

            }
        };

        Runnable t3 = new Runnable() {
            @Override
            public void run() {
                Singleton thirdInstance = Singleton.getInstance();
                System.out.println("THIRD : " + thirdInstance.hashCode());
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();


        System.out.println(EnumSingleton.INSTANCE.hashCode() == EnumSingleton.INSTANCE.hashCode());
    }

}

class Singleton {
    private static Singleton singletonInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }
}



