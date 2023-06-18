package com.reactive.sec02;

import reactor.core.publisher.Flux;

/**
 * Created by Rizki Abdillah Azmi on 18-Jun-23
 */
public class Lec02MultipleSubscribers {
    public static void main(String[] args) {

        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4, 5, 6);

        Flux<Integer> evenFlux = integerFlux.filter(i -> i % 2 == 0);

        integerFlux.subscribe(i -> System.out.println("Sub 1 : " + i));

        evenFlux.subscribe(i -> System.out.println("Sub 2 : " + i));
    }
}
