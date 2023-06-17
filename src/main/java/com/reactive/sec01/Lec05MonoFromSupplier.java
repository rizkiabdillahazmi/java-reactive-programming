package com.reactive.sec01;

import com.reactive.courseutil.Util;
import reactor.core.publisher.Mono;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Lec05MonoFromSupplier {
    public static void main(String[] args) {

        // use just only when you have dara already
        // Mono<String> mono = Mono.just(getName());

        Mono<String> mono = Mono.fromSupplier(Lec05MonoFromSupplier::getName);
        mono.subscribe(
                Util.onNext()
        );
    }

    private static String getName(){
        System.out.println("Generating Name...");
        return Util.faker().name().fullName();
    }
}
