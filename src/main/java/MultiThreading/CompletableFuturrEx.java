package MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturrEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        String name = null;

        CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> {
            if (name == null) {
                throw new RuntimeException("Computation error");
            }
            return "" + name;
        }).handle((s, t) -> s != null ? s : "Hello, Stranger!");

        System.out.println(future.get());


    }
}

class Singleton{
    private static Singleton singleton;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton== null){
            synchronized (Singleton.class){
                if(singleton== null){
                    singleton = new Singleton();
                }
            }

        }
        return  singleton;
    }
}

