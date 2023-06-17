package com.reactive.sec01;

import com.reactive.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Lec05MonoFromSupplier {
    public static void main(String[] args) {

        // use just only when you have dara already
        // Mono<String> mono = Mono.just(getName());

        Supplier<String> stringSupplier = () -> getName();
        Mono<String> mono = Mono.fromSupplier(stringSupplier);
        mono.subscribe(
                Util.onNext()
        );

        Callable<String> stringCallable = () -> getName();
        Mono.fromCallable(stringCallable)
                .subscribe(
                        Util.onNext()
                );
    }

    private static String getName(){
        System.out.println("Generating Name...");
        return Util.faker().name().fullName();
    }
}
