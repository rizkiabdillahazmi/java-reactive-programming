package com.reactive.sec01;

import java.util.stream.Stream;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Lec01Stream {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1)
                .map(i -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return i * 2;
                })
                ;
//        System.out.println(stream);
        stream.forEach(System.out::println);
    }

}
