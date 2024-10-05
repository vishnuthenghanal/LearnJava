package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Apple {
    private void repair(int cost) {
        System.out.println("Repairing..." + cost);
    }
}


final class Product {

    private String pName;

    Product() {

    }

    Product(String pName) {
        this.pName = pName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }


}

class OderExcption extends Exception{
    public  OderExcption(String msg){
        super(msg);
    }
}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*Class<?> c = Class.forName("org.example.Apple");
        Apple apple = (Apple) c.newInstance();
        Apple apple1 = (Apple) c.newInstance();

        Method m = c.getDeclaredMethod("repair", int.class);
        m.setAccessible(true);
        m.invoke(apple, 30);*/

        Class<?> c = Class.forName("org.example.Product");
        Product p = (Product) c.newInstance();


        p.setpName("Test");
        System.out.println(p.getpName());

        System.out.println(c.getConstructors().length);

        Constructor<?>[] constructors = c.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("Fields : " + field);
        }

        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Methods : " + method);
        }


    }
}