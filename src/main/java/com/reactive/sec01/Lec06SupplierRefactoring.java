package com.reactive.sec01;

import com.reactive.courseutil.Util;
import reactor.core.publisher.Mono;

/**
 * Created by Rizki Abdillah Azmi on 17-Jun-23
 */
public class Lec06SupplierRefactoring {

    public static void main(String[] args) {

        getName();
        getName()
                .subscribe(Util.onNext());
        getName();

    }

    private static Mono<String> getName(){
        System.out.println("Entered the method");
        return Mono.fromSupplier(()->{
            System.out.println("Generating Name...");
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }

}
