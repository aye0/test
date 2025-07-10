package com.ecommerce.utils;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    public static String generateId(){
        String id="id1010";
        System.out.println(id);
        return id;
    }
    //方法类都需要写static，才能在非实例化的情况下被调用。否则想被调用要先创建Utils对象
}
