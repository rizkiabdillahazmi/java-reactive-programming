package com.reactive.sec01;

import reactor.core.publisher.Mono;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Lec02MonoJust {
    public static void main(String[] args) {

        // Publisher
        Mono<Integer> mono = Mono.just(1);

        System.out.println(mono);

        mono.subscribe(i -> System.out.println("Received : " + i));
    }
}
