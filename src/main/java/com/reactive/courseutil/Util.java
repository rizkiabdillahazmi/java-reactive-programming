package com.reactive.courseutil;

import com.github.javafaker.Faker;

import java.util.function.Consumer;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Util {

    private static final Faker FAKER = Faker.instance();

    public static Consumer<Object> onNext(){
        return o -> System.out.println("Received : " + o);
    }

    public static Consumer<Throwable> onError(){
        return e -> System.out.println("Error : " + e.getMessage());
    }

    public static Runnable onCompleted(){
        return () -> System.out.println("Completed");
    }

    public static Faker faker(){
        return FAKER;
    }
}
